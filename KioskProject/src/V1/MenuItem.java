package V1;

import java.util.ArrayList;
import java.util.List;

    public class MenuItem {
        List<String> menuList = new ArrayList<>();

        String burgerName;
        int price;
        String explain;

        public List<String> showMenu(){
            List<String> menuList = new ArrayList<>();

            menuList.add("[SHAKESHACK MENU ]");
            menuList.add("1. ShackBurger | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            menuList.add("2. SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            menuList.add("3. Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            menuList.add("4. Hamburger | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            menuList.add("0. 종료 | 종료");

            return menuList;
        }

}
