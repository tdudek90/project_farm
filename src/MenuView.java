
import java.util.*;


public class MenuView {

    public int menu() {
        System.out.println("1. START");
        System.out.println("2. OPCJE");
        System.out.println("3. ZAKONCZ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void startInformaion() {
        System.out.println("Witaj w aplikacji Stodoła 3000. Wybierz opcję");
    }

    public int printOption() {
        System.out.println("O P C J E");
        System.out.println("1. Dodaj stodołe");
        System.out.println("2. Dodaj zwierze");
        System.out.println("3. Usuń stodołe");
        System.out.println("4. Usuń zwierze");
        System.out.println("5. Pokaż najstarsze");
        System.out.println("6. Pokaż najmłodsze");
        System.out.println("7. Pokaż jakie zwierzeta sa w stodole");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public void beforeExit() {
        System.out.println("Dziękujemy za skorzystanie ze Stodoły 3000");
    }

    public void noObjectsToRemove() {
        System.out.println("Brak obiektów do usunięcia");
    }


}