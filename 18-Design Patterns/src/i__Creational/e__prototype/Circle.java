package i__Creational.e__prototype;

public class Circle implements IShape {
    int radius;
    String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public IShape clone() {
        return new Circle(this.radius, this.color);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}

