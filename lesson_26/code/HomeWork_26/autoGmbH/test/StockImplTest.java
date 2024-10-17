package HomeWork_26.autoGmbH.test;

import HomeWork_26.autoGmbH.Parts_warehouse.Stock;
import HomeWork_26.autoGmbH.Parts_warehouse.StockImpl;
import HomeWork_26.autoGmbH.model.Detail;
import HomeWork_26.autoGmbH.model.Gear;
import HomeWork_26.autoGmbH.model.Lever;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StockImplTest {

    Stock stock;
    Detail[] part ;

    @BeforeEach
    void setUp(){
       stock = new StockImpl(5);
       part = new Detail[4];
       part[0]=new Gear(1234567890L,20,"steel","V1",2.1,15,65);
       part[1]=new Lever(1234567891L,10,"copper","V2",1.5,12);
       part[2]=new Lever(1234567892L,20,"Plastic","V3",2.1,2.3);
       part[3]=new Gear(1234567893L,40,"steel","V4",15.1,25,138);
    }

    @Test
    void addPart() {
    }

    @Test
    void findPart() {
    }

    @Test
    void updatePartStock() {
    }

    @Test
    void removePart() {
    }

    @Test
    void totalWeightOfAllParts() {
    }

    @Test
    void averageWeightOfParts() {
    }

    @Test
    void printallDetail() {
    }
}