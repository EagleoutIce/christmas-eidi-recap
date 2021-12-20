public class TileCountry {

   static int[][][] newLand(int width, int height) {
      int[][][] board = new int[height][width][2]; // two transport types
      for(int y = 0; y < height; y++) {
         for(int x = 0; x < width; x++) {
            board[y][x] = new int[]{-1, -1};
         }
      }
      return board;
   }

   static boolean set(int[][][] board, int x, int y, int foot, int boat) {
      if(y < 0 ||  x < 0 || y >= board.length || x >= board[y].length)
         return false;
      board[y][x] = new int[]{foot, boat};
      return true;
   }

   static int costs(int[][][] board, int x, int y, boolean byBoat) {
      if(y < 0 ||  x < 0 || y >= board.length || x >= board[y].length)
         return -1;
      int[] cell = board[y][x];
      return byBoat ? cell[1] : cell[0];
   }

   public static void main(String[] args) {
      // =)
      int[][][] board = newLand(0, 0);
      System.out.println("false: " + set(board, 3, 2, 5, -1));
      System.out.println("false: " + set(board, 0, 0, 0, 9));
      System.out.println("false: " + set(board, -1, -1, 5, 7));
      System.out.println("-1: " + costs(board, 12, 3, true));
      System.out.println("-1: " + costs(board, 0, 0, true));
      System.out.println("-1: " + costs(board, 5, -4, false));
      System.out.println("-1: " + costs(board, -2, 6, false));
      board = newLand(4, 5);
      System.out.println("true: " + set(board, 3, 2, 5, -1));
      System.out.println("true: " + set(board, 0, 0, 1, 9));
      System.out.println("false: " + set(board, -1, -1, 5, 7));
      System.out.println("5: " + costs(board, 3, 2, false));
      System.out.println("9: " + costs(board, 0, 0, true));
      System.out.println("-1: " + costs(board, 5, -4, false));
      System.out.println("-1: " + costs(board, -2, 6, false));
   }

}
