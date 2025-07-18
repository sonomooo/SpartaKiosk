package V2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) {
        List<MenuItemV2> menuList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        menuList.add(new MenuItemV2("ShackBurger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuList.add(new MenuItemV2("SmokeBurger",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuList.add(new MenuItemV2("Cheeseburger",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuList.add(new MenuItemV2("Hamburger",5.4,"비프패티를 기반으로 야채가 들어간 기본버거"));

        System.out.println("[SHAKESHACK MENU]");
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println((i + 1) + ". " + menuList.get(i));
            
        }
        System.out.println("0. 종료 | 종료");

        System.out.println("주문을 해주세요");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 0){
            System.out.println("종료합니다");
        } else {
            System.out.println(menuList.get(choice - 1));
            System.out.println(menuList.get(choice - 1).getName() + "을 주문받았습니다.");
        }

    }

}
