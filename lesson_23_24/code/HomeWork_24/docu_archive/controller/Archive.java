package HomeWork_24.docu_archive.controller;

import HomeWork_24.docu_archive.model.Dokument;

public  class Archive {

    //fields

    private Dokument[] dokuments;
    private int size;

    // constructor

    public Archive(int capacity) {
        this.dokuments = new Dokument[capacity];
        this.size = 0;
    }

    public boolean addDokument(Dokument dokument) {
        if (dokument == null) {
            return false;
        }
        if (size == dokuments.length) {
            return false;
        }
        if (!(findDokument(dokument.getId()) == null)) {
            return false;
        }
        dokuments[size] = dokument;
        size++;
        return true;
    }

    public void printDokuments() {
        for (int i = 0; i < size; i++) {
            System.out.println(dokuments[i]);
        }
    }

    public Dokument findDokument(long id) {
        for (int i = 0; i < size; i++) {
            if (dokuments[i].getId() == id) {
                return dokuments[i];
            }
        }
        return null;
    }

    public Dokument removeDokument(long id) {
        for (int i = 0; i < size; i++) {
            if (dokuments[i].getId() == id) {
                Dokument victim = dokuments[i];
                dokuments[i] = dokuments[size - 1];
                dokuments[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }
    public int size() {
        return size;
    }

}//end of class