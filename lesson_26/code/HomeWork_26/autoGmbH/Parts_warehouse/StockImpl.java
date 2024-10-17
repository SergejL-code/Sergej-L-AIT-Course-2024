package HomeWork_26.autoGmbH.Parts_warehouse;

import HomeWork_26.autoGmbH.model.Detail;

public class StockImpl implements Stock {
private Detail[]details;
private int quantityPartsOnStack;

    public StockImpl(int capacityStock) {
        this.details = new Detail[capacityStock];
        this.quantityPartsOnStack = quantityPartsOnStack;
    }

    @Override
    public boolean addPart(Detail detail) {
        return false;
    }

    @Override
    public Detail findPart(long barCode) {
        return null;
    }

    @Override
    public Detail updatePartStock(Detail detail) {
        return null;
    }

    @Override
    public Detail removePart(long barCode) {
        return null;
    }

    @Override
    public double totalWeightOfAllParts() {
        return 0;
    }

    @Override
    public double averageWeightOfParts() {
        return 0;
    }

    @Override
    public void printallDetail() {

    }
}//end of class
