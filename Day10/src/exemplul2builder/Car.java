package exemplul2builder;

public class Car {
    private int id;
    private String name;
    private double price;
    private String color;

    public Car setId(int id) {
        this.id = id;
        return this;
    }

    public Car setName(String name) {
        this.name = name;
        return this;
    }

    public Car setPrice(double price) {
        this.price = price;
        return this;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }
}
