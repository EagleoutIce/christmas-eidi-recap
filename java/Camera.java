import java.util.Arrays;

public final class Camera {
   private int x, y, z;
   private boolean recording;

   private Camera() {
      x = y = z = 0;
      recording = false;
   }

   private static Camera[] cameras = new Camera[5];

   public static Camera get(int n) {
      if(n < 0 || n >= 5) return null;
      if(cameras[n] == null)
         cameras[n] = new Camera();
      return cameras[n];
   }

   public void move(int dx, int dy, int dz) {
      x += dx; y += dy; z += dz;
   }

   public void record() {
      this.recording = true;
   }

   public void stop() {
      this.recording = false;
   }

   public int[] position() {
      return new int[]{x, y, z};
   }

   public boolean running() {
      return this.recording;
   }

   @Override
   public String toString() {
      return "{ rec: " + recording + " pos: (" + x + ", " + y + ", " + z + ") }";
   }

   public static void main(String[] args) {
      Camera.get(0).move(1, 2, 3);
      Camera.get(3).record();
      Camera.get(2).move(5, -2, 7);
      Camera.get(0).move(2, 0, 1);

      System.out.println(Arrays.toString(Camera.cameras));

      for(int i = -2; i < 8; i++) {
         System.out.println(i + ": " + Camera.get(i));
      }
   }
}
