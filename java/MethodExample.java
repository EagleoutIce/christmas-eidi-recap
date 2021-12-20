public class MethodExample {
   public static char a;
   public static int b = 5;
   public static int c = 3;

   static int x(int a) {
      a = a * a;
      return b + 2;
   }

   static int x(char[] b) {
      a += b[1];
      return b[0];
   }

   static String x() {
      String b = "Hallo";
      return b;
   }

   public static void main(String[] args) {
      // 1)
      System.out.printf("a: %c, b: %d, c: %d%n", a, b, c);
      String c = x();
      // 2)
      System.out.printf("a: %c, b: %d, c: %s%n", a, b, c);
      x(c.toCharArray());
      // 3)
      System.out.printf("a: %c, b: %d, c: %s%n", a, b, c);
      int b = x(a);
      // 4)
      System.out.printf("a: %c, b: %d, c: %s%n", a, b, c);
   }
}
