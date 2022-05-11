public class Example {
   public static int main;
   public static String a = "Hallo";

   public static void main(String[] args) {
      int a = 7;
      int b = 15;
      System.out.println("A: " + a + "; " + main); // i)
      {
         float main = 3 * b++;
         Example.a += b;
         System.out.println("B: " + b + "; " + main); // ii)
      }
      System.out.println("C: " + a + "; " + b + "; " + main); // iii)
      System.out.println("D: " + Example.a + "; " + Example.main); // iv)
   }
}
