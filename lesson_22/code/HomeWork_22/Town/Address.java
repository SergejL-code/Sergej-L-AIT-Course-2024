package HomeWork_22.Town;
/*Создать класс Address, проверить:

    город с большой буквы
    индекс содержит 5 цифр
    предложите еще тесты*/

public class Address {
    //fields
    String town;
    String townIndex;

    //Methode
    //constructor
    public Address(String town, String townIndex) {
        this.town = town;
        this.townIndex = townIndex;
    }

    //Getter and Setter
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getTownIndex() {
        return townIndex;
    }

    public void setTownIndex(String townIndex) {
        this.townIndex = townIndex;
    }

    //displaing
    @Override
    public String toString() {
        return "Address{" +
                "town='" + town + '\'' +
                ", townIndex='" + townIndex + '\'' +
                '}';
    }

    private boolean town(String town,String townIndex) {
        boolean[] res = new boolean[3];
        for (int i = 0; i < town.length(); i++) {
            char ch = town.charAt(i);
            if (town == null || town.isEmpty()) {
                res[0] = false;
            }
            if (Character.isUpperCase(town.charAt(0))) {
                res[1] = true;
            }
            if (townIndex.length() >= 5) {
                res[2] = true;
            }
        }//end of for
return false;
    }//end of Town


}//end of class
