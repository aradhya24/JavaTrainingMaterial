package ii__Structural.f__decorator;

//Step 4: Concrete Decorator
class SportsCar extends CarDecorator {
 public SportsCar(Car car) {
     super(car);
 }
 public String assemble() {
     return super.assemble() + " + Sports Features";
 }
}
