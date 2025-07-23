package ii__Structural.f__decorator;

class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }
    public String assemble() {
        return super.assemble() + " + Luxury Features";
    }
}
