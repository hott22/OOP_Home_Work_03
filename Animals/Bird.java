package Animals;

public abstract class Bird extends Animal{

    private int heightOfFlight;

    public Bird(int height, int weight, String eyeColor, String color, int heightOfFlight){
        super(height, weight, eyeColor);
        this.heightOfFlight = heightOfFlight;
    }

    public abstract void makeSound();

    public void Fly(){
        System.out.println("Я лечу на высоте" + this.heightOfFlight);
    }

    public String printInfo(){
        return String.format("%s\nheight of fly: %d", super.printInfo(), this.heightOfFlight);
    }

}