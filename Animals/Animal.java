package Animals;

public abstract class Animal {
    int height;
    int weight;
    String eyesColor;

    public Animal(int height, int weight, String eyesColor){
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;
    };


    public abstract void makeSound();

    public String printInfo(){
        return String.format("height : %d, weight : %d , eyesColor : %s ", height, weight, eyesColor);
    }


}

