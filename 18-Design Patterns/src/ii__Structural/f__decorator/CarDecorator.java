package ii__Structural.f__decorator;

//Step 3: Decorator (Abstract)
class CarDecorator implements Car {
 protected Car car;
 public CarDecorator(Car car) {
     this.car = car;
 }
 public String assemble() {
     return car.assemble();
 }
}
