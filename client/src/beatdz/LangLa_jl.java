package beatdz;import beatdz2.*;

import beatdz2.DataCenter;
import com.tgame.model.Caption;
import java.util.Vector;

public class LangLa_jl extends LangLa_cz {
   public Vector a = new Vector();
   public LangLa_jm b;
   private String[] c;
   private int d;
   private static LangLa_jl e;

   public static LangLa_jl a() {
      if (e == null) {
         e = new LangLa_jl();
      }

      LangLa_jl var10000 = e;
      var10000.setXY(var10000.cx, 10);
      return e;
   }

   public void a(Graphics var1) {
      try {
         int var2 = var1.a;
         int var3 = var1.b;
         this.a(var1, this.cx, this.cy);
         if (this.b != null) {
            this.a(var1, -10, -8, this.width + 20, this.height + 16, -10, 55, 56);
            this.a(var1, -10, -8, this.width + 20, this.height + 16, 24, 55, 56);

            for(int var4 = 0; var4 < this.c.length; ++var4) {
               mFont.a(this.b.b, var1, this.c[var4], this.width / 2, -1 + this.height / 2 + mFont.a(this.b.b) / 2 + var4 * mFont.a(this.b.b) - this.c.length * mFont.a(this.b.b) / 2, 2, this.b.d);
            }
         }

         this.a(var1, var2, var3);
      } catch (Exception var5) {
         Utlis.println(var5);
      }
   }

   private void c() {
      this.d = 0;
      this.b = (LangLa_jm)this.a.firstElement();
      this.width = (short)mFont.b(this.b.b, this.b.a);
      if (this.width > DataCenter.gI().widthScreen - 200) {
         this.width = (short)(DataCenter.gI().widthScreen - 200);
      }

      this.c = mFont.c(this.b.b, this.b.a, this.width);
      this.b.c = this.c.length * 50;
      if (this.b.c < 80) {
         this.b.c = 80;
      }

      this.height = (short)(this.c.length * mFont.a(this.b.b));
      this.setXY(DataCenter.gI().widthScreen / 2 - this.width / 2, DataCenter.gI().heightScreen - this.height - 24);
   }

   public void b() {
      try {
         if (this.b == null && this.a.size() > 0) {
            this.c();
         }

         if (this.b != null) {
            ++this.d;
            if (this.d == this.b.c) {
               this.b = null;
               this.a.removeElementAt(0);
            }

         }
      } catch (Exception var1) {
      }
   }

   public void a(String var1, mFont var2, int var3) {
      if (var2 == null) {
         var2 = mFont.d;
      }

      for(int var5 = 0; var5 < this.a.size(); ++var5) {
         LangLa_jm var4;
         String var8;
         if ((var4 = (LangLa_jm)this.a.elementAt(var5)).b.equals(var2) && var4.d == var3 && var4.a != null && var4.a.length() < 80 && var4.a.startsWith(Caption.k) && var1.startsWith(Caption.k)) {
            int var11 = Caption.k.length() + 1;
            int var12 = 0;
            int var13 = 0;
            var8 = var4.a + " ";
            var1 = var1 + " ";

            for(var3 = var11; var3 < var8.length(); ++var3) {
               try {
                  var12 = Integer.parseInt(a(var8.substring(var11, var3), ".", "").trim());
               } catch (Exception var10) {
               }

               if (var8.charAt(var3) == ' ') {
                  break;
               }
            }

            if (var12 <= 0) {
               var12 = 1;
            }

            var8 = var8.substring(var3).trim();

            for(var3 = var11; var3 < var1.length(); ++var3) {
               try {
                  var13 = Integer.parseInt(a(var1.substring(var11, var3), ".", "").trim());
               } catch (Exception var9) {
               }

               if (var1.charAt(var3) == ' ') {
                  break;
               }
            }

            if (var13 <= 0) {
               var13 = 1;
            }

            if ((var1 = var1.substring(var3).trim()).equals(var8)) {
               var4.a = Caption.k + " " + Utlis.numberFormat(var12 + var13) + " " + var1;
            } else {
               var4.a = var4.a + ", " + Utlis.numberFormat(var13) + " " + var1;
            }

            if (var5 == 0) {
               this.c();
            }

            return;
         }

         if (var4.b.equals(var2) && var4.d == var3 && var4.a != null && var4.a.length() < 80) {
            if (var4.a.equals(var1) || var4.a.indexOf(var1) >= 0) {
               if (var5 == 0) {
                  this.c();
               }

               return;
            }

            if (var4.a.length() >= 8) {
               String var6 = var1.substring(0, 8);
               String var7 = var4.a.substring(0, 8);
               if (var6.equals(var7)) {
                  for(var3 = 7; var3 < var1.length() && var3 < var4.a.length() && var1.charAt(var3) == var4.a.charAt(var3); ++var3) {
                  }

                  var8 = var1.substring(var3, var1.length());
                  var4.a = var4.a + ", " + var8;
                  if (var5 == 0) {
                     this.c();
                  }

                  return;
               }
            }
         }
      }

      if (this.a.size() > 15) {
         this.a.removeElementAt(0);
      }

      this.a.addElement(new LangLa_jm(this, var1, var2, var3));
   }

   private static String a(String var0, String var1, String var2) {
      StringBuffer var3;
      int var4;
      for(var3 = new StringBuffer(); (var4 = var0.indexOf(var1)) != -1; var0 = var0.substring(var4 + var1.length())) {
         var3.append(var0.substring(0, var4) + var2);
      }

      var3.append(var0);
      return var3.toString();
   }
}
