package ClassWork_018.Inheritance.people.modele;

public class HumanBeing {

    boolean gender;//default modifier  - not presence
    double height;
    double weight;
    String race;
    String country;
    String eyeColor;

    public HumanBeing(boolean gender, double height, double weight, String race, String country, String eyeColor) {
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.race = race;
        this.country = country;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "HumanBeing{" +
                "gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", race='" + race + '\'' +
                ", country='" + country + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
