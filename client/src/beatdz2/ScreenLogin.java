package beatdz2;import beatdz.*;

import beatdz2.DataCenter;
import java.util.Vector;

public class ScreenLogin extends MainScreen {
   private LangLa_em[] a = new LangLa_em[5];

   public ScreenLogin() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1] = new LangLa_em(2, 1, 0, 1, var1, this.a.length, DataCenter.gI().widthScreen, DataCenter.gI().heightScreen);
      }

      if (mConfig.gI().readByte(18) > 1) {
         mConfig.gI().writeByte(18, 1);
      }

   }

   public void m() {
   }

   public void j() {
   }

   public void b() {
      try {
         for(int var1 = 0; var1 < this.a.length; ++var1) {
            this.a[var1].o();
         }

      } catch (Exception var2) {
         Utlis.println(var2);
      }
   }

   public void p() {
   }

   public void a(Graphics var1) {
      try {
         if (AppListener.gI().h > 0) {
            --AppListener.gI().h;
            if (AppListener.gI().h == 0) {
               DataCenter.gI().g();
               return;
            }
         }

         var1.a(AppListener.c, 0, 0, AppListener.c.c, AppListener.c.d, 0, DataCenter.gI().widthScreen / 2, DataCenter.gI().heightScreen / 2, Graphics.e(), Graphics.f(), 3);
         if (!(this instanceof CheckVersionScreen)) {
            for(int var2 = 0; var2 < this.a.length; ++var2) {
               this.a[var2].a(var1);
            }
         }

      } catch (Exception var3) {
      }
   }

   public Vector c() {
      return new Vector();
   }

   public void a(int var1, Object var2) {
   }

   public void a(LangLa_jz var1, int var2, int var3) {
      if (var1.b == 2002) {
         AppListener.gI();
         AppListener.exit();
      }

   }

   public void a(int var1, Object var2, LangLa_cy var3) {
   }

   public void G() {
   }
}
