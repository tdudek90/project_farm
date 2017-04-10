import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Animal implements Comparable<Animal> {

    private String type;
    private int age;
    private  Scanner scanner = new Scanner(System.in);

    public Animal() {
    }

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal addAnimal() {
        Animal animal = new Animal();
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type of animal");
        String typeOfAnimal = scanner.nextLine();
        animal.setType(type);
        System.out.println("Enter age of animal");
        int ageOfAnimal = scanner.nextInt();
        animal.setAge(ageOfAnimal);
        animal = new Animal(typeOfAnimal, ageOfAnimal);
        return animal;


    }

//    public void numberOfAnimals(List<Animal> animals) {
//        System.out.println("Aktualna liczba zwierząt to: " + animals.size());
//    }

    @Override
    public String toString() {
        return type +
                ", " + age;
    }

//    public void printAnimalList(List<Animal> animals) {
//        for (Animal animal : animals) {
//            System.out.println("Zwierzak: " + animal);
//        }
//    }

    public void printAnimalsFromBarn() {
        FileReader fileReader = null;
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of barn");
        String barnName = scanner.next();
        try {
            fileReader = new FileReader("E:\\Homework\\" + barnName + ".txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;
        try {
            line = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        do {
            System.out.println(line);

            try {
                line = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (line != null);

        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//    public void removeAnimal(List<Animal> animals) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj numer zwierzaka do usunięcia. Numeracja od 0");
//        printAnimalList(animals);
//        int index = scanner.nextInt();
//        animals.remove(index);
//    }

    public Animal addTypeAndAgeOfAnimalToBarn() {
        Animal animal = new Animal();
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the barn in which you want to place the animal");
        String barnName = scanner.nextLine();
        File file = new File("E:\\Homework\\" + barnName + ".txt");
        try {
            try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file, true)))) {
                System.out.println();
                System.out.println("Enter type: ");
                String type = scanner.next();
                System.out.println("Enter age: ");
                int age = scanner.nextInt();
                animal.setType(type);
                animal.setAge(age);
                pw.println(animal = new Animal(type, age));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return animal;
    }


    @Override
    public int compareTo(Animal o) {
        if (getAge() > o.getAge()) {
            return 1;
        } else if (getAge() == o.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }


}

