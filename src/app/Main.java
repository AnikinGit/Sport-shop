package app;

public class Main {
    public static void main(String[] args) {
        Oder oderA = new OrderBuilder()
                .addTShirt("Red", "Active sports")
                .addCap("White", "Smart caps")
                .build();

       Oder orderB = new OrderBuilder()
                .addTShirt("Blue", "Active sports")
                .addCap("Black", "Smart caps")
                .build();

        oderA.printOrderDetails();
        System.out.println();
        orderB.printOrderDetails();
    }
}
