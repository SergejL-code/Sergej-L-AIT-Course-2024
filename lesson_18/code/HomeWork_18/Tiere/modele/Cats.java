package HomeWork_18.Tiere.modele;

public class Cats extends Pet {
    //fields
    private String breed;
    private double height;
    private double weight;

    //constructor

    public Cats(long id, String view, int age, String nickname, String breed, double height, double weight) {
        super(id, view, age, nickname);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }
//Getters and Setters
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                "} " + super.toString();
    }
}//end of class
