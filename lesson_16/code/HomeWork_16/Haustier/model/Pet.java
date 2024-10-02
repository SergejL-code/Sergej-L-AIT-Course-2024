package HomeWork_16.Haustier.model;

public class Pet {

    //Class Fields: Identifier, Animal Species, Age, Name
    public int id;
    public String animalSpecies;
    public int age;
    public String nickname;

    //class constructor initializes fields when a Pet object is created

    public Pet(int id, String animalSpecies, int age, String nickname) {

        this.id = id;                                                    // Initializing
        this.animalSpecies = animalSpecies;                             //Initializing
        this.age = age;                                                 //Initializing
        this.nickname = nickname;                                       //Initializing
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnimalSpecies() {
        return animalSpecies;
    }

    public void setAnimalSpecies(String view) {
        this.animalSpecies = view;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    // toString method to output information  about the Pet object

    @Override
    public String toString() {
        return "Pet{" +
                "id = " + id +
                ", view = '" + animalSpecies + '\'' +
                ", Age = " + age +
                ", nickname = '" + nickname + '\'' +
                '}';

    }

    public void sleep() {
        System.out.println(animalSpecies + " sleeping");
    }

    public void make() {
        System.out.println(animalSpecies + " make sound");
    }

    public void play() {
        System.out.println(animalSpecies + " play ");
    }

    public void walk() {
        System.out.println(animalSpecies + " walk");
    }

}//end of class
