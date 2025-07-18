package V3.menuitem;

import V3.more.Basket;
import V3.more.Price;

public class Drink extends Basket {
    private String name;
    private Double price;
    private String explain;

    public Drink(String name, Double price, String explain) {
        this.explain = explain;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " | " +
                " W " + price + " | " + explain;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
