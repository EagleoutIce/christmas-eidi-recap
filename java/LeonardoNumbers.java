public class LeonardoNumbers {

   public static long L(int n) {
      if(n == 0 || n == 1) return 1;
      int l1 = 1, l2 = 1;
      for(int i = 0; i < n - 1; i++) {
         int tmp = l1; l1 = l2;
         l2 = tmp + l2 + 1;
      }
      return l2;
   }

   public static void main(String[] args) {
      for(int i = 0; i < 20; i ++) {
         System.out.println(i + ": " + L(i));
      }
   }

}