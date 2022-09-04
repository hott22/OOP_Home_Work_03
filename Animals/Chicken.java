package Animals;
public class Chicken extends Bird{

    public Chicken (int height, int weight,  String eyeColor, String color, int heightOfFly) {
        super (height, weight, eyeColor, heightOfFly);
    }

    @Override
    public void makeSound() {
        System.out.println("kudax-kudax");
    }

}
