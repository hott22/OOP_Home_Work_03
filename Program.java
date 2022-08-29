import Animals.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
       //Chicken chicken = new Chicken(30, 2,"black", "black", 3);
       //chicken.Fly();
        //Cat cat1 = new Cat(3,3,"black","greeb","10.10.10",Boolean.TRUE, "Kisa","caty");
        //Dog dog1 = new Dog(2,4,"red", "Boris", "Setter", false, "red", "11.11.11", true);


        List<Animal> animalList = new ArrayList<>();
        Zoo zoo1 = new Zoo();
        //zoo1.addAnimal(cat1, animalList);
        zoo1.infoAnimal(0,animalList);

        //zoo1.addAnimal(dog1, animalList);
        zoo1.infoAnimal(1,animalList);

        zoo1.sound(0,animalList);
        zoo1.sound(1,animalList);

        zoo1.allInfoAnimal(animalList);
        zoo1.allSound(animalList);




       
    }



    
}