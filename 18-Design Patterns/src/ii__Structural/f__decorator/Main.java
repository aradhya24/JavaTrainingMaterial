package ii__Structural.f__decorator;

//Client
public class Main {
 public static void main(String[] args) {
     Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
     System.out.println(sportsLuxuryCar.assemble());
     // Output: Basic Car + Luxury Features + Sports Features
 }
}