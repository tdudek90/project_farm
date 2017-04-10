public class Main {


    public static void main(String[] args) {

        MenuView menuView = new MenuView();
        Animal animal = new Animal();
        Barn barn = new Barn("");
        System.out.println("Witaj w aplikacji.");
        boolean ifEnd = false;
        while (!ifEnd) {
            int menu1 = menuView.menu();
            switch (menu1) {
                case 1:
                    menuView.startInformaion();
                    break;
                case 2: {
                    int menuOption = menuView.printOption();
                    switch (menuOption) {
                        case 1: {
                            barn.createBarn();
                        }
                        break;
                        case 2: {
                            animal.addTypeAndAgeOfAnimalToBarn();
                        }
                        break;
                        case 3: {
                            barn.showAllBarns();
                            barn.deleteBarn();
                        }
                        break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7: {
                            barn.showAllBarns();
                            animal.printAnimalsFromBarn();
                            break;
                        }
                    }
                    break;
                }
                case 3:
                    menuView.beforeExit();
                    ifEnd = true;
                    break;
            }
        }

    }
}