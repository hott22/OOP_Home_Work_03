package Animals;
public class Cat extends HomeAnimal {
    protected boolean presenceWool;
    public Cat(int height, int weight, String eyesColor, String color, String dateOfBirth, Boolean vaccinated,
               String name, String breed, boolean precenceWool) {
        super(height, weight, eyesColor, color, dateOfBirth, vaccinated, name, breed);
        this.presenceWool = precenceWool;
    }

    @Override
    public void makeSound(){
        System.out.println("Miiiayyyy");
    }



    @Override
    public void love() {
        System.out.println("I love you, miiiayyy");;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + String.format("presenceWool: %b", this.presenceWool);
    }
}

