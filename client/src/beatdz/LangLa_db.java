package beatdz;import beatdz2.*;

 class LangLa_db implements Runnable {
   public void run() {
      while(!LangLa_ep.a()) {
         try {
            synchronized(LangLa_cz.cT) {
               try {
                  LangLa_cz.cT.wait(3600000L);
               } catch (Exception var4) {
                  Utlis.println(var4);
               }
            }

            while(LangLa_cz.cW.size() > 0) {
               LangLa_cz.a((LangLa_fb)LangLa_cz.cW.remove(0));
            }

            synchronized(LangLa_cz.cU) {
               LangLa_cz.cU.notify();
            }
         } catch (Exception var6) {
            Utlis.println(var6);
         }
      }

      LangLa_cz.cY = false;
   }
}
