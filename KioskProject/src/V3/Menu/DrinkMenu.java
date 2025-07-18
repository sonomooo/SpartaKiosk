package V3.Menu;

import V3.MenuV3;
import V3.menuitem.Drink;

import java.util.ArrayList;
import java.util.List;

public class DrinkMenu extends MenuV3 {

    public List<Drink> getDrinkMenu() {
        return drinkMenu;
    }

    private List<Drink> drinkMenu = new ArrayList<>();

    public DrinkMenu() {
        drinkMenu.add(new Drink("아이스아메리카노", 3.9, "아메리카노"));
        drinkMenu.add(new Drink("아이스라떼", 3.9, "라떼"));
        drinkMenu.add(new Drink("제로 콜라", 1.9, "콜라"));
        drinkMenu.add(new Drink("제로 사이다", 1.9, "사이다"));
    }


}
