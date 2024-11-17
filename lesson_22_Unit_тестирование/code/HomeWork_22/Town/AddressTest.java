package HomeWork_22.Town;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddressTest {

    Address address;

    String city = "Stolberg";               //ideal City
    String postleitzahl = "52222";          //ideal index

    @BeforeEach
    void setUp() {
        address = new Address(city, postleitzahl);
    }

    @Test
    void validName() {
        address.setTown(city);
        assertEquals (city,address.getTown());
    }
    @Test
    void emptyTown(){
        address.setTown("");
        assertEquals (city,address.getTown());
    }
    @Test
    void townWithoutUpperCase(){
        address.setTown("stolberg");
        assertEquals(city,address.getTown());
    }
    @Test
    void validTownIndex(){
        address.setTownIndex("52222");
        assertEquals(postleitzahl,address.getTownIndex());
    }
    @Test
    void townIndexLenght(){
        address.setTownIndex("522222");
        assertEquals(postleitzahl,address.getTownIndex());
    }
    @Test
    void townIndexIsDigi(){
        address.setTownIndex("5222a2");
        assertEquals(postleitzahl,address.getTownIndex());
    }
}//end of class