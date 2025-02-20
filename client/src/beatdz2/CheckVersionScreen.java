package beatdz2;

import beatdz.*;

import beatdz2.DataCenter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Application.ApplicationType;
import com.tgame.model.Caption;
import java.io.File;
import java.util.Vector;

public class CheckVersionScreen extends ScreenLogin {

    private mImage e = Binary2.a("f", (MainScreen) this);
    public LangLa_q a;
    private String f;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    private Vector g = new Vector();
    private long h;
    private boolean i = true;
    private boolean j = false;
    private boolean k;

    public CheckVersionScreen() {
        this.f = Utlis.e(DataCenter.gI().VER2);
        DataCenter.gI().a(Binary.readBoolan("arr_savemap"));
    }

    private void a() {
        if (Utlis.timeOut < 120000) {
            Utlis.timeOut += 20000;
        }

        LangLa_ci var1;
        (var1 = new LangLa_ci(Caption.to, this, 0, 2112)).a = this;
        var1.a(Caption.eL);
        this.a((LangLa_cx) var1);
    }

    public void a(LangLa_jz var1, int var2, int var3) {
        super.a(var1, var2, var3);
        if (var1.b == 2112) {
            this.i = true;
        } else {
            if (var1.b == 2111) {
                this.a = new LangLa_q(this);
                this.a.a.b = (int) this.h;
                Session.gI().countRecv = 0;

                for (int var4 = 0; var4 < this.g.size(); ++var4) {
                    LangLa_fb var5;
                    if (!(var5 = (LangLa_fb) this.g.get(var4)).f) {
                        if (var5.a()) {
                            (new Thread(new LangLa_ez(this, var5))).start();
                        } else {
                            (new Thread(new LangLa_do(this, var5))).start();
                        }
                    }
                }
            }

        }
    }

    private void d() {
        this.k = true;
        if (this.a != null) {
            this.a.a(true);
        }

    }

    public void b() {
        super.b();
        if (this.a != null && !d) {
            if (!this.k) {
                LangLa_r var10000 = this.a.a;
                int var2 = Session.gI().countRecv / 1024;
                LangLa_r var1 = var10000;
                if (var10000.a < var2) {
                    var1.a = var2;
                } else {
                    var1.a += var1.b / 10000;
                }

                if (var1.a > var1.b * 99 / 100) {
                    var1.a = var1.b * 99 / 100;
                }
            } else {
                this.a.b();
            }
        }

        if (this.i) {
            DataCenter.gI();
            if (DataCenter.a()) {
                this.i = false;
                (new Thread(new LangLa_mj(this))).start();
            }
        }

    }

    public void m() {
        this.e.a();
    }

    public void a(Graphics var1) {
        var1.f(-1);
        var1.c(0, 0, DataCenter.gI().widthScreen, DataCenter.gI().heightScreen);
        if (this.e != null) {
            var1.a(this.e, 0, 0, this.e.c, this.e.d, 0, DataCenter.gI().widthScreen / 2, DataCenter.gI().heightScreen / 2, DataCenter.gI().widthScreen * DataCenter.gI().zoomLevel, DataCenter.gI().heightScreen * DataCenter.gI().zoomLevel, 3);
        }

        if (Gdx.app.getType() == ApplicationType.iOS) {
            mFont.a(var1, Caption.eQ + this.f, this.width - 8 - AppListener.gI().o, 8, 1, -1);
            if (AppListener.d != null && AppListener.e != null && this.a != null) {
                if (!DataCenter.ar) {
                    mFont.a(var1, Caption.eP + Session.gI().d(), 8 + AppListener.gI().o, 8, 0, -1);
                }

                this.a.a(var1);
                return;
            }
        } else {
            mFont.a(var1, Caption.eP + Session.gI().d(), 8 + AppListener.gI().o, 8, 0, -1);
            mFont.a(var1, Caption.eQ + this.f, this.width - 8 - AppListener.gI().o, 8, 1, -1);
            if (AppListener.d != null && AppListener.e != null && this.a != null) {
                this.a.a(var1);
            }
        }

    }

    public static void a(CheckVersionScreen var0) {
        var0.a();
    }

    public static void b(CheckVersionScreen var0) {
        var0 = var0;
        int var1 = 0;

        while (true) {
            if (var1 >= var0.g.size()) {
                var0.d();
                break;
            }

            if (!((LangLa_fb) var0.g.get(var1)).f) {
                break;
            }

            ++var1;
        }

    }

    public static Vector c(CheckVersionScreen var0) {
        return var0.g;
    }

    public static void d(CheckVersionScreen var0) {
        var0 = var0;

        try {
            if (!Utlis.haveNetwork()) {
                var0.a();
                return;
            }

            Session.gI().countRecv = 0;
            String var1 = DataCenter.gI().aV;
            if (Gdx.app.getType() == ApplicationType.Android) {
                var1 = DataCenter.gI().aW;
            } else if (Gdx.app.getType() == ApplicationType.iOS) {
                var1 = DataCenter.gI().aX;
            }

            var1 = Binary.a(var1, 2);
            String[] var10000 = new String[2];
            String[] var17;
            if (var1 == null) {
                (var17 = new String[5])[0] = DataCenter.gI().VER2 + ";" + DataCenter.gI().VER2 + ";" + DataCenter.gI().VER2;
                var17[1] = "0;arr_data_game.bin;arr_data_game";
                var17[2] = "1;mapmini.zip;map_mini_zip";
                var17[3] = "2;bitmapChar.zip;char_zip";
                var17[4] = "3;bitmapClient.zip;client_zip";
            } else {
                var17 = var1.split("\r\n");
            }

            d = false;
            String[] var2 = var17[0].split(";");
            DataCenter.gI().aY = DataCenter.gI().aZ = "img/zoom";
            int var3 = Integer.parseInt(var2[0]);
            if (var2.length >= 2) {
                if (Gdx.app.getType() == ApplicationType.Android) {
                    var3 = Integer.parseInt(var2[0]);
                } else if (Gdx.app.getType() == ApplicationType.iOS) {
                    var3 = Integer.parseInt(var2[1]);
                } else if (Gdx.app.getType() == ApplicationType.Desktop) {
                    var3 = Integer.parseInt(var2[2]);
                }
            }

            DataCenter var26 = DataCenter.gI();
            boolean var5 = DataCenter.gI().VER2 > var3;
            DataCenter var4 = var26;
            DataCenter.at = true;
            DataCenter.ar = var5;
            if (DataCenter.ar) {
                var4.aU = "";
            } else {
                var4.aU = "http://localhost/";
            }

            var4.aV = var4.aU + "checkpc.txt";
            var4.aW = var4.aU + "checkandroid.txt";
            var4.aX = var4.aU + "checkios.txt";
            AppListener var6 = AppListener.gI();
            (new Thread(new RLoadServer(var6))).start();
            boolean var27 = DataCenter.ar;
            if (DataCenter.ar) {
                Utlis.timeOut = 120000;
            }

            var0.h = 0L;
            var0.g.clear();

            int var16;
            for (var16 = 1; var16 < var17.length; ++var16) {
                String[] var21 = var17;
                int var20 = var16;
                CheckVersionScreen var19 = var0;
                LangLa_fb var12 = new LangLa_fb();

                try {
                    String[] var13 = var21[var20].split(";");
                    var12.a = Short.parseShort(var13[0]);
                    var12.d = var13[1].trim();
                    var12.e = var13[2].trim();
                    var12.c = Binary.readInt("arr_check_" + var12.a);
                    var12.b = 1;
                    if (var12.a()) {
                        var12.d = var13[1].trim();
                    }

                    if (!var12.b() && !var12.c() && !var12.d() && !var12.e()) {
                        if (var12.a()) {
                            var12.b = Integer.parseInt(var13[3].trim());
                        } else {
                            DataCenter.gI();
                            var12.b = Integer.parseInt(var13[3 + DataCenter.a(var12.d)].trim());
                        }
                    } else {

                        var12.b = Integer.parseInt(var13[3].trim());
                        String var7 = "";
                        String var8 = "";
                        if (var12.b()) {
                            var7 = "C:\\LangLa\\jre\\bin\\jasr.dll";
                            var8 = "C:\\LangLa\\jre\\bin\\_jasr.dll";
                        } else if (var12.c()) {
                            var7 = "C:\\LangLa\\LangLa.exe";
                            var8 = "C:\\LangLa\\jre\\bin\\_LangLa.exe";
                        } else if (var12.d()) {
                            var7 = "C:\\LangLa\\ninja_lib\\core.jar";
                            var8 = "C:\\LangLa\\jre\\bin\\_core.jar";
                        } else if (var12.e()) {
                            var7 = "C:\\LangLa\\ninja_lib\\gdx.jar";
                            var8 = "C:\\LangLa\\jre\\bin\\_gdx.jar";
                        }

                        var12.c = Utlis.readLength(var7);
                        var12.f = true;
                        if (DataCenter.ar) {
                            var12.b = var12.c;
                        }

                        if (var12.b != var12.c || var12.c == 0) {
                            byte[] var22;
                            if ((var22 = Binary.c(DataCenter.gI().aU + var12.d)) == null) {
                                var19.a();
                                continue;
                            }

                            if (System.getProperty("user.dir").toLowerCase().startsWith("c:\\")) {
                                Utlis.write(var8, var22);
                                var19.j = true;
                            }
                        }

                        var12.c = var12.b;
                    }

                    if (Gdx.app.getType() == ApplicationType.iOS && DataCenter.ar && var20 > 1) {
                        var12.c = var12.b;
                    }
                } catch (Exception var14) {
                }

                var0.g.add(var12);
            }

            if (var0.j) {
                AppListener.gI().app.a();
            }

            for (var16 = 0; var16 < var0.g.size(); ++var16) {
                LangLa_fb var18;
                if ((var18 = (LangLa_fb) var0.g.get(var16)).a() && DataCenter.gI().VER2 > var3 && Gdx.app.getType() != ApplicationType.iOS) {
                    var0.h += (long) var18.b;
                    DataCenter.gI().ba = false;
                } else if (var18.b != 0 && var18.b != var18.c && (Gdx.app.getType() != ApplicationType.iOS || !DataCenter.ar)) {
                    var0.h += (long) var18.b;
                    if (var18.a()) {
                        DataCenter.gI().ba = false;
                    } else if (var18.d.contains("Client")) {
                        DataCenter.gI().bb = false;
                    }
                } else {
                    var18.f = true;
                }
            }

            if (var0.h <= 0L) {
                var0.a = new LangLa_q(var0);
                var0.d();
                return;
            }

            var0.h /= 1024L;
            long var25 = var0.h;
            var5 = true;
            String[] var23;
            (var23 = new String[Caption.tn.length])[0] = Utlis.replaceAll(Caption.tn[0], var25 / 1024L + "." + var25 % 1024L / 102L + "MB");
            var23[1] = Caption.tn[1];
            LangLa_ci var24;
            (var24 = new LangLa_ci(var23, var0, 0, 2111)).a = var0;
            var0.a((LangLa_cx) var24);
        } catch (Exception var15) {
            var0.a();
        }

    }
}
