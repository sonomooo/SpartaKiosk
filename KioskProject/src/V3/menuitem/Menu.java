package V3.menuitem;

public class Menu {
    private String name;

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;

    }

    public String getName() {
        return name;
    }
}
