package V2;

public class MenuItemV2 {
    String name;
    Double price;
    String explain;

    public MenuItemV2(String name, Double price, String explain) {
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
}
