package V3.Menu;

import V3.MenuV3;
import V3.menuitem.Menu;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends MenuV3 {

    private List<Menu> mainMenu = new ArrayList<>();

    public MainMenu() {
        mainMenu.add(new Menu("Burgers"));
        mainMenu.add(new Menu("Drinks"));
        mainMenu.add(new Menu("Desserts"));
    }

    public List<Menu> getMainMenu() {
        return mainMenu;
    }
}
