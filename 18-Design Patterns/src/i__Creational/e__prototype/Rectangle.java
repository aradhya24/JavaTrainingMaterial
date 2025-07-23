package i__Creational.e__prototype;

public class Rectangle implements IShape {
    int width;
    int height;
    String color;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public IShape clone() {
        return new Rectangle(this.width, this.height, this.color);
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + "]";
    }
}
