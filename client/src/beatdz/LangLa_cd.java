package beatdz;import beatdz2.*;

import beatdz2.DataCenter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.tgame.model.Caption;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class LangLa_cd extends LangLa_fn {
   private static Vector a = new Vector();
   private static LangLa_ek b;
   private static LangLa_ek c;
   private static LangLa_ek d;
   private static LangLa_ek e;
   private LangLa_ii[][] f;
   private LangLa_ij g;
   private int h;
   private int i;
   private int j;
   private int o;
   private int s;
   private int t;
   private int u;
   private Vector v = new Vector();
   private Vector w = new Vector();
   private Vector x = new Vector();
   private String[][] y;
   private String[][] z;
   private boolean A;
   private boolean B;
   private int C;
   private int D;
   private LangLa_dz E;
   private Item[][] F;
   private LangLa_ii[][] G;
   private Item H;

   public LangLa_cd(MainScreen var1, Message var2) {
      super(var1);

      try {
         LangLa_kd var9;
         (var9 = new LangLa_kd(5000)).c = Caption.sI;
         this.a(var9, 170, 74, 4);
         this.r = false;
         this.a(348, 216);
         this.h = Utlis.getDay();
         this.i = (this.width - 10) / 7;
         int var10 = (this.width - 10) / 6;
         this.j = this.G() - 30;
         this.o = 35;
         this.s = 6;
         this.t = this.a_() + 2;
         this.f = new LangLa_ii[4][];
         this.f[0] = new LangLa_ii[1];
         this.f[0][0] = new LangLa_ii((byte)0, this.s, this.t, this.i * 7, 18, this.i, 7);

         int var3;
         String[] var6;
         LangLa_ek var10000;
         for(var3 = 0; var3 < 7; ++var3) {
            for(Iterator var5 = b(var3).iterator(); var5.hasNext(); var10000.g = var6) {
               LangLa_ek var4;
               var10000 = var4 = (LangLa_ek)var5.next();
               var6 = mFont.c(mFont.b, var4.d, var10 - 12);
            }
         }

         Collections.sort(a, LangLa_ek.h);
         this.g();

         try {
            String[] var11 = Utlis.split(var2.readUTF(), "\\n");
            this.v.clear();

            for(int var12 = 0; var12 < var11.length; ++var12) {
               this.v.addAll(mFont.a(mFont.d, var11[var12], super.width - 8 - 46));
            }

            this.f[1] = new LangLa_ii[1];
            this.f[1][0] = new LangLa_ii((byte)1, 14, this.a_() + 14, super.width - 8 - 20, 154, 14, this.v.size());
         } catch (Exception var7) {
         }

         this.y = new String[2][var2.reader.dis.readByte()];

         for(var3 = 0; var3 < this.y[0].length; ++var3) {
            this.y[0][var3] = var2.readUTF();
            this.y[1][var3] = var2.readUTF();
         }

         this.f();
         this.f[2] = new LangLa_ii[3];
         this.f[2][0] = new LangLa_ii((byte)1, 13, this.a_() + 11, super.width - 8 - 18, 162, 27, this.y[0].length);
         this.f[2][1] = new LangLa_ii((byte)1, 13, this.a_() + 45, super.width - 8 - 18, 105, 15, 0);
         this.f[2][2] = new LangLa_ii((byte)1, 13, this.a_() + 11, super.width - 8 - 18, 27, 27, 1);
         this.z = Caption.qP;
         this.f[3] = new LangLa_ii[3];
         this.f[3][0] = new LangLa_ii((byte)1, 13, this.a_() + 11, super.width - 8 - 18, 162, 27, this.z[0].length);
         this.f[3][1] = new LangLa_ii((byte)1, 13, this.a_() + 45, super.width - 8 - 18, 120, 15, 0);
         this.f[3][2] = new LangLa_ii((byte)1, 13, this.a_() + 11, super.width - 8 - 18, 27, 27, 1);
         GameSrc.gI().bO = e() == null;
         this.E = this.a(this.width - 75, this.height - 37, Caption.ma, this, 1011, -8);
         this.a(this.E, 2);
         this.a(0);
      } catch (Exception var8) {
         Utlis.println(var8);
      }
   }

   private void f() {
      int[][] var1;
      (var1 = new int[this.y[0].length][])[3] = new int[]{164, 174, 5};
      var1[4] = new int[]{164, 175, 4};
      var1[5] = new int[]{164, 248, 6};
      var1[6] = new int[]{564, 428, 218};
      var1[7] = new int[]{164, 562, 5};
      var1[8] = new int[]{163, 5};
      var1[9] = new int[]{7, 163};
      var1[10] = new int[]{164, 310, 6};
      var1[11] = new int[]{216, 4, 163};
      var1[12] = new int[]{191, 599, 218};
      var1[13] = new int[]{163, 192};
      var1[14] = new int[]{163, 476};
      var1[15] = new int[]{6, 163};
      var1[16] = new int[]{8, 163, 354};
      var1[17] = new int[]{6, 163};
      this.F = new Item[var1.length][];
      this.G = new LangLa_ii[var1.length][];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null) {
            this.F[var2] = new Item[var1[var2].length];
            this.G[var2] = new LangLa_ii[var1[var2].length];

            for(int var3 = 0; var3 < var1[var2].length; ++var3) {
               this.F[var2][var3] = new Item(var1[var2][var3], true);
               if ((var2 == 3 || var2 == 6) && var3 < 4 || var2 == 8 || this.F[var2][var3].id == 685 || this.F[var2][var3].id == 164 || this.F[var2][var3].id == 698) {
                  this.F[var2][var3].isLock = false;
               }

               this.G[var2][var3] = new LangLa_ii((byte)1, 75 + var3 * 35, this.a_() + this.height - 63, 28, 28, 1, 1);
            }
         }
      }

   }

   public static LangLa_ek e() {
      Vector var1 = b(Utlis.getDay());

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         LangLa_ek var0;
         if ((var0 = (LangLa_ek)var1.get(var2)).a()) {
            return var0;
         }
      }

      return null;
   }

   private static Vector b(int var0) {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < a.size(); ++var2) {
         if (((LangLa_ek)a.get(var2)).a == var0) {
            var1.add(a.get(var2));
         }
      }

      return var1;
   }

   public Vector c() {
      Vector var1 = super.c();
      int var2;
      switch(this.k()) {
      case 0:
         for(var2 = 0; var2 < this.f[this.k()].length; ++var2) {
            var1.addElement(this.f[this.k()][var2].a(1020 + var2, this));
         }

         if (this.g != null) {
            var1.addElement(this.g.a(1010, this));
         }
         break;
      case 1:
         for(var2 = 0; var2 < this.f[this.k()].length; ++var2) {
            var1.addElement(this.f[this.k()][var2].a(1030, this));
         }

         return var1;
      case 2:
         if (!this.A) {
            var1.addElement(this.f[this.k()][0].a(9980, this));
         } else {
            var1.addElement(this.f[this.k()][2].a(9981, this));
            var1.addElement(this.f[this.k()][1].a(1030, this));
            if (this.G[this.C] != null) {
               for(var2 = 0; var2 < this.G[this.C].length; ++var2) {
                  if (this.G[this.C][var2] != null) {
                     var1.addElement(this.G[this.C][var2].a(3000, this, this.F[this.C][var2]));
                  }
               }
            }
         }
         break;
      case 3:
         if (!this.B) {
            var1.addElement(this.f[this.k()][0].a(8980, this));
         } else {
            var1.addElement(this.f[this.k()][2].a(8981, this));
            var1.addElement(this.f[this.k()][1].a(2030, this));
         }
      }

      return var1;
   }

   public void a(Graphics var1) {
      super.a(var1);
      switch(this.k()) {
      case 0:
         Graphics var2 = var1;
         LangLa_cd var13 = this;
         this.a(var1, this.f[this.k()][0]);

         for(int var5 = 0; var5 < var13.f[var13.k()][0].i; ++var5) {
            int var3 = var13.h == var5 ? -1 : -6488;
            var13.u = var5 * var13.i + 2;
            var13.a(var2, var13.u, 0, var13.i - 4, 18, var5 == var13.h ? -20 : -19, 84, 5, 1, 1);
            mFont.b(mFont.d, var2, Caption.sG[var5], var13.u + var13.i / 2 - 2, 2 + mFont.a(mFont.d) / 2, 2, var3, -10275328);
         }

         var13.b(var2);
         Vector var15 = b(var13.h);
         int var7 = 0;
         if (var15.size() > 0) {
            var13.a(var2, var13.g);

            for(int var8 = 0; var8 < var13.g.i; ++var8) {
               for(int var9 = 0; var9 < var13.g.r; ++var9) {
                  if (var7 < var15.size()) {
                     LangLa_ek var6 = (LangLa_ek)var15.get(var7);
                     if (var13.g.b(var8)) {
                        try {
                           short var14 = -6488;
                           if (var6.a() && var6.a == var13.h) {
                              var14 = -2560;
                              var13.a(var2, 2 + var9 * var13.g.h, 7 + var8 * var13.g.h, var13.i - 6, var13.o + 5, -21, 84, 5, 1, 1);
                           } else {
                              var13.a(var2, 2 + var9 * var13.g.h, 7 + var8 * var13.g.h, var13.i - 6, var13.o + 5, -14, 84, 5, 1, 1);
                           }

                           int var4 = var6.g.length;

                           for(int var10 = 0; var10 < var4; ++var10) {
                              mFont.a((BitmapFont)Graphics.b(75), (Graphics)var2, var6.g[var10], var9 * var13.g.h + var13.i / 2 - 1, 15 + var8 * var13.g.h + var10 * mFont.a(mFont.b), 2, var14, -10275328);
                           }

                           mFont.a((BitmapFont)Graphics.b(75), (Graphics)var2, Utlis.m(var6.b) + " - " + Utlis.m(var6.c), var9 * var13.g.h + var13.i / 2 - 1, 15 + var8 * var13.g.h + var4 * mFont.a(mFont.b), 2, var14, -10275328);
                           if (var7 == var13.g.k) {
                              var2.f(-1);
                              var2.b(2 + var9 * var13.g.h - 1, 7 + var8 * var13.g.h - 1, var13.i - 6 + 1, var13.o + 5 + 1);
                           }
                        } catch (Exception var12) {
                        }
                     }
                  }

                  ++var7;
               }
            }

            var13.b(var2);
         }

         return;
      case 1:
         this.e(var1);
         return;
      case 2:
         this.f(var1);
         return;
      case 3:
         this.g(var1);
      default:
      }
   }

   private void e(Graphics var1) {
      this.a(var1, 9, this.a_() + 5, super.width - 8 - 10, this.G() - 10, 4, 55, 56);
      this.a(var1, this.f[this.k()][0]);

      for(int var2 = 0; var2 < this.f[this.k()][0].i; ++var2) {
         if (this.f[this.k()][0].b(var2)) {
            mFont.a(var1, (String)this.v.get(var2), 5, var2 * this.f[this.k()][0].h + 6, 0, -1);
         }
      }

      this.b(var1);
   }

   private void f(Graphics var1) {
      this.a(var1, 7, this.a_() + 5, super.width - 8 - 6, this.G() - 10, 4, 55, 56);
      int var2;
      if (!this.A) {
         this.a(var1, this.f[this.k()][0]);

         for(var2 = 0; var2 < this.f[this.k()][0].i; ++var2) {
            if (this.f[this.k()][0].b(var2)) {
               this.a(var1, 0, var2 * this.f[this.k()][0].h, this.f[this.k()][0].width, 26, -17, 84, 5, 1, 1);
               LangLa_fq.a(var1, 395, 0, 6, var2 * this.f[this.k()][0].h + 8, 20);
               if (this.f[this.k()][0].l == var2) {
                  mFont.a(var1, this.y[0][var2], 22, 13 + var2 * this.f[this.k()][0].h, 0, -1);
               } else {
                  mFont.a(var1, this.y[0][var2], 22, 12 + var2 * this.f[this.k()][0].h, 0, -1);
               }

               if (this.F != null && this.F[var2] != null) {
                  for(int var3 = 0; var3 < this.F[var2].length; ++var3) {
                     if (this.F[var2][var3] != null) {
                        int var10004 = this.F[var2].length;
                        Binary2.a(var1, 53, 0, this.f[this.k()][0].width - var10004 * 25 + var3 * 25, 2 + var2 * this.f[this.k()][0].h, 22, (int)22);
                        var10004 = this.F[var2].length;
                        Binary2.a(var1, this.F[var2][var3].getItemTemplate().idIcon, 0, this.f[this.k()][0].width - var10004 * 25 + var3 * 25 + 12, 1 + var2 * this.f[this.k()][0].h + 12, 95, (byte)3);
                        if (this.F[var2][var3].isLock) {
                           var10004 = this.F[var2].length;
                           Binary2.a(var1, 44, 0, this.f[this.k()][0].width - var10004 * 25 + var3 * 25 + 2, 2 + var2 * this.f[this.k()][0].h + 2, 80);
                        }
                     }
                  }
               }
            }
         }

         this.b(var1);
         this.f[this.k()][0].b(var1, -4, -10);
      } else {
         this.a(var1, this.f[this.k()][2]);
         this.a(var1, 0, 0 * this.f[this.k()][2].h, this.f[this.k()][2].width, 26, -17, 84, 5, 1, 1);
         if (this.f[this.k()][2].l == 0) {
            mFont.a(var1, this.y[0][this.C], 22, 13, 0, -1);
            var1.e(30);
            LangLa_fq.a(var1, 398, 0, this.f[this.k()][2].width - 21, 5, 20);
            var1.d();
         } else {
            mFont.a(var1, this.y[0][this.C], 22, 12, 0, -1);
            LangLa_fq.a(var1, 398, 0, this.f[this.k()][2].width - 22, 4, 20);
         }

         LangLa_fq.a(var1, 396, 0, 6, 0 * this.f[this.k()][2].h + 8, 20);
         this.b(var1);
         this.a(var1, this.f[this.k()][1]);

         for(var2 = 0; var2 < this.f[this.k()][1].i; ++var2) {
            mFont.c(mFont.d, var1, (String)this.w.get(var2), 2, 6 + var2 * this.f[this.k()][1].h, 0, -1, 0);
         }

         this.b(var1);
         this.f[this.k()][1].b(var1, -12, -10);
         if (this.F != null && this.F.length > 0 && this.F[this.C] != null) {
            mFont.a(var1, Caption.mN, 16, this.a_() + this.height - 52, 0, -1);

            for(var2 = 0; var2 < this.F[this.C].length; ++var2) {
               if (this.F[this.C][var2] != null) {
                  b(var1, 75 + var2 * 35, this.a_() + this.height - 72, this.F[this.C][var2], this.H != null && this.H.equals(this.F[this.C][var2]));
               }
            }
         }

      }
   }

   private void g(Graphics var1) {
      this.a(var1, 7, this.a_() + 5, super.width - 8 - 6, this.G() - 10, 4, 55, 56);
      int var2;
      if (!this.B) {
         this.a(var1, this.f[this.k()][0]);

         for(var2 = 0; var2 < this.f[this.k()][0].i; ++var2) {
            if (this.f[this.k()][0].b(var2)) {
               this.a(var1, 0, var2 * this.f[this.k()][0].h, this.f[this.k()][0].width, 26, -17, 84, 5, 1, 1);
               LangLa_fq.a(var1, 395, 0, 6, var2 * this.f[this.k()][0].h + 8, 20);
               if (this.f[this.k()][0].l == var2) {
                  mFont.a(var1, this.z[0][var2], 22, 13 + var2 * this.f[this.k()][0].h, 0, -1);
               } else {
                  mFont.a(var1, this.z[0][var2], 22, 12 + var2 * this.f[this.k()][0].h, 0, -1);
               }
            }
         }

         this.b(var1);
      } else {
         this.a(var1, this.f[this.k()][2]);
         this.a(var1, 0, 0 * this.f[this.k()][2].h, this.f[this.k()][2].width, 26, -17, 84, 5, 1, 1);
         if (this.f[this.k()][2].l == 0) {
            mFont.a(var1, this.z[0][this.D], 22, 13, 0, -1);
            var1.e(30);
            LangLa_fq.a(var1, 398, 0, this.f[this.k()][2].width - 21, 5, 20);
            var1.d();
         } else {
            mFont.a(var1, this.z[0][this.D], 22, 12, 0, -1);
            LangLa_fq.a(var1, 398, 0, this.f[this.k()][2].width - 22, 4, 20);
         }

         LangLa_fq.a(var1, 396, 0, 6, 0 * this.f[this.k()][2].h + 8, 20);
         this.b(var1);
         this.a(var1, this.f[this.k()][1]);

         for(var2 = 0; var2 < this.f[this.k()][1].i; ++var2) {
            mFont.c(mFont.d, var1, (String)this.x.get(var2), 2, 6 + var2 * this.f[this.k()][1].h, 0, -1, 0);
         }

         this.b(var1);
         this.f[this.k()][1].b(var1, -12, -10);
      }
   }

   public void b() {
      for(int var1 = 0; var1 < this.f.length; ++var1) {
         for(int var2 = 0; var2 < this.f[var1].length; ++var2) {
            if (this.f[var1][var2] != null) {
               this.f[var1][var2].a();
            }
         }
      }

      if (this.g != null) {
         this.g.a();
      }

      if (this.A && this.C > 1 && this.C < 12) {
         this.E.b(false);
      } else {
         this.E.b(true);
      }
   }

   public void a(LangLa_jz var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (var1.b >= 1020 && var1.b < 1030 && var1.j.k >= 0) {
         this.h = var1.j.k;
         this.g();
      }

      Vector var4 = b(this.h);
      String[] var9;
      LangLa_ek var10;
      switch(var1.b) {
      case 1010:
         if (this.g.k >= 0 && this.g.k < var4.size()) {
            if (Char.gI().idClass <= 0) {
               this.cL = a(Caption.lZ, this, var2, var3, 180);
               return;
            }

            if ((var10 = (LangLa_ek)var4.get(this.g.k)).f == -2) {
               this.cL = a(Caption.qc, this, var2, var3, 180);
            } else {
               if (var10.e != 57) {
                  DataCenter.gI().currentScreen.a(Utlis.replaceAll(Caption.lY, var10.d), 2001, this);
                  return;
               }

               boolean var12 = true;
               Vector var13;
               (var13 = new Vector()).addElement(new LangLa_lk(2001, Caption.sS[0]));
               var13.addElement(new LangLa_lk(2002, Caption.sS[1]));
               var13.addElement(new LangLa_lk(2003, Caption.sS[2]));
               var13.addElement(new LangLa_lk(2004, Caption.sS[3]));
               var13.addElement(new LangLa_lk(2005, Caption.sS[4]));
               if (var13.size() > 0) {
                  String[] var5 = new String[var13.size()];
                  short[] var6 = new short[var13.size()];

                  for(int var7 = 0; var7 < var13.size(); ++var7) {
                     LangLa_lk var8 = (LangLa_lk)var13.elementAt(var7);
                     var5[var7] = var8.b;
                     var6[var7] = (short)var8.a;
                  }

                  this.cL = a(this, var2, var3, new LangLa_kd(3000, var6, var5));
               }
            }
         }
         break;
      case 1011:
         if (Char.gI().idClass == 0) {
            GameSrc.gI().showMessage(Caption.mb, -1);
            return;
         }

         switch(this.C) {
         case 2:
         case 6:
         case 7:
         case 8:
         case 9:
            GameSrc.gI();
            GameSrc.a(32);
            break;
         case 3:
            GameSrc.gI();
            GameSrc.a(102);
            break;
         case 4:
            GameSrc.gI();
            GameSrc.a(98);
            break;
         case 5:
            GameSrc.gI();
            GameSrc.a(59);
            break;
         case 10:
            GameSrc.gI();
            GameSrc.a(99);
            break;
         case 11:
            if (!b.a()) {
               GameSrc.gI().showMessage(Caption.ml, -1);
               return;
            }

            if (GameSrc.gI().mapID == 86) {
               GameSrc.gI().showMessage(Caption.mm, -2560);
            } else {
               GameSrc.gI().aR = new LangLa_eo(86, 0, 0);
            }
         }

         this.J();
         return;
      case 2001:
         if ((var10 = (LangLa_ek)var4.get(this.g.k)).e >= 0) {
            GameSrc.gI().aR = new LangLa_eo(var10.f, -1, -1, var10.e, 0, 0);
         } else if (var10.f >= 0) {
            if (var10.f == 30) {
               if (!b.a()) {
                  GameSrc.gI().showMessage(Caption.ml, -1);
                  return;
               }

               if (GameSrc.gI().mapID == 86) {
                  GameSrc.gI().showMessage(Caption.mm, -2560);
               } else {
                  GameSrc.gI().aR = new LangLa_eo(86, 0, 0);
               }
            } else {
               GameSrc.gI();
               GameSrc.a(var10.f);
            }
         }

         this.J();
         break;
      case 3000:
         this.H = (Item)var1.k;
         Item var11 = this.H;
         this.cL = LangLa_cz.a(this, var1.e + 2, var1.d, 32, var11);
         LangLa_dp.a().h();
         return;
      case 8980:
         if (var1.j.k >= 0) {
            this.D = var1.j.k;
            var9 = Utlis.split(this.z[1][this.D], "\\n");
            this.x.clear();

            for(var2 = 0; var2 < var9.length; ++var2) {
               this.x.addAll(mFont.a(mFont.d, var9[var2], super.width - 8 - 40));
            }

            this.f[3][1] = new LangLa_ii((byte)1, 13, this.a_() + 45, super.width - 8 - 18, 120, 15, this.x.size());
            this.B = true;
            return;
         }
         break;
      case 8981:
         this.B = false;
         return;
      case 9980:
         if (var1.j.k >= 0) {
            this.C = var1.j.k;
            var9 = Utlis.split(this.y[1][this.C], "\\n");
            this.w.clear();

            for(var2 = 0; var2 < var9.length; ++var2) {
               this.w.addAll(mFont.a(mFont.d, var9[var2], super.width - 8 - 40));
            }

            this.f[2][1] = new LangLa_ii((byte)1, 13, this.a_() + 45, super.width - 8 - 18, 105, 15, this.w.size());
            this.A = true;
            return;
         }
         break;
      case 9981:
         this.A = false;
         return;
      }

   }

   private void g() {
      this.g = new LangLa_ij((byte)1, 6, this.a_() + 25, this.i * 7, this.i * 3, this.i, Utlis.c(b(this.h).size(), 7), 7);
   }

   public void a(int var1, Object var2, LangLa_cy var3) {
      switch(var1) {
      case 2001:
         a(57, 958, 443);
         this.J();
         return;
      case 2002:
         a(65, 906, 137);
         this.J();
         return;
      case 2003:
         a(87, 969, 150);
         this.J();
         return;
      case 2004:
         a(79, 1036, 141);
         this.J();
         return;
      case 2005:
         a(73, 751, 178);
         this.J();
      default:
      }
   }

   public void a(int var1, Object var2) {
   }

   private static void a(int var0, int var1, int var2) {
      if (!c.a() && !d.a() && !e.a()) {
         GameSrc.gI().showMessage(Caption.mn, -1);
      } else if (GameSrc.gI().mapID == var0) {
         GameSrc.gI().showMessage(Caption.mo, -2560);
      } else {
         GameSrc.gI().aR = new LangLa_eo(var0, var1, var2);
      }
   }

   static {
      for(int var0 = 0; var0 < 7; ++var0) {
         a.add(b = new LangLa_ek(var0, Caption.sT[0], 64800, 67500, -1, 30));
         a.add(c = new LangLa_ek(var0, Caption.sT[1], 32400, 36000, 57, -1));
         a.add(d = new LangLa_ek(var0, Caption.sT[1], 50400, 54000, 57, -1));
         a.add(e = new LangLa_ek(var0, Caption.sT[1], 68400, 72000, 57, -1));
         a.add(new LangLa_ek(var0, Caption.sT[2], 24600, 25200, -1, 99));
         a.add(new LangLa_ek(var0, Caption.sT[2], 35400, 36000, -1, 99));
         a.add(new LangLa_ek(var0, Caption.sT[2], 46200, 46800, -1, 99));
         a.add(new LangLa_ek(var0, Caption.sT[2], 57000, 57600, -1, 99));
         a.add(new LangLa_ek(var0, Caption.sT[2], 67800, 68400, -1, 99));
         if (var0 < 6) {
            if (var0 % 2 == 0) {
               a.add(new LangLa_ek(var0, Caption.sT[3], 73200, 73800, -1, 32));
               a.add(new LangLa_ek(var0, Caption.sT[7], 77400, 78000, -1, 105));
               if (var0 == 2) {
                  a.add(new LangLa_ek(var0, Caption.sT[5], 61200, 63000, -1, -2));
               }
            } else {
               a.add(new LangLa_ek(var0, Caption.sT[4], 72000, 72600, -1, 32));
               a.add(new LangLa_ek(var0, Caption.sT[8], 75600, 76200, -1, 93));
            }
         }

         if (var0 == 6) {
            a.add(new LangLa_ek(var0, Caption.sT[6], 39600, 41400, 85, 57));
            a.add(new LangLa_ek(var0, Caption.sT[5], 61200, 63000, -1, -2));
         }
      }

      Collections.sort(a, LangLa_ek.h);
   }
}
