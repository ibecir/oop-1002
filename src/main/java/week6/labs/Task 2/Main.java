public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Circle("Red", 3),
            new Rectangle("Blue", 4, 5)
        };

        for (Shape shape : shapes) {
            System.out.println("Color: " + shape.getColor() + ", Area: " + shape.getArea());
        }
    }
}