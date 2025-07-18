import java.util.List;

public class Menu {

    MenuItem menuItem = new MenuItem();

    public void choice(int choice) {
        List<String> menu = menuItem.showMenu();
        String menuChoice = menu.get(choice);
        System.out.println(menuChoice);
    }

    public void show(){
        List<String> menu = menuItem.showMenu();
        for (String s : menu) {
            System.out.println(s);
        }
    }
}
