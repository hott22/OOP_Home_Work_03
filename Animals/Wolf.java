package Animals;

public class Wolf extends WildAnimal{
    boolean leaderPack;

    public Wolf(int height, int weight, String eyeColor, String lifeArea, String dateOfFound, boolean leaderPack) {
        super(height, weight, eyeColor, lifeArea, dateOfFound);
        this.leaderPack = leaderPack;
    }

    @Override
    public void makeSound() {
        System.out.println("Wooooooo");
    }

    @Override
    public String printInfo() {
        return super.printInfo() + String.format("leaderPack: %b", this.leaderPack);
    }
}