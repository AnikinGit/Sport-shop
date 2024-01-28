package app;

public class OrderBuilder {
    private Item tShirt;
    private Item cap;

    public OrderBuilder addTShirt(String color, String brand) {
        this.tShirt = new Tshirts(color,brand);
        return this;
    }

    public OrderBuilder addCap(String color, String brand) {
        this.cap = new Caps(color, brand);
        return this;
    }
    public Oder build(){
        return new Oder(tShirt, cap);
    }
}
