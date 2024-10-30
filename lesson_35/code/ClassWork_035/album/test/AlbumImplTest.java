package ClassWork_035.album.test;

import ClassWork_035.album.dao.Album;
import ClassWork_035.album.dao.AlbumImpl;
import ClassWork_035.album.model.Photo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {
    Album album;
    Photo[] photos;
    LocalDateTime now = LocalDateTime.now();
//Comparator sort by albumId then by photoId
//    Comparator<Photo> comparator = new Comparator<Photo>() {
//    @Override
//    public int compare(Photo o1, Photo o2) {
//        return 0;
//    }
//}
    // для сорти
    Comparator<Photo> comparator = (p1,p2)->{
        int res =Integer.compare(p1.getAlbumId(), p2.getAlbumId());
        return  res !=0 ? res : Integer.compare(p1.getPhotoId(),p2.getPhotoId());
};
    @BeforeEach
    void setUp() {
        album= new AlbumImpl(7);
        photos = new Photo[6];
        photos[0] = new Photo(1,1,"t1","url1",now.minusDays(10));
        photos[1] = new Photo(1,2,"t2","url2",now.minusDays(7));
        photos[2] = new Photo(1,3,"t3","url3",now.minusDays(5));
        photos[3] = new Photo(2,1,"t4","url4",now.minusDays(7));
        photos[4] = new Photo(2,2,"t5","url5",now.minusDays(5));
        photos[5] = new Photo(1,4,"t6","url6",now.minusDays(2));

        //ToDO add photos to album
        for (int i = 0; i < 6; i++) {
            album.addPhoto(photos[i]);
        }
    }

    @Test
    void testAddPhoto() {
        //добавить null в альбом возвращает false. Это предполагает, что метод addPhoto отклоняет null значения.
        assertFalse(album.addPhoto(null));

        // добавление photos[1] также возвращает false. Это может означать, что photos[1] уже находится в альбоме или не соответствует условиям для добавления.
        assertFalse(album.addPhoto(photos[1]));

        // создается новый объект Photo с определенными атрибутами (id=2, userId=3 и т.д.) и добавляется в альбом.
        Photo photo = new Photo(2,3,"t7","url7",now.minusDays(2));

        //Утверждение проверяет, что добавление возвращает true, то есть выполнено успешно.
        assertTrue(album.addPhoto(photo));

        //После успешного добавления, проверяется, что размер альбома теперь равен 7. Это подразумевает, что до этого добавления в альбоме было 6 фотографий.
        assertEquals(7,album.size());

        //Создается еще один экземпляр Photo с немного отличающимися атрибутами, но с тем же id (2), что и у предыдущей фотографии. Это проверяет, что addPhoto не добавит дубликат по id.
        photo = new Photo(2,4,"t8","url8",now.minusDays(2));

        //В завершение тест проверяет, что добавление новой фотографии с тем же id возвращает false, то есть метод addPhoto предотвращает добавление дубликатов по id.
        assertFalse(album.addPhoto(photo));
    }

    @Test
    void testRemovePhoto() {
        assertTrue(album.removePhoto(1,1));
        assertFalse(album.removePhoto(3,1));
        assertEquals(5,album.size());
    }

    @Test
    void testUpdatePhoto() {
        assertTrue(album.updatePhoto(1,1, "newUrl"));
        assertEquals("newUrl", album.getPhotoFromAlbum(1, 1).getUrl());
    }


    @Test
    void testGetPhotoFromAlbum() {
        assertEquals(photos[1],album.getPhotoFromAlbum(1,2));
        assertNull(album.getPhotoFromAlbum(1,7));
    }

    @Test
    void testGetAllPhotoFromAlbum() {
        Photo[]expected = {photos[3],photos[4]};
        Photo[]actual = album.getAllPhotoFromAlbum(2);
        assertArrayEquals(expected,actual);
    }

    @Test
    void testGetPhotoBeetwenDate() {
        LocalDate toDay= LocalDate.now();
        Photo[] actual = album.getPhotoBeetwenDate(toDay.minusDays(2),toDay.minusDays(6));
        Arrays.sort(actual,comparator);
        Photo[]expected  = {photos[5],photos[4],photos[2] };
        Arrays.sort(expected,comparator);
        assertArrayEquals(expected,actual);
    }

    @Test
    void testSize() {
        assertEquals(6,album.size());
    }
}//end of class
