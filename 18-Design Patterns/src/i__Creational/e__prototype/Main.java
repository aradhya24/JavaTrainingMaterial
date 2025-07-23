package i__Creational.e__prototype;

public class Main {
    public static void main(String[] args) {
        // Original objects
        Circle originalCircle = new Circle(5, "Red");
        Rectangle originalRectangle = new Rectangle(10, 20, "Blue");

        // Clone using Prototype pattern
        Circle clonedCircle = (Circle) originalCircle.clone();
        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();

        // Modifying clone
        clonedCircle.color = "Green";

        // Output
        System.out.println("Original Circle: " + originalCircle);
        System.out.println("Cloned Circle: " + clonedCircle);

        System.out.println("Original Rectangle: " + originalRectangle);
        System.out.println("Cloned Rectangle: " + clonedRectangle);
    }
}

