package V3;

import V3.menuitem.Burger;
import V3.menuitem.Dessert;
import V3.menuitem.Drink;

import java.util.ArrayList;
import java.util.List;

public class MenuV3 {
    List<Burger> burgerMenu = new ArrayList<>();
    List<Dessert> MainMenu = new ArrayList<>();
    List<Drink> drinkMenu = new ArrayList<>();
    List<V3.Menu.MainMenu> mainMenu = new ArrayList<>();
//    BurgerMenu burgerList = new BurgerMenu();

    @Override
    public String toString() {
        return "MenuV3{" +
                "burguerMenu=" + burgerMenu +
                ", dessertMenu=" + MainMenu +
                ", drinkMenu=" + drinkMenu +
                ", mainMenu=" + mainMenu +
                '}';
    }

    public List<Burger> getBurgerMenu() {

        return burgerMenu;
    }

//    public List<Dessert> getMainMenu() {
//        return MainMenu;
//    }
//
//    public List<Drink> getDrinkMenu() {
//        return drinkMenu;
//    }
//
//    public List<V3.Menu.mainMenu> getMainMenu() {
//        return mainMenu;
//    }
}
