public class Car {
   int topSpeed;
   final boolean pengu;
   public Car(int top, boolean p) {
      this.topSpeed = top;
      this.pengu = p;
   }
   public Car(int top) {
      this(top, true);
      System.out.println("Piep");
   }
   public Car() { this(20); }

   public static void main(String[] args) {

   }
}