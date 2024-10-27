package Supermarkt.dao;

import ComputerShopGmbh.model.GeneralDevice;
import Supermarkt.model.Product;

public class KasseImpl implements KasseControl {
    private Product[]products;
    private  int Menge;


    @Override
    public boolean addWare(Product artikel) {
        return false;
    }

    @Override
    public Product removeDevice(String barcode) {
        return null;
    }

    @Override
    public Product findDevice(String barcode) {
        return null;
    }

    @Override
    public Product updateDevice(Product artikel) {
        return null;
    }

    @Override
    public int Menge() {
        return 0;
    }

    @Override
    public void printWare() {

    }
}
