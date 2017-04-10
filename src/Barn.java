import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;


public class Barn {

    private String nameOfBarn;
    private Scanner scanner = new Scanner(System.in);

    public Barn(String nameOfBarn) {
        this.nameOfBarn = nameOfBarn;
    }

    public String getNameOfBarn() {
        return nameOfBarn;
    }

    public void setNameOfBarn(String nameOfBarn) {
        this.nameOfBarn = nameOfBarn;
    }


    public Barn addBarn() {
        Barn barn = new Barn("");
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę stodoły");
        String barnName = scanner.nextLine();
        return new Barn(barnName);
    }

    @Override
    public String toString() {
        return nameOfBarn;
    }

//    public void printBarnList(List<Object> barns) {
//        for (Object barn1 : barns) {
//            System.out.println("Dostępne stodoły: " + barn1);
//        }
//    }

//    public void removeBarn(List<Object> barns) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj numer stodoły do usunięcia. Numeracja od 0");
//        printBarnList(barns);
//        int index = scanner.nextInt();
//        barns.remove(index);
//    }

    public File createBarn() {
//        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwe stodoły: ");
        String catalog = scanner.nextLine();
        File file = new File("E:\\Homework\\" + catalog + ".txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Udało się utworzyć stodołę");
            } else {
                System.out.println("Wystąpił błąd lub stodoła już istnieje");
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
        return file;
    }

    public void deleteBarn() {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj stodole do usuniecia");
        String barnToDelete = scanner.next();
        File file = new File("E:\\Homework\\" + barnToDelete + ".txt");
        file.delete();
        System.out.println("Stodoła " + barnToDelete + " została usunięta");

    }

    public void showAllBarns() {
        try {
            try (Stream<Path> paths = Files.walk(Paths.get("E:\\Homework\\"))) {
                paths.forEach(filePath -> {
                    if (Files.isRegularFile(filePath)) {
                        System.out.println(filePath);
                    }
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}