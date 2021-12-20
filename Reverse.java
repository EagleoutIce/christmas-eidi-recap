import java.util.Arrays;

public class Reverse {

   static void swap(int[] arr, int i, int j) {
      int tmp = arr[i];
      arr[i] = arr[j];
      arr[j] = tmp;
   }

   static void reverse(int[] arr) {
      for(int i = 0; i < arr.length / 2; i++) {
         swap(arr, i, arr.length - i - 1);
      }
   }

   public static void main(String[] args) {
      int[] x = {1, 2, 7, 4};
      reverse(x);
      System.out.println(Arrays.toString(x));
      x = new int[]{};
      reverse(x);
      System.out.println(Arrays.toString(x));
      x = new int[]{5};
      reverse(x);
      System.out.println(Arrays.toString(x));
      x = new int[]{2, 3};
      reverse(x);
      System.out.println(Arrays.toString(x));
   }
}
