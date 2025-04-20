package week7.labs.Task3;
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Red", 3.0),
            new Rectangle("Blue", 4.0, 5.0)
        };

        for (Shape s : shapes) {
            System.out.println("Color: " + s.getColor() + ", Area: " + s.getArea());
        }
    }
}
