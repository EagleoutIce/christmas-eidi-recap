public class Loops {

   static void forLoop(int k) {
      int[] x = new int[] { 17, 22, 13, 0 };
      for (int i = 0; i < x.length - k; i += 1) {
         System.out.println(x[i]);
      }
   }

   static void forLoopDoWhile(int k) {
      int[] x = new int[] { 17, 22, 13, 0 };
      if (x.length - k <= 0)
         return;
      int i = 0;
      do {
         System.out.println(x[i]);
         i++;
      } while (i < x.length - k);
   }

   static void doWhile(int k) {
      int i = 1;
      do {
         i *= k;
         k -= i;
      } while (k >= 5);
      System.out.println(i);
   }

   static void doWhileFor(int k) {
      int i = 1;
      if (k < 5) {
         i *= k;
         k -= i;
      } else {
         for (; k >= 5; k -= i) {
            i *= k;
         }
      }
      System.out.println(i);
   }

   public static double[] funFunFun(int factor, double... arguments) {
      for (int i = 0; i < arguments.length; i++) {
         arguments[i] *= factor;
      }
      return arguments;
   }

   public static void main(String[] args) {
      forLoop(1);
      forLoopDoWhile(1);
      System.out.println("---");
      forLoop(2);
      forLoopDoWhile(2);
      System.out.println("---");
      forLoop(5);
      forLoopDoWhile(5);
      System.out.println("---");
      doWhile(1);
      doWhileFor(1);
      System.out.println("---");
      doWhile(2);
      doWhileFor(2);
      System.out.println("---");
      doWhile(5);
      doWhileFor(5);
      System.out.println("---");

   }
}
