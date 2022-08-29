package Animals;

public class Tiger extends WildAnimal {
    public Tiger(int height, int weight, String eyeColor, String lifeArea, String dateOfFound) {
        super(height, weight, eyeColor, lifeArea, dateOfFound);
    }

    @Override
    public void makeSound(){
        System.out.println("RRrrrrr");
    }

}