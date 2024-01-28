package app;

public class Tshirts implements Item {

    private final String color;
    private final String brand;

    public Tshirts(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }
    @Override
    public String getName() {
        return color + " T-Shirt";
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public double getPrice() {
        return 20.0;
    }

}
