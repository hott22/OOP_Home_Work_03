package Animals;

public class Stork extends Bird{
    public Stork (int height, int weight, String eyeColor, String color, int heightOfFlight){
        super(height, weight, eyeColor, heightOfFlight);
    }

    @Override
    public void makeSound() {
        System.out.println("Kurlu, kurlu");
    }

}