import controller.UserMenu;
import java.util.Scanner;

public class StartStringApp implements UserMenu{
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        new StartStringApp();
    }

    StartStringApp(){
        boolean runApp = true;
        while (runApp) {
            System.out.print(UserMenu.startMenu);
            int initChoose = sc.nextInt();
            switch (initChoose) {
                case 1:
                    new CustomerManagement();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    runApp = false;
                    break;
                default:
                    break;
            }
        }
    }
}
