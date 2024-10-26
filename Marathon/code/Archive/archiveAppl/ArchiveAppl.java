package Archive.archiveAppl;

import Archive.dao.Archive;
import Archive.dao.ArchiveImpl;
import Archive.model.Doku;
import Bibliothek.dao.BibliotekImpl;
import Bibliothek.dao.Bibliothek;
import Bibliothek.model.Buch;

public class ArchiveAppl {
    public static void main(String[] args) {
       Archive archive = new ArchiveImpl(8);


        Doku[] dokument = new Doku[7];
        dokument[0] = new Doku(123_456_789_0L, "T1", "A88", 1989);
        dokument[1] = new Doku(123_456_789_1L, "T2", "A33", 1985);
        dokument[2] = new Doku(123_456_789_2L, "T3", "A4", 2024);
        dokument[3] = new Doku(123_456_789_3L, "T4", "A44", 2024);
        dokument[4] = new Doku(123_456_789_4L, "T5", "A8777", 2024);
        dokument[5] = new Doku(123_456_789_5L, "T6", "A4664", 2024);
        dokument[6] = new Doku(123_456_789_6L, "T7", "A4014", 2024);

        for (int i = 0; i <dokument.length-1; i++) {
            archive.addDocument(dokument[i]);

        }

        archive.printDocument();
        System.out.println(archive.actualQuantity());
        Doku newDoku = new Doku(123_456_789_9L, "T9", "A47", 2022);
        System.out.println("=======================================================================================");
        archive.addDocument(newDoku);
        archive.printDocument();
        System.out.println(archive.actualQuantity());
        System.out.println("=======================================================================================");
        archive.removeDocument(123_456_789_4L);
        archive.printDocument();
        System.out.println(archive.actualQuantity());
        System.out.println("=====================================================");
    }
}
