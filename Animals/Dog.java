package Animals;
public class Dog extends HomeAnimal {
    protected Boolean trained;

    /**Конструктор */
    public Dog(int height, int weight, String eyeColor, String name,
               String breed, Boolean vaccinated, String color, String dateOfBirth, Boolean trained){
        super(height, weight, eyeColor, name, breed, vaccinated, color, dateOfBirth);
        this.trained = trained;
    }

    @Override
    public void makeSound(){
        System.out.println("Woof!");
    }
    @Override
    public void love(){
        System.out.println("I love you, I dog");
    }

    public void training(){
        trained = true;
    }
    @Override
    public String printInfo(){
        return String.format("%s, trained: %b", super.printInfo(), this.trained);
    }

}
