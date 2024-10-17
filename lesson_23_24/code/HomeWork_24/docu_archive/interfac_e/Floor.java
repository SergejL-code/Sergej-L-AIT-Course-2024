package HomeWork_24.docu_archive.interfac_e;

import HomeWork_24.docu_archive.model.Dokument;

public interface Floor {

    public boolean addDokument(Dokument dokument);
    public Dokument removeDokument(long id);
    public Dokument findDokument(long id);
    public int size();
    public void printDokuments();



}
