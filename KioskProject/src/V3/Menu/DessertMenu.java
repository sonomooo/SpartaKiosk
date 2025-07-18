package V3.Menu;

import V3.MenuV3;
import V3.menuitem.Dessert;

import java.util.ArrayList;
import java.util.List;

public class DessertMenu extends MenuV3 {

    private List<Dessert> dessertMenu = new ArrayList<>();

    public DessertMenu() {
        dessertMenu.add(new Dessert("초코 케이크",4.5, "초코가 가득 든 케이크"));
        dessertMenu.add(new Dessert("딸기 케이크", 4.5, "딸기가 가득 든 케이크"));
        dessertMenu.add(new Dessert("치즈 케이크", 4.5, "치즈가 가득 든 케이크"));
        dessertMenu.add(new Dessert("땅콩 케이크", 4.5, "땅콩이 가득 든 케이크"));
    }

    public List<Dessert> getDessertMenu() {
        return dessertMenu;
    }
}
