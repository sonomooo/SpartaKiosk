import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        MenuItem menuItem = new MenuItem();

        while (true) {
            System.out.println("메뉴를 선택해주세요");
            menuItem.showMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("종료");
                break;
            } else {
                menu.show(choice);

            }
        }
    }
}