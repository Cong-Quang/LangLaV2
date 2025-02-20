package com.ferracestudio.ninjavillage;

import beatdz.*;
import beatdz2.*;
import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.TextInputListener;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.boot.GameM;
import com.ferracestudio.ninjavillage.handler.InputDialogHandler;
import com.ferracestudio.ninjavillage.handler.MyCrashHandler;
import com.listener.AppEventListener;
import com.listener.IDialogTextListener;
import com.listener.VoiceRecordPermissionCallback;
import com.tgame.model.Caption;
import org.lwjgl.opengl.Display;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Port.Info;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.lang.management.ManagementFactory;
import java.util.Vector;

public class DesktopLauncher implements AppEventListener, IDialogTextListener {

    private static JDialog a;
    private static DesktopLauncher b;
    private static Vector c = new Vector();
    private static LwjglApplicationConfiguration config;
    private static String e = "animesoft/";

    public native int set(byte[] var1);

    public native byte[] jc(byte[] var1);

    public static void main(String[] var0) {
        b = new DesktopLauncher();
        Thread.setDefaultUncaughtExceptionHandler(new MyCrashHandler(b));

        try {
            config = new LwjglApplicationConfiguration();
            GameM.a((IDialogTextListener) (b));
            short[] sc = getSC();
            config.width = sc[0];
            config.height = sc[1];
            config.addIcon("C:\\LangLa\\resource\\4.png", FileType.Internal);
            config.addIcon("C:\\LangLa\\resource\\5.png", FileType.Internal);
            config.addIcon("C:\\LangLa\\resource\\6.png", FileType.Internal);
            config.title = "Đại Chiến Làng Lá";
            config.resizable = false;
            GameM.b(b);
            new LwjglApplication(GameM.l(), config);
            Gdx.graphics.setWindowedMode(sc[0], sc[1]);
            Caption.loadVN();
        } catch (Exception var5) {
            b.a("Thông Báo", "Rất tiếc! Máy tính của bạn cần hổ trợ tối thiểu phiên bản OpenGL 2.0 trở lên để chơi được Làng Lá - Hoá Giải Huyết Thù.");
        }
    }

    private static short[] getSC() {
        DataInputStream var0 = null;
        FileInputStream var1 = null;
        boolean var13 = false;

        label166:
        {
            short[] var26;
            label173:
            {
                try {
                    var13 = true;
                    String var2 = System.getProperty("user.home") + "\\" + e.replace("/", "\\") + "arr_sc.bin";
                    File var24;
                    if (!(var24 = new File(var2)).exists()) {
                        var13 = false;
                        break label166;
                    }

                    var1 = new FileInputStream(var24);
                    byte[] var25 = new byte[(int) var24.length()];
                    var1.read(var25, 0, var25.length);
                    var0 = new DataInputStream(new ByteArrayInputStream(var25));
                    var26 = new short[]{var0.readShort(), var0.readShort()};
                    var13 = false;
                    break label173;
                } catch (Exception var22) {
                    var13 = false;
                } finally {
                    if (var13) {
                        try {
                            if (var0 != null) {
                                var0.close();
                            }
                        } catch (IOException var15) {
                        }

                        try {
                            if (var1 != null) {
                                var1.close();
                            }
                        } catch (Exception var14) {
                        }

                    }
                }

                try {
                    if (var0 != null) {
                        var0.close();
                    }
                } catch (IOException var19) {
                }

                try {
                    if (var1 != null) {
                        var1.close();
                        return new short[]{1024, 600};
                    }
                } catch (Exception var18) {
                }

                return new short[]{1024, 600};
            }

            try {
                var0.close();
            } catch (IOException var17) {
            }

            try {
                var1.close();
            } catch (Exception var16) {
            }

            return var26;
        }

        try {
            if (var0 != null) {
                var0.close();
            }
        } catch (IOException var21) {
        }

        try {
            if (var1 != null) {
                var1.close();
            }
        } catch (Exception var20) {
        }

        return new short[]{1024, 600};
    }

    public void a() {
    }

    public void a(VoiceRecordPermissionCallback var1) {
        var1.a();
    }

    public boolean b() {
        try {
            return AudioSystem.isLineSupported(Info.MICROPHONE);
        } catch (Exception var1) {
            return false;
        }
    }

    public void a(byte[] var1) {
        this.set(var1);
    }

    public byte[] b(byte[] var1) {
        return this.jc(var1);
    }

    
    public void a(TextInputListener var1, String var2, String var3, String var4) {
        if (a != null) {
            a.setVisible(false);
            a.setEnabled(true);
        }

        SwingUtilities.invokeLater(new InputDialogHandler(a, var1, var2, var3, var4));
    }

    public int a(String var1, String var2) {
        ImageIcon var3 = new ImageIcon("5.png");
        JOptionPane var5;
        (a = (var5 = new JOptionPane(var2, 0, -1, var3, (Object[]) null, (Object) null)).createDialog((Component) null, var1)).setAlwaysOnTop(true);
        a.setVisible(true);
        a.dispose();

        try {
            return Integer.parseInt(var5.getValue().toString());
        } catch (Exception var4) {
            return -1;
        }
    }

    public boolean c() {
        return !Display.isVisible();
    }
}
