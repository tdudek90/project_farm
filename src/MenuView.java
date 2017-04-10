
import java.util.*;


public class MenuView {

    public int menu() {
        System.out.println("1. START");
        System.out.println("2. OPTIONS");
        System.out.println("3. QUIT");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void startInformaion() {
        System.out.println("Welcome to the Barn application. Choose an option");
    }

    public int printOption() {
        System.out.println("O P C J E");
        System.out.println("1. ADD BARN");
        System.out.println("2. ADD ANIMAL");
        System.out.println("3. DELETE BARN");
        System.out.println("4. DELETE ANIMAL");
        System.out.println("5. SHOW THE OLDEST");
        System.out.println("6. SHOW THE YOUNGEST");
        System.out.println("7. SHOW ANIMALS IN THE BARN");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public void beforeExit() {
        System.out.println("Thank you for choosing my application");
    }

    public void noObjectsToRemove() {
        System.out.println("There are no objects to remove");
    }


}