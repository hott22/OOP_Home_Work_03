import Animals.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
        Chicken chicken = new Chicken(30, 2, "black", "black", 3);
        Cat cat1 = new Cat(3, 3, "black", "greeb", "10.10.10", Boolean.TRUE, "Kisa", "caty", true);
        Dog dog1 = new Dog(2, 4, "red", "Boris", "Setter", false, "red", "11.11.11", true);
        Wolf wolf = new Wolf(5, 6, "black", "forrest", "10.10.10", true);
        Chicken Ku = new Chicken(30, 2, "black", "w", 2);
        Dog dogBouncy = new Dog(50, 28, "brown", "Bouncy", "spaniel", false, "withe", "11.11.11", true);
        Stork stork1 = new Stork(150, 15, "black", "green", 100);
        Tiger tigerLeo = new Tiger(80, 120, "yellow", "Asia", "April 18");

        List<Animal> array = new ArrayList<>();
        Zoo zoo = new Zoo(array);
        while (true) {
            System.out.println("Choose an action: \n" +
                    "1 - add animal \n" +
                    "2 - del animal \n" +
                    "3 - View information about the animal \n" +
                    "4 - Make the animal make a sound \n" +
                    "5 - Print information about the animals that are currently in the zoo \n" +
                    "6 - Make all the animals that are currently in the zoo make a sound \n" +
                    "7 - exit");


            Scanner scanner = new Scanner(System.in);
            int choise1 = scanner.nextInt();

            if (choise1 == 1) {
                System.out.println("1 - chicken \n" +
                        "2 - cat1 \n" +
                        "3 - dog1 \n" +
                        "4 - wolf \n" +
                        "5 - Ku \n" +
                        "6 - dogBouncy \n" +
                        "7 - stork1 \n" +
                        "8 - tigerLeo");

                int choise2 = scanner.nextInt();
                switch (choise2) {
                    case 1 -> zoo.addAnimal(chicken);
                    case 2 -> zoo.addAnimal(cat1);
                    case 3 -> zoo.addAnimal(dog1);
                    case 4 -> zoo.addAnimal(wolf);
                    case 5 -> zoo.addAnimal(Ku);
                    case 6 -> zoo.addAnimal(dogBouncy);
                    case 7 -> zoo.addAnimal(stork1);
                    case 8 -> zoo.addAnimal(tigerLeo);
                }

            }

            if (choise1 == 2) {
                for (int i = 0; i < array.size(); i++) {
                    System.out.printf((i + 1) + ": " + array.get(i).getClass().getSimpleName() + "\n");
                }
                int choise3 = scanner.nextInt();
                zoo.delAnimal(choise3 - 1);

            }

            if (choise1 == 3) {
                for (int i = 0; i < array.size(); i++) {
                    System.out.printf((i + 1) + ": " + array.get(i).getClass().getSimpleName() + "\n");
                }
                System.out.println("Enter the number of the animal to view the information: ");
                int choise4 = scanner.nextInt();
                zoo.infoAnimal(choise4 - 1);
            }
            if (choise1 == 4){
                for (int i = 0; i < array.size(); i++) {
                    System.out.printf((i + 1) + ": " + array.get(i).getClass().getSimpleName() + "\n");
                }
                System.out.println("Enter the number of the animal to make sound: ");
                int choise5 = scanner.nextInt();
                zoo.sound(choise5 - 1);
            }

            if (choise1 == 5){
                zoo.allInfoAnimal();
            }

            if (choise1 == 6){
                zoo.allSound();
            }

            if (choise1 == 7){
                break;
            }
            scanner.close();
        }
    }
}