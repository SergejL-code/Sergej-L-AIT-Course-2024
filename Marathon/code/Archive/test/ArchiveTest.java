package Archive.test;

import Archive.dao.Archive;
import Archive.dao.ArchiveImpl;
import Archive.model.Doku;
import HomeWork_24.docu_archive.model.Dokument;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveTest {
    Archive archive;
    Doku[] dokuments;

    @BeforeEach
    void setUp() {
        archive = new ArchiveImpl(8);
        dokuments=new Doku[7];
        dokuments[0] = new Doku(123_456_789_0L, "T1", "A88", 1989);
        dokuments[1] = new Doku(123_456_789_1L, "T2", "A33", 1985);
        dokuments[2] = new Doku(123_456_789_2L, "T3", "A4", 2024);
        dokuments[3] = new Doku(123_456_789_3L, "T4", "A44", 2024);
        dokuments[4] = new Doku(123_456_789_4L, "T5", "A8777", 2024);
        dokuments[5] = new Doku(123_456_789_5L, "T6", "A4664", 2024);
        dokuments[6] = new Doku(123_456_789_6L, "T7", "A4014", 2024);

        for (int i = 0; i < dokuments.length - 1; i++) {
            archive.addDocument(dokuments[i]);
        }
    }

    @Test
    void addDocumentTest() {
        assertFalse(archive.addDocument(null));
        assertFalse(archive.addDocument(dokuments[0]));
        Doku newDok = new Doku(123_456_789_0L, "T1", "A88", 1989);
    }

    @Test
    void removeDocumentTest() {
        //can remove existed
        assertEquals(dokuments[0], archive.removeDocument(123_456_789_0L));
        //check size
        assertEquals(5, archive.actualQuantity());
        //can't remove absent
        assertNull(archive.removeDocument(123_456_789_12L));
    }

    @Test
    void actualQuantityTest() {
        assertEquals(6,archive.actualQuantity());
    }

    @Test
    void printDocumentTest() {
        archive.printDocument();
    }

    @Test
    void findDocumentTest() {
        assertEquals(dokuments[2], archive.findDocument(123_456_789_2L));//find existed book
        assertNull(archive.findDocument(111_111_111_111_9L));// find absent book
    }
}