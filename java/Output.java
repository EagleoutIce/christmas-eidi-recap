public class Output {

   public static void show(Object obj) {
      System.out.println(obj.getClass().getName() + ": " + obj);
   }

   public static void main(String[] args) {
      show(14 - 3D * 2 / 12);
      show((char) ((byte) 'a' + 3) + " Sonne");
      show(14 - 2 + (3 > 9 || true ^ false ? "Hallo" : "Welt"));
      show(7/2 - 3 * 2.5 + 2f);
   }
}
