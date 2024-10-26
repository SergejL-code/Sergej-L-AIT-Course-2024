package Archive.dao;

import Archive.model.Doku;

public interface Archive {
    boolean addDocument(Doku dokument);

    Doku removeDocument(long Doi);

    int actualQuantity();

    void printDocument();

    Doku findDocument(long Doi);

}
