package Supermarkt.dao;

import Supermarkt.model.Product;

public interface KasseControl {
    boolean addWare(Product artikel);// добавить товар;

    Product removeDevice(String barcode);// удалить устройство по ID;

    Product findDevice(String barcode);

    Product updateDevice(Product artikel);

    int Menge();// текущее количество товар

    void printWare(); // распечатать все товары;

}
