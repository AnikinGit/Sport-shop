package app;

public class Oder {
    private final Item tShirt;
    private final Item cap;

    public Oder(Item tShirt, Item cap) {
        this.tShirt = tShirt;
        this.cap = cap;
    }

    public void printOrderDetails() {
        System.out.println("Item: " + tShirt.getName() + ", Brand: " + tShirt.getBrand() +
                ", Price: " + tShirt.getPrice());
        System.out.println("Item: " + cap.getName() + ", Brand: " + cap.getBrand() +
                ", Price: " + cap.getPrice());
        System.out.println("Total Order Price: " + (tShirt.getPrice() + cap.getPrice()));
    }
}
