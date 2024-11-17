package HomeWork_24.docu_archive.test;

import HomeWork_24.docu_archive.controller.Archive;
import HomeWork_24.docu_archive.model.Dokument;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveTest {
Archive archive;
Dokument[]dokuments;
int size = 0;
    @BeforeEach
    void setUp() {

        archive = new Archive(4);

        dokuments = new Dokument[4];

        dokuments[0] = new Dokument(1234567890L,"T1","A55","Completed",1841);
        dokuments[1] = new Dokument(1234567891L,"T2","A33","in the process",1985);
        dokuments[2] = new Dokument(1234567892L,"T23","A44","delayed",2024);
        for (int i = 0; i < dokuments.length; i++) {
            archive.addDokument(dokuments[i]);
        }
    }
            //not to add null and unduplicate
    @Test
    void addDokumentTest() {
        assertFalse(archive.addDokument(null));
        assertFalse(archive.addDokument(dokuments[0]));

//add new Document
        Dokument newDokument = new Dokument(1234567893L,"T4","A444","delayed",2024);
        assertTrue(archive.addDokument(newDokument));
//not to add more than it can hold (capacity)
        Dokument nextDokument = new Dokument(1234567895L,"T555","A777","in the process",2022);
        assertFalse(archive.addDokument(nextDokument));
    }

    @Test
    void printDokuments() {
        System.out.println("===========================================================================================");
        archive.printDokuments();
        }

    @Test
    void findDokument() {
        //find existed Document
        assertEquals(dokuments[2],archive.findDokument(1234567892L));
        // find absent Document
        assertNull(archive.findDokument(1234567897));
    }

    @Test
    void removeDokumentTest() {
        //remove existed Document
        assertEquals(dokuments[2],archive.removeDokument(1234567892L));
        assertEquals(2,archive.size());
        assertNull(archive.removeDokument(1234567899L));
    }

    @Test
    void sizeTest() {
        assertEquals(3,archive.size());
    }
}// end of class