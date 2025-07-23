package V3;

import V3.Menu.*;
import V3.menuitem.discountInfo;
import V3.more.Basket;
import V3.more.Price;

import java.sql.SQLOutput;
import java.util.Scanner;

public class KioskV3 {
    Scanner scanner = new Scanner(System.in);
    MainMenu mainMenu = new MainMenu();
    BurgerMenu burgerMenu = new BurgerMenu();
    DessertMenu dessertMenu = new DessertMenu();
    DrinkMenu drinkMenu = new DrinkMenu();
    Basket basket = new Basket();
    OrderMenu orderMenu = new OrderMenu();
    Price price = new Price();

    Double sum = 0.0;

    public void start() {


        while (true) {

            System.out.println("[MAIN MENU]");
            for (int i = 0; i < mainMenu.getMainMenu().size(); i++) {
                System.out.println((i + 1) + ". " + mainMenu.getMainMenu().get(i));
            }
            System.out.println("0. 종료 | 종료");

            if (!basket.getBasketList().isEmpty()){
                System.out.println();
                System.out.println("[ORDER MENU]");
                for (int i = 0; i < orderMenu.getOrderList().size(); i++) {
                    System.out.println((i + 4) + ". " + orderMenu.getOrderList().get(i));
                }
            }

            int select = scanner.nextInt();
            scanner.nextLine();

            if (select == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {

                switch (select) {
                    case 1:
                        System.out.println("[Burger MENU]");
                        for (int i = 0; i < burgerMenu.getBurgerMenu().size(); i++) {
                            System.out.println((i + 1) + ". " + burgerMenu.getBurgerMenu().get(i));

                        }
                        System.out.println("0. 뒤로가기");

                        System.out.println("주문을 해주세요");
                        int choice = scanner.nextInt();
                        scanner.nextLine();

                        if (choice == 0) {
                            System.out.println("종료합니다");
                            break;

                        } else {
                            System.out.println("선택한 메뉴 : " + burgerMenu.getBurgerMenu().get(choice - 1));
                            System.out.println(burgerMenu.getBurgerMenu().get(choice - 1).getName() + "을 주문받았습니다.");
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");

                            int basketChoice = scanner.nextInt();
                            scanner.nextLine();

                            if (basketChoice ==1){
                                basket.getBasketList().add(burgerMenu.getBurgerMenu().get(choice - 1));
                                price.getPriceList().add(burgerMenu.getBurgerMenu().get(choice-1).getPrice());
                            } else {
                                break;
                            }

                            break;
//                    System.out.println("다시 주문하려면 Y를 입력해주세요.");
//                    String answer = scanner.nextLine();
//
//                    if (answer.equals("Y")) {
//                               continue;
//                    } else {
//                        System.out.println("종료합니다");
//                               break;
//                    }
                        }
                    case 2:
                        System.out.println("[Drink MENU]");
                        for (int i = 0; i < drinkMenu.getDrinkMenu().size(); i++) {
                            System.out.println((i + 1) + ". " + drinkMenu.getDrinkMenu().get(i));

                        }
                        System.out.println("0. 종료 | 종료");

                        System.out.println("주문을 해주세요");
                        int choice2 = scanner.nextInt();
                        scanner.nextLine();
                        if (choice2 == 0) {
                            System.out.println("종료합니다");
                            break;

                        } else {
                            System.out.println("선택한 메뉴 : " + drinkMenu.getDrinkMenu().get(choice2 - 1));
                            System.out.println(drinkMenu.getDrinkMenu().get(choice2 - 1).getName() + "을 주문받았습니다.");

                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");

                            int basketChoice2 = scanner.nextInt();
                            scanner.nextLine();

                            if (basketChoice2 ==1){
                                basket.getBasketList().add(drinkMenu.getDrinkMenu().get(choice2 - 1));
                                price.getPriceList().add(drinkMenu.getDrinkMenu().get(choice2-1).getPrice());
                            } else {
                                break;
                            }
                            break;

                        }
                    case 3:
                        System.out.println("[Dessert MENU]");
                        for (int i = 0; i < dessertMenu.getDessertMenu().size(); i++) {
                            System.out.println((i + 1) + ". " + dessertMenu.getDessertMenu().get(i));
                        }
                        System.out.println("0. 종료 | 종료");

                        System.out.println("주문을 해주세요");
                        int choice3 = scanner.nextInt();
                        scanner.nextLine();
                        if (choice3 == 0) {
                            System.out.println("종료합니다");
                            break;

                        } else {
                            basket.getBasketList().add(dessertMenu.getDessertMenu().get(choice3 - 1));
                            System.out.println("선택한 메뉴 : " + dessertMenu.getDessertMenu().get(choice3 - 1));
                            System.out.println(dessertMenu.getDessertMenu().get(choice3 - 1).getName() + "을 주문받았습니다.");


                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까? 추가시 : 1");

                            int basketChoice3 = scanner.nextInt();
                            scanner.nextLine();

                            if (basketChoice3 ==1){
                                basket.getBasketList().add(drinkMenu.getDrinkMenu().get(choice3 - 1));
                                price.getPriceList().add(dessertMenu.getDessertMenu().get(choice3-1).getPrice());
                            } else {
                                break;
                            }
                            break;
                        }

                    case 4:
                        System.out.println("아래와 같이 주문 하시겠습니까?");
                        System.out.println("[ Orders ]");
                        for (int i = 0; i < basket.getBasketList().size(); i++) {
                            System.out.println( i + "." + basket.getBasketList().get(i));
                        }
                        System.out.println("[ Total ]");
                        for (int i = 0; i < price.getPriceList().size(); i++) {
                          //  System.out.println("W "+ price.getPriceList().get(i));
                            sum += price.getPriceList().get(i);
                        }
                        System.out.println("W" + sum);
                        System.out.println();

                        System.out.println("1. 주문    2.메뉴판");

                        int orderChoice = scanner.nextInt();
                        scanner.nextLine();

                        if (orderChoice == 1){

                            System.out.println("할인 정보를 선택하세요:");
                            System.out.println("1. 국가유공자 (10%)");
                            System.out.println("2. 군인 (5%)");
                            System.out.println("3. 학생 (3%)");
                            System.out.println("4. 일반 (0%)");
                            int aa = scanner.nextInt();

                            discountInfo discount = discountInfo.일반;
                            switch(aa) {
                                case 1:
                                    discount = discountInfo.국가유공자;
                                    break;
                                case 2:
                                    discount = discountInfo.군인;
                                    break;
                                case 3:
                                    discount = discountInfo.학생;
                                    break;
                                case 4:
                                    discount = discountInfo.일반;
                                    break;
                                default:
                                    System.out.println("잘못 입력하셨습니다. 일반 요금 적용.");
                            }

                            double discounted = discount.applyDiscount(sum);
                            System.out.println();
                            System.out.println("주문이 완료되었습니다. 금액은 W" + discounted + " 입니다.");

                            break;
                        }
                }
            }
        }
    }
}