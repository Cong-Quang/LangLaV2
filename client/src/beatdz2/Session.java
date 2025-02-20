package beatdz2;

import beatdz.*;

import beatdz2.DataCenter;
import java.io.IOException;
import java.util.Vector;

public class Session {

    private long s;
    public boolean isConnected;
    public boolean isConnecting;
    public mSocket socket;
    public Writer writer;
    public Reader reader;
    public Vector vMessage = new Vector();
    public Object lockSendMessage = new Object();
    public Object lockTimeOut = new Object();
    public int countRecv;
    public int countSend;
    public int k;
    public IMessageHandler handler;
    private static Session instance;
    private short u = -1;
    public String keyApp;
    public boolean waitThreadSend;
    public boolean waitThreadRecv;
    private Thread threadSendTypeClient;
    private Thread threadWaitTimeOut;
    public Thread threadSendMessage;
    public Thread threadRecvMessage;
    public static int r;

    public static Session gI() {
        if (instance == null) {
            instance = new Session();
        }

        return instance;
    }

    public void connect(String var1, int var2) {
        try {
            this.waitThreadSend = this.waitThreadRecv = true;
            ++DataCenter.aQ;
            this.s = Utlis.time();
            this.isConnecting = this.isConnected = true;
            this.vMessage.removeAllElements();
            this.createThreadSendMessage();
            this.createThreadRecvMessage();
            this.createThreadSendTypeClient(var1, var2);
            this.createThreadWaitTimeOut();

            for (int var4 = 0; var4 < 50 && this.waitThreadSend && this.waitThreadRecv; ++var4) {
                Utlis.sleep(100L);
            }

        } catch (Exception var3) {
            Utlis.println(var3);
        }
    }

    private void createThreadSendTypeClient(String var1, int var2) {
        this.threadSendTypeClient = new Thread(new RSendTypeClient(this, var1, var2));
        this.threadSendTypeClient.start();
    }

    private void createThreadWaitTimeOut() {
        this.threadWaitTimeOut = new Thread(new RWaitTimeOut(this));
        this.threadWaitTimeOut.start();
    }

    private void createThreadSendMessage() {
        this.threadSendMessage = new Thread(new RSendMessage(this));
        this.threadSendMessage.start();
    }

    private void createThreadRecvMessage() {
        this.threadRecvMessage = new TRecvMessage(this);
        this.threadRecvMessage.start();
    }

    private void read(Reader var1, boolean var2) throws IOException {
        byte var3 = var1.dis.readByte();
        byte var5 = 0;
        short var6 = 0;
        int var4;
        switch (var3) {
            case -128:
                var3 = var1.dis.readByte();
                var4 = var1.dis.readInt();
                break;
            case -86:
                this.vMessage.clear();
                gI().close();
                DataCenter.gI().setScreen((MainScreen) LoginPCScreen.getScreenLogin());
                return;
            case -84:
                GameSrc.gI().a(var1.dis.readInt(), var1.dis.readShort(), var1.dis.readShort(), true);
                return;
            case -80:
                var5 = var1.dis.readByte();
                var4 = var1.dis.readShort();
                break;
            case -79:
                var6 = var1.dis.readShort();
                var4 = var1.dis.readShort();
                break;
            case 123:
                GameSrc.gI().a(var1.dis.readInt(), var1.dis.readShort(), var1.dis.readShort(), false);
                return;
            default:
                var4 = var1.dis.readUnsignedShort();
        }

        byte[] var7 = new byte[var4];
        int var10;
        if (var2) {
            var1.read(var7, 0, var7.length);
        } else {
            var10 = 0;

            while (var4 > 0) {
                int var8;
                if (var4 - 2048 <= 0) {
                    var8 = var4;
                } else {
                    var8 = 2048;
                }

                int var9;
                if ((var9 = this.socket.a.available()) == 0) {
                    Utlis.sleep(1L);
                } else {
                    if (var8 > var9) {
                        var8 = var9;
                    }

                    var1.read(var7, var10, var8);
                    var10 += var8;
                    this.countRecv += var8;
                    var4 -= var8;
                }
            }
        }

        if (var3 != -79) {
            if (var3 != -80 && var3 != -128) {
                this.read(new Message(var3, var7));
            } else {
                this.read(new Message(var5, Utlis.inflateByteArray(var7)));
            }
        } else {
            var1 = new Reader(Utlis.inflateByteArray(var7));

            for (var10 = 0; var10 < var6; ++var10) {
                this.read(var1, true);
            }

            var1.close();
        }
    }

    private void read(Message var1) {
        try {
            if (var1.cmd == -112) {
                var1.cmd = var1.readByte();
                this.read2(var1);
                return;
            } else {
                if (var1.cmd == -111) {
                    var1.cmd = var1.readByte();
                    this.read3(var1);
                } else {
                    this.handler.a(var1);
                }

                return;
            }
        } catch (Exception var5) {var5.printStackTrace();
        } finally {
            var1.close();
        }

    }

    public void sendMessage(Message var1) {
        if (this.isConnected) {
            this.vMessage.addElement(var1.getData(this.keyApp));
            synchronized (this.lockSendMessage) {
                this.lockSendMessage.notify();
            }
        }
    }

    public void close() {
        try {
            if (this.isConnecting) {
                this.handler.b();
            } else if (this.isConnected) {
                this.handler.c();
            }

            this.isConnected = false;
            this.isConnecting = false;
            this.vMessage.removeAllElements();
            if (this.writer != null) {
                this.writer.close();
                this.writer = null;
            }

            if (this.reader != null) {
                this.reader.close();
                this.reader = null;
            }

            if (this.socket != null) {
                this.socket.c();
                this.socket = null;
            }

            synchronized (this.lockSendMessage) {
                this.lockSendMessage.notify();
            }

            try {
                if (this.threadSendTypeClient != null) {
                    this.threadSendTypeClient.interrupt();
                    this.threadSendTypeClient = null;
                }
            } catch (Exception var6) {
            }

            try {
                if (this.threadWaitTimeOut != null) {
                    this.threadWaitTimeOut.interrupt();
                    this.threadWaitTimeOut = null;
                }
            } catch (Exception var5) {
            }

            try {
                if (this.threadSendMessage != null) {
                    this.threadSendMessage.interrupt();
                    this.threadSendMessage = null;
                }
            } catch (Exception var4) {
            }

            try {
                if (this.threadRecvMessage != null) {
                    this.threadRecvMessage.interrupt();
                    this.threadRecvMessage = null;
                }
            } catch (Exception var3) {
                return;
            }
        } catch (Exception var8) {
            Utlis.println(var8);
        }

    }

    private void read2(Message var1) throws IOException {
        switch (var1.cmd) {
            case 5:
                if (!DataCenter.gI().aJ) {
                    Message.e((byte) 13).send();
                } else {
                    a((byte) 0, "font_", var1);
                }

                Message.f((byte) 5).send();
                return;
            case 6:
                if (!DataCenter.gI().aK) {
                    Message.e((byte) 14).send();
                } else {
                    a((byte) 1, "mapmini_", var1);
                }

                Message.f((byte) 6).send();
                return;
            case 7:
                if (!DataCenter.gI().aL) {
                    Message.e((byte) 15).send();
                } else {
                    a((byte) 2, "client_", var1);
                }

                Message.f((byte) 6).send();
                return;
            case 8:
                if (!DataCenter.gI().aM) {
                    Message.e((byte) 16).send();
                } else {
                    a((byte) 3, "char_", var1);
                }

                Message.f((byte) 6).send();
                return;
            case 9:
                if (!DataCenter.gI().aN) {
                    Message.e((byte) 17).send();
                } else {
                    b((byte) 4, "tree_", var1);
                }

                Message.f((byte) 6).send();
                return;
            case 10:
            default:
                return;
            case 11:
                return;
            case 12:
        }
    }

    private void read3(Message var1) throws IOException {
        switch (var1.cmd) {
            case 0:
            case 2:
            case 6:
            default:
                break;
            case 1:
                Binary.write("tree_" + var1.readShort(), Binary.b(var1.readUTF()));
                break;
            case 3:
                Binary.write("arr_map_" + var1.readShort(), var1.reader.readFully());
                break;
            case 4:
                GameSrc.gI().createMap();
                break;
            case 5:
                mFont.a();
        }

        GameSrc.gI().f();
    }

    public boolean isConnected() {
        return this.isConnected && !this.isConnecting;
    }

    public String d() {
        int var1 = this.countRecv / 1024;
        return var1 / 1024 + "." + var1 % 1024 / 102 + "MB";
    }

    private static void a(byte var0, String var1, Message var2) throws IOException {
        short var3 = var2.readShort();

        for (int var5 = 0; var5 < var3; ++var5) {
            int var4 = var2.readInt();

            try {
                byte[] var6;
                if ((var6 = Binary.read(var1 + var5)) == null || var4 != var6.length) {
                    Message var8;
                    (var8 = Message.e(var0)).writeShort(var5);
                    var8.send();
                }
            } catch (Exception var7) {
                Utlis.println(var7);
            }
        }

    }

    private static void b(byte var0, String var1, Message var2) throws IOException {
        short var8 = var2.readShort();

        for (int var4 = 0; var4 < var8; ++var4) {
            short var5 = var2.readShort();
            int var3 = var2.readInt();

            try {
                byte[] var6;
                if ((var6 = Binary.read(var1 + var5)) == null || var3 != var6.length) {
                    Message var9;
                    (var9 = Message.e((byte) 4)).writeShort(var5);
                    var9.send();
                }
            } catch (Exception var7) {
                Utlis.println(var7);
            }
        }

    }

    public void sendCharXYWhenMove(short var1, short var2) {
        try {
            if (r <= 0) {
                Writer var3;
                (var3 = new Writer()).writeByte(123);
                var3.writeShort(var1);
                var3.writeShort(var2);
                this.vMessage.add(var3.baos.toByteArray());
                synchronized (this.lockSendMessage) {
                    this.lockSendMessage.notify();
                }

                var3.close();
            }
        } catch (Exception var5) {
        }
    }

    public void sendCharXWhenMove(int var1) {
        try {
            if (r <= 0) {
                Writer var2;
                (var2 = new Writer()).writeByte(125);
                var2.writeByte(var1);
                this.vMessage.add(var2.baos.toByteArray());
                synchronized (this.lockSendMessage) {
                    this.lockSendMessage.notify();
                }

                var2.close();
            }
        } catch (Exception var4) {
        }
    }

    public void sendCharYWhenMove(int var1) {
        try {
            if (r <= 0) {
                Writer var2;
                (var2 = new Writer()).writeByte(124);
                var2.writeByte(var1);
                this.vMessage.add(var2.baos.toByteArray());
                synchronized (this.lockSendMessage) {
                    this.lockSendMessage.notify();
                }

                var2.close();
            }
        } catch (Exception var4) {
        }
    }

    public void sendCharXY(short var1, short var2) {
        try {
            if (r <= 0) {
                Writer var3;
                (var3 = new Writer()).writeByte(-84);
                var3.writeShort(var1);
                var3.writeShort(var2);
                this.vMessage.add(var3.baos.toByteArray());
                synchronized (this.lockSendMessage) {
                    this.lockSendMessage.notify();
                }

                var3.close();
            }
        } catch (Exception var5) {
        }
    }

    public void sendCharX(int var1) {
        try {
            if (r <= 0) {
                Writer var2;
                (var2 = new Writer()).writeByte(-82);
                var2.writeByte(var1);
                this.vMessage.add(var2.baos.toByteArray());
                synchronized (this.lockSendMessage) {
                    this.lockSendMessage.notify();
                }

                var2.close();
            }
        } catch (Exception var4) {
        }
    }

    public void sendCharY(int var1) {
        try {
            if (r <= 0) {
                Writer var2;
                (var2 = new Writer()).writeByte(-83);
                var2.writeByte(var1);
                this.vMessage.add(var2.baos.toByteArray());
                synchronized (this.lockSendMessage) {
                    this.lockSendMessage.notify();
                }

                var2.close();
            }
        } catch (Exception var4) {
        }
    }

   public   static void a(Session var0, String var1) throws IOException {
        Message var2;
        (var2 = new Message((byte) -127)).writeUTF(var0.keyApp);
        var2.write(var1.getBytes("UTF-8"));
        var0.vMessage.insertElementAt(var2.getData(var0.keyApp), 0);
    }

     public  static void a(Session var0, Reader var1, boolean var2) throws IOException {
        var0.read(var1, false);
    }
}
