package beatdz;import beatdz2.*;

import beatdz2.DataCenter;
import com.tgame.model.Caption;
import java.util.Hashtable;
import java.util.Vector;

public class LangLa_bg extends LangLa_fn {
   private LangLa_ij[][] o;
   private LangLa_ii[][][] s;
   public LangLa_dz[][][] a;
   private LangLa_gx[] t;
   public LangLa_jv[][][] b;
   private LangLa_bh[] u = new LangLa_bh[]{new LangLa_bh(this, 301, 360), new LangLa_bh(this, 241, 300), new LangLa_bh(this, 181, 240), new LangLa_bh(this, 121, 180), new LangLa_bh(this, 61, 120), new LangLa_bh(this, 0, 60)};
   public int c = 0;
   public int d = 50;
   public int e = -1;
   public int f = 0;
   public int g = 0;
   public int h = 0;
   private boolean v;
   private int w = 50;
   private int x = 76;
   private int y;
   private int z;
   private int A;
   private int B;
   private int C;
   private int D;
   private int E;
   private int F;
   private int G;
   private int H;
   private int I;
   private int J;
   private long K;
   private long L;
   private boolean M;
   private boolean N;
   private boolean O;
   private int P;
   private int Q;
   private int R;
   private int S;
   public int i;
   private int T;
   public int j;
   private LangLa_dz[] U = new LangLa_dz[2];
   private LangLa_dz[] V = new LangLa_dz[2];
   private LangLa_dz W;
   private LangLa_dz X;
   private long Y;
   private long Z;
   private long aa;
   private long ab;
   private long ac;
   private long ad;
   private long ae;
   private long af;
   private long ag;
   private long ah;
   private long ai;
   private long aj;
   private long ak;
   private long al;
   private long am;
   private long an;
   private long ao;
   private long ap;
   private long aq;
   private int[] ar = new int[]{0, 80, 480, 880, 1880, 3280};

   public LangLa_bg(MainScreen var1, Message var2) {
      super(var1);
      LangLa_kd var9;
      (var9 = new LangLa_kd(5000)).c = new String[]{Caption.lp, Caption.my, Caption.mz, Caption.mB, Caption.mA};
      this.o = new LangLa_ij[var9.c.length][];
      this.s = new LangLa_ii[var9.c.length][][];
      this.a = new LangLa_dz[var9.c.length][][];
      this.t = new LangLa_gx[var9.c.length];
      this.b = new LangLa_jv[var9.c.length][][];
      this.a(var9, 170, 55, 5);
      this.l = 5;
      this.a(306, 230);
      String[][] var3 = new String[][]{Caption.sH, Caption.sL, Caption.sO, Caption.sN, Caption.sM};

      int var4;
      for(var4 = 0; var4 < this.a.length; ++var4) {
         (var9 = new LangLa_kd(1001)).c = var3[var4];
         this.t[var4] = new LangLa_gx(var9, this.width, 1, this.a_() - 3, 87, this.G() + 6, 33, this);
         this.o[var4] = new LangLa_ij[this.t[var4].b.c.length];
         this.s[var4] = new LangLa_ii[this.t[var4].b.c.length][];
         this.a[var4] = new LangLa_dz[this.t[var4].b.c.length][];
         this.b[var4] = new LangLa_jv[this.t[var4].b.c.length][];
      }

      this.a(var2);

      for(var4 = 0; var4 < this.b.length; ++var4) {
         for(int var10 = 0; var10 < this.b[var4].length; ++var10) {
            int var5 = var10;
            int var12 = var4;
            LangLa_bg var11 = this;
            this.A = -1;
            this.a[var4][var10] = new LangLa_dz[this.b[var4][var10].length];
            this.s[var4][var10] = new LangLa_ii[this.b[var4][var10].length];
            DataCenter.gI();
            this.o[var4][var10] = new LangLa_ij((byte)1, this.t[var4].c() + 8, this.a_() + 11, this.w * 4, this.x * 2, this.x, Utlis.c(this.b[var4][var10].length, 4), 4);
            this.y = 0;
            this.z = 0;
            int var6 = 0;

            for(int var7 = 0; var7 < var11.o[var12][var5].i; ++var7) {
               var11.z = var7 * var11.x;

               for(int var8 = 0; var8 < var11.o[var12][var5].r; ++var8) {
                  var11.y = var8 * var11.w;
                  var11.a[var12][var5][var6] = new LangLa_dz(var11.y + 6, var11.z + var11.x - 28, 0, 0, Caption.lq, var11, 1100, 7);
                  var11.a[var12][var5][var6].setSize(35, 20);
                  var11.s[var12][var5][var6] = new LangLa_in((byte)1, 0, 0, var11.a[var12][var5][var7].width, var11.a[var12][var5][var7].height, var11.a[var12][var5][var7].height, 1, var11.o[var12][var5]);
                  ++var6;
                  if (var6 >= var11.a[var12][var5].length) {
                     break;
                  }
               }

               if (var6 >= var11.a[var12][var5].length) {
                  break;
               }
            }
         }
      }

      this.W = this.a(this.t[this.k()].width + (this.width - this.t[this.k()].width) / 2 - 30, this.t[this.k()].cy + (this.height - this.t[this.k()].cy) / 2 - 35, "", this, 1205, 709);
      this.a(this.W, 2);
      this.t[2].a((LangLa_cs)this.W, 3);
      this.V[0] = this.a(this.width - 74, this.height - 35, Caption.mC, this, 1200, 7);
      this.V[0].setSize(60, 22);
      this.V[1] = this.a(this.width - 74, this.height - 35, Caption.mC, this, 1201, 7);
      this.V[1].setSize(60, 22);
      this.a(this.V[0], 4);
      this.a(this.V[1], 4);
      this.t[4].a((LangLa_cs)this.V[0], 0);
      this.t[4].a((LangLa_cs)this.V[1], 1);
      this.U[0] = this.a(this.width - 74, this.height - 35, Caption.mC, this, 1202, 7);
      this.U[0].setSize(60, 22);
      this.U[1] = this.a(this.width - 74, this.height - 35, Caption.mC, this, 1203, 7);
      this.U[1].setSize(60, 22);
      this.a(this.U[0], 3);
      this.a(this.U[1], 3);
      this.t[3].a((LangLa_cs)this.U[0], 0);
      this.t[3].a((LangLa_cs)this.U[1], 1);
      this.H();
      this.X = this.a(this.width - 14, -7, "", this, 1206, 6);

      for(var4 = 0; var4 <= this.j(); ++var4) {
         this.a(this.X, var4);
      }

      this.a(0);
   }

   public void a(Message var1) {
      try {
         Hashtable var2 = new Hashtable();
         this.B = var1.reader.dis.readInt();
         this.C = var1.reader.dis.readByte();
         this.E = var1.reader.dis.readInt();
         this.D = var1.reader.dis.readInt();
         this.F = var1.reader.dis.readInt();
         this.G = var1.reader.dis.readInt();
         this.H = var1.reader.dis.readInt();
         this.I = var1.reader.dis.readInt();
         this.K = var1.reader.dis.readLong();
         this.L = var1.reader.dis.readLong();
         this.P = var1.reader.dis.readInt();
         this.M = var1.reader.dis.readBoolean();
         this.N = var1.reader.dis.readBoolean();
         this.Q = var1.reader.dis.readInt();
         this.S = var1.reader.readUnsignedByte();
         this.O = var1.reader.dis.readBoolean();
         this.ab = var1.reader.dis.readLong();
         this.ac = var1.reader.dis.readLong();
         this.ad = var1.reader.dis.readLong();
         this.ae = var1.reader.dis.readLong();
         this.aa = var1.reader.dis.readLong();
         this.T = this.i = var1.reader.readUnsignedByte();
         this.R = var1.reader.readUnsignedByte();
         this.Y = var1.reader.dis.readLong();
         short var3 = var1.reader.dis.readShort();

         int var4;
         Vector var6;
         for(var4 = 0; var4 < var3; ++var4) {
            LangLa_jv var5;
            (var5 = new LangLa_jv()).a = var1.reader.dis.readShort();
            var5.b = var1.readUTF();
            var5.c = var1.reader.dis.readShort();
            var5.d = new Item();
            var5.d.read(var1);
            var5.e = var1.reader.dis.readBoolean();
            if ((var6 = (Vector)var2.get(var5.c)) == null) {
               var6 = new Vector();
            }

            var6.add(var5);
            var2.put(var5.c, var6);
         }

         for(var4 = 0; var4 < this.b.length; ++var4) {
            for(int var10 = 0; var10 < this.b[var4].length; ++var10) {
               var6 = null;
               switch(var4) {
               case 0:
                  if (var10 < 3) {
                     var6 = (Vector)var2.get(var10);
                  } else if (var10 == 3) {
                     var6 = (Vector)var2.get(7);
                  } else if (var10 == 4) {
                     var6 = (Vector)var2.get(8);
                  }
                  break;
               case 1:
                  if (var10 < 2) {
                     var6 = (Vector)var2.get(var10 + 5);
                  } else if (var10 == 2) {
                     var6 = (Vector)var2.get(19);
                  } else if (var10 == 3) {
                     var6 = (Vector)var2.get(21);
                  } else if (var10 == 4) {
                     var6 = (Vector)var2.get(22);
                  }
                  break;
               case 2:
                  if (var10 == 0) {
                     var6 = (Vector)var2.get(3);
                  } else if (var10 == 1) {
                     var6 = (Vector)var2.get(20);
                  } else if (var10 == 2) {
                     var6 = (Vector)var2.get(4);
                  }
                  break;
               case 3:
                  var6 = (Vector)var2.get(var10 + 15);
                  break;
               case 4:
                  if (var10 == 2) {
                     var6 = (Vector)var2.get(18);
                  }
               }

               if (var6 == null) {
                  var6 = new Vector();
               }

               this.b[var4][var10] = new LangLa_jv[var6.size()];

               for(int var9 = 0; var9 < this.b[var4][var10].length; ++var9) {
                  this.b[var4][var10][var9] = (LangLa_jv)var6.get(var9);
               }
            }
         }

         this.af = var1.reader.dis.readLong();
         this.ag = var1.reader.dis.readLong();
         this.ah = var1.reader.dis.readLong();
         this.ai = var1.reader.dis.readLong();
         this.ak = var1.reader.dis.readLong();
         this.al = var1.reader.dis.readLong();
         this.aj = var1.reader.dis.readLong();
         this.Z = var1.reader.dis.readLong();
         this.J = var1.reader.dis.readInt();

         try {
            this.am = var1.reader.dis.readLong();
            this.an = var1.reader.dis.readLong();
            this.ao = var1.reader.dis.readLong();
            this.ap = var1.reader.dis.readLong();
            this.aq = var1.reader.dis.readLong();
         } catch (Exception var7) {
         }

         if (!this.O) {
            this.t[2].d[3] = true;
         }

         long var11 = Utlis.time();
         if (this.af >= 0L && (this.af < var11 || var11 < this.am)) {
            this.t[0].d[3] = true;
         }

         if (this.ag >= 0L && (this.ag < var11 || var11 < this.an)) {
            this.t[0].d[4] = true;
         }

         if (this.ah >= 0L && (this.ah < var11 || var11 < this.ao)) {
            this.t[1].d[0] = true;
         }

         if (this.ai >= 0L && (this.ai < var11 || var11 < this.ap)) {
            this.t[1].d[1] = true;
         }

         if (this.Y >= 0L && (this.Y < var11 || var11 < this.aj)) {
            this.t[1].d[2] = true;
         }

         if (this.ad >= 0L && (this.ad < var11 || var11 < this.ak)) {
            this.t[1].d[3] = true;
         }

         if (this.ae >= 0L && (this.ae < var11 || var11 < this.al)) {
            this.t[1].d[4] = true;
         }
      } catch (Exception var8) {
      }

      this.e();
   }

   public void e() {
      boolean var1 = false;

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         this.m[var2] = false;

         for(int var3 = 0; var3 < this.b[var2].length; ++var3) {
            this.t[var2].c[var3] = false;
            if (var2 == 2 && var3 == 3 && this.f() > 0) {
               this.t[var2].c[var3] = true;
               this.m[var2] = true;
               var1 = true;
            }

            for(int var4 = 0; var4 < this.b[var2][var3].length; ++var4) {
               if (this.b[var2][var3][var4].e) {
                  this.t[var2].c[var3] = true;
                  this.m[var2] = true;
                  var1 = true;
                  break;
               }
            }
         }
      }

      GameSrc.gI().as = var1;
   }

   public void a(Graphics var1) {
      super.a(var1);
      this.t[this.k()].a((Graphics)var1, -11);
      this.t[this.k()].a(var1, this.cx, this.cy);
      label122:
      switch(this.k()) {
      case 0:
         switch(this.t[this.k()].b.b) {
         case 0:
            if (this.aq > 0L) {
               mFont.a((mFont)mFont.d, (Graphics)var1, Caption.qO + Utlis.e(this.aq), this.t[this.k()].width + 10, this.height - 30, 0, -2560, 0);
            }

            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.lB + this.B / '\uea60' + " " + Caption.kb, this.t[this.k()].width + 10, this.height - 18, 0, -1, 0);
            break label122;
         case 1:
            DataCenter.gI();
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.lC + this.C + " " + Caption.rw[2], this.t[this.k()].width + 10, this.height - 26, 0, -1, 0);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.lD, this.t[this.k()].width + 10, this.height - 16, 0, -1, 0);
            break label122;
         case 2:
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.lE + Char.gI().s(), this.t[this.k()].width + 10, this.height - 18, 0, -1, 0);
            break label122;
         case 3:
            DataCenter.gI();
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.lI + Utlis.numberFormat(this.H) + " " + Caption.rs[0], this.t[this.k()].width + 10, this.height - 30, 0, -1, 0);
            if (this.af >= 0L) {
               if (Utlis.time() > this.af) {
                  mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mF, this.t[this.k()].width + 10, this.height - 18, 0, -65536, 0);
               } else {
                  mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mE + Utlis.e(this.af), this.t[this.k()].width + 10, this.height - 18, 0, -2560, 0);
               }
            }
            break label122;
         case 4:
            DataCenter.gI();
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.lJ + Utlis.numberFormat(this.I) + " " + Caption.rs[0], this.t[this.k()].width + 10, this.height - 30, 0, -1, 0);
            if (this.ag >= 0L) {
               if (Utlis.time() > this.ag) {
                  mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mF, this.t[this.k()].width + 10, this.height - 18, 0, -65536, 0);
               } else {
                  mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mE + Utlis.e(this.ag), this.t[this.k()].width + 10, this.height - 18, 0, -2560, 0);
               }
            }
         default:
            break label122;
         }
      case 1:
         byte var4;
         switch(this.t[this.k()].b.b) {
         case 0:
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.lG + Utlis.numberFormat(this.F) + " " + Caption.lA, this.t[this.k()].width + 10, this.height - 30, 0, -1, 0);
            if (this.ah >= 0L) {
               if (Utlis.time() > this.ah) {
                  mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mF, this.t[this.k()].width + 10, this.height - 18, 0, -65536, 0);
               } else {
                  mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mE + Utlis.e(this.ah), this.t[this.k()].width + 10, this.height - 18, 0, -2560, 0);
               }
            }
            break label122;
         case 1:
            DataCenter.gI();
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.lH + Utlis.numberFormat(this.G) + " " + Caption.lA, this.t[this.k()].width + 10, this.height - 30, 0, -1, 0);
            if (this.ai >= 0L) {
               if (Utlis.time() > this.ai) {
                  mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mF, this.t[this.k()].width + 10, this.height - 18, 0, -65536, 0);
               } else {
                  mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mE + Utlis.e(this.ai), this.t[this.k()].width + 10, this.height - 18, 0, -2560, 0);
               }
            }
            break label122;
         case 2:
            if (this.Y >= 0L) {
               DataCenter.gI();
               mFont.a((mFont)mFont.d, (Graphics)var1, Utlis.replaceAll(Caption.mD, "" + this.R), this.t[this.k()].width + 10, this.height - 30, 0, -1, 0);
               mFont.a((mFont)mFont.d, (Graphics)var1, Caption.hR + ": " + Utlis.d(this.aj) + " - " + Utlis.d(this.Y), this.t[this.k()].width + 10, this.height - 18, 0, -2560, 0);
            } else {
               mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mF, this.t[this.k()].width + 10, this.height - 18, 0, -65536, 0);
            }
            break label122;
         case 3:
            var4 = 0;
            if (this.ad >= 0L) {
               var4 = 12;
               if (Utlis.time() > this.ad) {
                  mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mF, this.t[this.k()].width + 10, this.height - 18, 0, -65536, 0);
               } else {
                  mFont.a((mFont)mFont.d, (Graphics)var1, Caption.hR + ": " + Utlis.d(this.ak) + " - " + Utlis.d(this.ad), this.t[this.k()].width + 10, this.height - 18, 0, -2560, 0);
               }
            }

            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mG, this.t[this.k()].width + 10, this.height - 42 - var4, 0, -1, 0);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mH, this.t[this.k()].width + 10, this.height - 30 - var4, 0, -1, 0);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.oH, this.t[this.k()].width + 10, this.height - 18 - var4, 0, -1, 0);
            break label122;
         case 4:
            var4 = 0;
            if (this.ae >= 0L) {
               var4 = 12;
               if (Utlis.time() > this.ae) {
                  mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mF, this.t[this.k()].width + 10, this.height - 18, 0, -65536, 0);
               } else {
                  mFont.a((mFont)mFont.d, (Graphics)var1, Caption.hR + ": " + Utlis.d(this.al) + " - " + Utlis.d(this.ae), this.t[this.k()].width + 10, this.height - 18, 0, -2560, 0);
               }
            }

            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mI, this.t[this.k()].width + 10, this.height - 42 - var4, 0, -1, 0);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mJ, this.t[this.k()].width + 10, this.height - 30 - var4, 0, -1, 0);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.oH, this.t[this.k()].width + 10, this.height - 18 - var4, 0, -1, 0);
         default:
            break label122;
         }
      case 2:
         switch(this.t[this.k()].b.b) {
         case 0:
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.lF + Utlis.numberFormat(this.E) + " " + Caption.lA, this.t[this.k()].width + 10, this.height - 18, 0, -1, 0);
            break label122;
         case 1:
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mK, this.t[this.k()].width + 10, this.height - 30, 0, -7812062, 0);
            var1.f(-7812062);
            var1.c(this.t[this.k()].width + 10, this.height - 26, mFont.b(mFont.d, Caption.mK), 1);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mL + this.S, this.t[this.k()].width + 10, this.height - 18, 0, -1, 0);
            break label122;
         case 2:
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.lO + Utlis.numberFormat(this.D), this.t[this.k()].width + 10, this.height - 30, 0, -1, 0);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.lP, this.t[this.k()].width + 10, this.height - 18, 0, -1, 0);
            break label122;
         case 3:
            DataCenter.gI();
            boolean var3 = true;
            var1.k = var3;
            LangLa_fq.a(var1, 710, this.c, this.t[this.k()].width + (this.width - this.t[this.k()].width) / 2, this.t[this.k()].cy + (this.height - this.t[this.k()].cy) / 2 - 5, 3);
            var3 = false;
            var1.k = var3;
            LangLa_fq.a(var1, 708, 0, this.t[this.k()].width + (this.width - this.t[this.k()].width) / 2, this.t[this.k()].cy + (this.height - this.t[this.k()].cy) / 2 - 70, 3);
            mFont.a((mFont)mFont.d, (Graphics)var1, Utlis.replaceAll(Caption.oP, Utlis.numberFormat(this.J)), this.t[this.k()].width + 109, 41, 2, -16711681, 0);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mK, this.t[this.k()].width + 10, this.height - 54, 0, -7812062, 0);
            var1.f(-7812062);
            var1.c(this.t[this.k()].width + 10, this.height - 50, mFont.b(mFont.d, Caption.mK), 1);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mM + this.f(), this.t[this.k()].width + 10, this.height - 42, 0, -1, 0);
            int var2;
            if ((var2 = this.T + 1) > 5) {
               var2 = 5;
            }

            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mN + this.ar[var2] + Caption.mO, this.t[this.k()].width + 10, this.height - 30, 0, -1, 0);
            if (this.ac < Utlis.time()) {
               mFont.a((mFont)mFont.d, (Graphics)var1, Caption.hR + ": " + Utlis.d(this.Z) + " - " + Utlis.d(this.aa), this.t[this.k()].width + 10, this.height - 18, 0, -2560, 0);
            } else {
               mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mF, this.t[this.k()].width + 10, this.height - 18, 0, -65536, 0);
            }
         default:
            break label122;
         }
      case 3:
         switch(this.t[this.k()].b.b) {
         case 0:
            DataCenter.gI();
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.nd, this.t[this.k()].width + 10, this.height - 30, 0, -1, 0);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.ne, this.t[this.k()].width + 10, this.height - 18, 0, -1, 0);
            break label122;
         case 1:
            DataCenter.gI();
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mV, this.t[this.k()].width + 10, this.height - 30, 0, -1, 0);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.ne, this.t[this.k()].width + 10, this.height - 18, 0, -1, 0);
            break label122;
         case 2:
            if (this.ab >= 0L && Utlis.time() > this.ab) {
               mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mF, this.t[this.k()].width + 10, this.height - 18, 0, -65536, 0);
            } else {
               DataCenter.gI();
               mFont.a((mFont)mFont.d, (Graphics)var1, Caption.nf + this.Q, this.t[this.k()].width + 10, this.height - 30, 0, -1, 0);
               if (this.ab >= 0L) {
                  mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mE + Utlis.e(this.ab), this.t[this.k()].width + 10, this.height - 18, 0, -2560, 0);
               } else {
                  mFont.a((mFont)mFont.d, (Graphics)var1, Caption.ng, this.t[this.k()].width + 10, this.height - 18, 0, -1, 0);
               }
            }
         default:
            break label122;
         }
      case 4:
         DataCenter.gI();
         DataCenter.gI();
         switch(this.t[this.k()].b.b) {
         case 0:
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mP, this.t[this.k()].width + 10, this.t[this.k()].cy + 20 + 5, 0, -1, 0);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mQ, this.t[this.k()].width + 10, this.t[this.k()].cy + 20 + 5 + 15, 0, -1, 0);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mR, this.t[this.k()].width + 10, this.t[this.k()].cy + 20 + 5 + 30, 0, -1, 0);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mS, this.t[this.k()].width + 10, this.t[this.k()].cy + 20 + 5 + 45, 0, -1, 0);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mT, this.t[this.k()].width + 10, this.t[this.k()].cy + 20 + 5 + 60, 0, -1, 0);
            if (this.K >= 0L) {
               mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mU + Utlis.e(this.K + 86399000L), this.t[this.k()].width + 10, this.t[this.k()].cy + 5 + 90, 0, -2560, 0);
            }
            break;
         case 1:
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mV, this.t[this.k()].width + 10, this.t[this.k()].cy + 20 + 5, 0, -1, 0);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mW, this.t[this.k()].width + 10, this.t[this.k()].cy + 20 + 5 + 15, 0, -1, 0);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mX, this.t[this.k()].width + 10, this.t[this.k()].cy + 20 + 5 + 30, 0, -1, 0);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mY, this.t[this.k()].width + 10, this.t[this.k()].cy + 20 + 5 + 45, 0, -1, 0);
            mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mZ, this.t[this.k()].width + 10, this.t[this.k()].cy + 20 + 5 + 60, 0, -1, 0);
            if (this.L >= 0L) {
               mFont.a((mFont)mFont.d, (Graphics)var1, Caption.na, this.t[this.k()].width + 10, this.t[this.k()].cy + 5 + 90, 0, -2560, 0);
            }
            break;
         case 2:
            if (this.ac >= 0L && Utlis.time() > this.ac) {
               mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mF, this.t[this.k()].width + 10, this.height - 18, 0, -65536, 0);
            } else {
               mFont.a((mFont)mFont.d, (Graphics)var1, Caption.nb + this.P, this.t[this.k()].width + 10, this.height - 30, 0, -1, 0);
               if (this.ac >= 0L) {
                  mFont.a((mFont)mFont.d, (Graphics)var1, Caption.mE + Utlis.e(this.ac), this.t[this.k()].width + 10, this.height - 18, 0, -2560, 0);
               } else {
                  mFont.a((mFont)mFont.d, (Graphics)var1, Caption.nc, this.t[this.k()].width + 10, this.height - 18, 0, -1, 0);
               }
            }
         }
      }

      this.a(var1, this.o[this.k()][this.t[this.k()].b.b]);
      this.e(var1);
      this.b(var1);
   }

   private void e(Graphics var1) {
      this.y = 0;
      this.z = 0;
      int var2 = 0;
      int var10000 = var1.a;
      var10000 = var1.b;

      for(int var6 = 0; var6 < this.o[this.k()][this.t[this.k()].b.b].i; ++var6) {
         this.z = var6 * this.x;

         for(int var7 = 0; var7 < this.o[this.k()][this.t[this.k()].b.b].r; ++var7) {
            this.y = var7 * this.w;
            if (this.o[this.k()][this.t[this.k()].b.b].b(var6)) {
               LangLa_jv var5 = this.b[this.k()][this.t[this.k()].b.b][var2];
               this.a(var1, this.y, this.z, this.w - 3, this.x - 3, -22, 55, 56);
               mFont.a((mFont)mFont.b, (Graphics)var1, var5.b, this.y + this.w / 2, this.z + 9, 2, -1, -10275328);
               b(var1, this.y + 9, this.z + 16, var5.d, this.A == var2);
               int var3 = var1.a;
               int var4 = var1.b;
               this.a(var1, var3 + this.a[this.k()][this.t[this.k()].b.b][var2].cx, var4 + this.a[this.k()][this.t[this.k()].b.b][var2].cy);
               this.a[this.k()][this.t[this.k()].b.b][var2].a(!var5.e);
               this.a[this.k()][this.t[this.k()].b.b][var2].a(var1);
               this.a(var1, var3, var4);
            }

            ++var2;
            if (var2 >= this.a[this.k()][this.t[this.k()].b.b].length) {
               break;
            }
         }

         if (var2 >= this.a[this.k()][this.t[this.k()].b.b].length) {
            break;
         }
      }

   }

   public void a(int var1) {
      super.a(var1);
      this.t[this.k()].a(this.t[this.k()].b.b);
   }

   public void b() {
      this.t[this.k()].a();
      this.o[this.k()][this.t[this.k()].b.b].a();

      for(int var1 = 0; var1 < this.a[this.k()][this.t[this.k()].b.b].length; ++var1) {
         this.a[this.k()][this.t[this.k()].b.b][var1].b();
         this.s[this.k()][this.t[this.k()].b.b][var1].a();
         if (this.s[this.k()][this.t[this.k()].b.b][var1].l != -1) {
            this.a[this.k()][this.t[this.k()].b.b][var1].h = true;
         } else {
            this.a[this.k()][this.t[this.k()].b.b][var1].h = false;
         }
      }

      if (this.K >= 0L) {
         this.V[0].a = Caption.nh;
         this.V[0].a(true);
         this.V[0].d = 9;
      }

      if (this.L >= 0L) {
         this.V[1].a = Caption.nh;
         this.V[1].a(true);
         this.V[1].d = 9;
      }

      if (this.M) {
         this.U[0].a = Caption.nh;
         this.U[0].a(true);
         this.U[0].d = 9;
      }

      if (this.N) {
         this.U[1].a = Caption.nh;
         this.U[1].a(true);
         this.U[1].d = 9;
      }

      if (this.v) {
         ++this.f;
         this.c += this.d;
         if (this.c >= 360) {
            this.c = 0;
         }

         if (this.f % 5 == 0 && this.e >= 0) {
            this.d -= 5;
            if (this.d < 5) {
               this.d = 5;
               LangLa_bh var3 = this.u[this.e];
               if (this.c - this.g >= var3.a && this.c <= var3.b) {
                  this.v = false;
                  if (this.j > 0) {
                     String var4 = Caption.k + " " + Utlis.numberFormat(this.j) + " " + Caption.rs[1];
                     DataCenter.gI().currentScreen.showMessage(var4, -2560);
                     this.j = 0;
                  }
               }
            }
         }
      }

   }

   public void a(int var1, Object var2, LangLa_cy var3) {
   }

   public Vector c() {
      Vector var1 = super.c();

      for(int var4 = 0; var4 < this.b[this.k()][this.t[this.k()].b.b].length; ++var4) {
         int var2 = this.o[this.k()][this.t[this.k()].b.b].cx + this.a[this.k()][this.t[this.k()].b.b][var4].cx;
         int var3 = this.o[this.k()][this.t[this.k()].b.b].cy + this.a[this.k()][this.t[this.k()].b.b][var4].cy - this.o[this.k()][this.t[this.k()].b.b].f;
         if (Utlis.inRange(this.o[this.k()][this.t[this.k()].b.b].cx, this.o[this.k()][this.t[this.k()].b.b].cy, this.o[this.k()][this.t[this.k()].b.b].cx + this.o[this.k()][this.t[this.k()].b.b].width, this.o[this.k()][this.t[this.k()].b.b].cy + this.o[this.k()][this.t[this.k()].b.b].height, var2, var3) && Utlis.inRange(this.o[this.k()][this.t[this.k()].b.b].cx, this.o[this.k()][this.t[this.k()].b.b].cy, this.o[this.k()][this.t[this.k()].b.b].cx + this.o[this.k()][this.t[this.k()].b.b].width, this.o[this.k()][this.t[this.k()].b.b].cy + this.o[this.k()][this.t[this.k()].b.b].height, var2 + this.a[this.k()][this.t[this.k()].b.b][var4].width, var3 + this.a[this.k()][this.t[this.k()].b.b][var4].height)) {
            this.s[this.k()][this.t[this.k()].b.b][var4].cx = (short)var2;
            this.s[this.k()][this.t[this.k()].b.b][var4].cy = (short)var3;
            var1.addElement(new LangLa_jz(2000, this.s[this.k()][this.t[this.k()].b.b][var4].cx, this.s[this.k()][this.t[this.k()].b.b][var4].cy, this.s[this.k()][this.t[this.k()].b.b][var4].cx + this.s[this.k()][this.t[this.k()].b.b][var4].width, this.s[this.k()][this.t[this.k()].b.b][var4].cy + this.s[this.k()][this.t[this.k()].b.b][var4].height, this.s[this.k()][this.t[this.k()].b.b][var4], this, this.b[this.k()][this.t[this.k()].b.b][var4]));
            var1.addElement(new LangLa_jz(3000, var2 + 3, var3 - 32, var2 + 3 + 28, var3 - 32 + 28, this.o[this.k()][this.t[this.k()].b.b], this, var4));
         }
      }

      if (this.k() == 2 && this.t[this.k()].b.b == 1) {
         var1.addElement(new LangLa_jz(1204, this.t[this.k()].width + 7, this.height - 36, this.t[this.k()].width + 47, this.height - 25, (LangLa_ii)null, this));
      }

      if (this.k() == 2 && this.t[this.k()].b.b == 3) {
         DataCenter.gI();
         var1.addElement(new LangLa_jz(1207, this.t[this.k()].width + 7, this.height - 60, this.t[this.k()].width + 47, this.height - 49, (LangLa_ii)null, this));
      }

      var1.addElement(this.t[this.k()].b());
      var1.addElement(new LangLa_jz(1002, this.o[this.k()][this.t[this.k()].b.b].cx, this.o[this.k()][this.t[this.k()].b.b].cy, this.o[this.k()][this.t[this.k()].b.b].cx + this.o[this.k()][this.t[this.k()].b.b].width, this.o[this.k()][this.t[this.k()].b.b].cy + this.o[this.k()][this.t[this.k()].b.b].height, this.o[this.k()][this.t[this.k()].b.b], this));
      return var1;
   }

   public void a(int var1, Object var2) {
   }

   public void a(LangLa_jz var1, int var2, int var3) {
      if (!this.v) {
         super.a(var1, var2, var3);
         this.A = -1;
         switch(var1.b) {
         case 1001:
            if (var1.j.k >= 0) {
               this.t[this.k()].a(var1.j.k);
               return;
            }
            break;
         case 1200:
            try {
               Message.c((byte)-66).send();
               break;
            } catch (Exception var8) {
               return;
            }
         case 1201:
            try {
               Message.c((byte)-65).send();
               break;
            } catch (Exception var7) {
               return;
            }
         case 1202:
            try {
               Message.c((byte)-63).send();
               break;
            } catch (Exception var6) {
               return;
            }
         case 1203:
            try {
               Message.c((byte)-62).send();
               break;
            } catch (Exception var5) {
               return;
            }
         case 1204:
            this.cL = a(Caption.ni, this, this.t[this.k()].width + 45, this.height - 124, 200);
            return;
         case 1205:
            LangLa_bg var11 = this;

            try {
               var11.T = var11.i;
               if (!var11.v) {
                  if (var11.f() > 0) {
                     var11.v = true;
                     var11.c = 0;
                     var11.d = Utlis.nextInt(35, 50);
                     var11.g = Utlis.nextInt(5, 50);
                     var11.e = -1;
                  }

                  Message.c((byte)-60).send();
               }
               break;
            } catch (Exception var4) {
               return;
            }
         case 1206:
            this.J();
            return;
         case 1207:
            this.cL = a(Caption.nj, this, this.t[this.k()].width + 45, this.height - 160, 220);
            break;
         case 2000:
            LangLa_jv var10 = (LangLa_jv)var1.k;

            try {
               if (var10.e) {
                  Message var12;
                  (var12 = Message.c((byte)-70)).writeShort(var10.a);
                  var12.send();
               }
               break;
            } catch (Exception var9) {
               return;
            }
         case 3000:
            this.A = (Integer)var1.k;
            this.cL = a(this, var2, var3, 28, this.b[this.k()][this.t[this.k()].b.b][this.A].d);
            return;
         }

      }
   }

   private int f() {
      for(int var1 = this.ar.length - 1; var1 >= 0; --var1) {
         if (this.J >= this.ar[var1]) {
            return var1 - this.i;
         }
      }

      return 0;
   }
}
