package HomeWork_18.Tiere.modele;
public class Dogs extends Cats {

//fields

    //Constructor

    public Dogs(long id, String view, int age, String nickname, String breed, double height, double weight) {
        super(id, view, age, nickname, breed, height, weight);
    }

    @Override
    public String toString() {
        return "Dogs{} " + super.toString();
    }
}//end of class
