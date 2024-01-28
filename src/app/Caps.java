package app;

public class Caps implements Item {
    private final String color;
    private final String brand;

    public Caps(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    @Override
    public String getName() {
        return color + " Cap";
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public double getPrice() {
        // Ваша логіка визначення ціни для кепки
        return 15.0;
    }
}
