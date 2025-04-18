package week8.labs.Task2;

public class Product<T extends Comparable<T>> {
    private String name;
    private T price;

    public Product(String name, T price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public T getPrice() {
        return price;
    }

    public String comparePrice(Product<T> other) {
        int result = this.price.compareTo(other.price);

        if (result > 0) {
            return "Product " + this.name + " is more expensive than " + other.name;
        } else if (result < 0) {
            return "Product " + this.name + " is cheaper than " + other.name;
        } else {
            return "Product " + this.name + " and " + other.name + " have the same price";
        }
    }
}

