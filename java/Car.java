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

   public String toString() {
      return "Car [pengu=" + pengu + ", topSpeed=" + topSpeed + "]";
   }

   public static void main(String[] args) {
      System.out.println(new Car());
      System.out.println(new Car(14));
      System.out.println(new Car(2, false));
   }
}