package HomeWork_22.Town;
/*Создать класс Address, проверить:

    город с большой буквы
    индекс содержит 5 цифр
    предложите еще тесты*/

public class Address {
    //fields
    private String town;
    private String townIndex;

    //Methode
    //constructor
    public Address(String town, String townIndex) {
        setTown(town);
        setTownIndex(townIndex);
    }
    //Getter and Setter
    public String getTown() {
        return town;
    }
    public void setTown(String town) {

        if (isTownName(town)) {
            this.town = town;
        } else {
            System.out.println(town + " city not found. ");
        }
    }

    public String getTownIndex() {
        return townIndex;
    }
    public void setTownIndex(String townIndex) {
        if (isTownIndex(townIndex)) {
            this.townIndex = townIndex;
        } else {
            System.out.println(townIndex + " index is wrong.");
        }

    }

    //displaing
    @Override
    public String toString() {
        return "Address{" +
                "town='" + town + '\'' +
                ", townIndex='" + townIndex + '\'' +
                '}';
    }

    public boolean isTownName(String town) {

        // Check if the string is Empty or null
        if (town == null || town.isEmpty()) {
            return false;                                       // Town name cannot be null or empty
        }

        // Check if town starts with a capital letter
        if (!Character.isUpperCase(town.charAt(0))) {
            return false;
        }
        return true;
    }

    public boolean isTownIndex(String townIndex) {
        // Check length of townIndex( 5 numbers)
        for (int i = 0; i < townIndex.length(); i++) {
        if (townIndex.length() != 5)
            return false;
        if (!Character.isDigit(townIndex.charAt(i))) {               // Check that all characters in the string are digits
            return false;}

        }
        return true;
    }//end of Town
}//end of class