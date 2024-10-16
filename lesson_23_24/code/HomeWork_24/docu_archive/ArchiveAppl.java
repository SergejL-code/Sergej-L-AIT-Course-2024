package HomeWork_24.docu_archive;

import HomeWork_24.docu_archive.controller.Archive;
import HomeWork_24.docu_archive.model.Dokument;

public class ArchiveAppl {
    public static void main(String[] args) {
        Dokument[] dokuments = new Dokument[5];
        dokuments[0] = new Dokument(1234567891L, "T1", "Awg", "in the process", 1934);
        dokuments[1] = new Dokument(1234567892L, "T2", "tzt", "Completed", 1248);
        dokuments[2] = new Dokument(1234567893L, "T3", "wss", "Completed", 1600);
        dokuments[3] = new Dokument(1234567894L, "T4", "A55", "delayed", 2024);

        Archive archive = new Archive(6);
        for (int i = 0; i < dokuments.length; i++) {
            archive.addDokument(dokuments[i]);
        }
        archive.printDokuments();
        System.out.println(archive.size());
        System.out.println("*******************************************************");
        // add new Document
Dokument newDokument = new Dokument(1234567895L,"t23","AAA","in progress",2020);
archive.addDokument(newDokument);
archive.printDokuments();
        System.out.println(archive.size());
        System.out.println("*******************************************************");
        // remove existed Book
        archive.removeDokument(1234567893L);
        archive.printDokuments();
        System.out.println(archive.size());
    }
}//end of class
