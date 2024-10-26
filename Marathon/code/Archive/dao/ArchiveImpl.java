package Archive.dao;

import Archive.model.Doku;
import Bibliothek.model.Buch;

public class ArchiveImpl implements Archive {
    Doku[] document;
    int aktualMengeDocumentes;

    public ArchiveImpl(int capacity) {
        this.document = new Doku[capacity];
        this.aktualMengeDocumentes = aktualMengeDocumentes;
    }


    @Override
    public boolean addDocument(Doku dokument) {
        if (dokument == null) {
            return false;
        }
        if (aktualMengeDocumentes == document.length) {
            return false;
        }
        if (!(findDocument(dokument.getDoi()) == null)) {
            return false;
        }
        //positv case
        document[aktualMengeDocumentes] = dokument;//ставим dokument в конец массива, первое свободное место
        aktualMengeDocumentes++;
        return true;

    }

    @Override
    public Doku removeDocument(long Doi) {
        for (int i = 0; i < aktualMengeDocumentes; i++) {
            if (document[i].getDoi() == Doi) {
                Doku victim = document[i];
                document[i] = document[aktualMengeDocumentes - 1];//last document put instead victim
                document[aktualMengeDocumentes - 1] = null; //затираем последний элемент массива
                aktualMengeDocumentes--;
                return victim;
            }
        }
        return null;
    }


    @Override
    public int actualQuantity() {
        return aktualMengeDocumentes;
    }

    @Override
    public void printDocument() {
        for (int i = 0; i < aktualMengeDocumentes; i++) {
            System.out.println(document[i]);
        }
    }


    @Override
    public Doku findDocument(long Doi) {
        for (int i = 0; i < aktualMengeDocumentes; i++) {
            if (document[i].getDoi() == Doi) {
                return document[i];
            }
        }
        return null;

    }
}

