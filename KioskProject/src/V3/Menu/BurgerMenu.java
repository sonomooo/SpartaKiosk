package V3.Menu;

import V3.MenuV3;
import V3.menuitem.Burger;

import java.util.ArrayList;
import java.util.List;

public class BurgerMenu extends MenuV3 {
    private List<Burger> burgerMenu = new ArrayList<>();

    @Override
    public List<Burger> getBurgerMenu() {
        return burgerMenu;
    }

    public BurgerMenu(){
        burgerMenu.add(new Burger("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.add(new Burger("SmokeBurger", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.add(new Burger("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.add(new Burger("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

//    public List<Burger> addBurgerMenu() {
//        burgerMenu.add(new Burger("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
//        burgerMenu.add(new Burger("SmokeBurger", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
//        burgerMenu.add(new Burger("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
//        burgerMenu.add(new Burger("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
//        return burgerMenu;
//    }


}
