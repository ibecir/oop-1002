package week7.labs.Task3;
public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();
}
