package ClassWork_035.album.dao;

import ClassWork_035.album.model.Photo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AlbumImpl implements Album {
    private Photo[] photos;
    private int size;

    public AlbumImpl(int capacity) {
        this.photos = new Photo[capacity];
        this.size = 0;
    }

    Comparator<Photo> comparator = (p1, p2) -> {
        int res = Integer.compare(p1.getAlbumId(), p2.getAlbumId());
        return res != 0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId());
    };

    @Override
    public boolean addPhoto(Photo photo) {
        if (photo == null || size == photos.length || getPhotoFromAlbum(photo.getAlbumId(), photo.getPhotoId()) != null) {
            return false;
        }


        //find index where insert photo
        int index = Arrays.binarySearch(photos, 0, size, photo, comparator);
        // int index = -Arrays.binarySearch(photos, 0, size, photo, comparator)-1;
        index = index >= 0 ? index : -index - 1;
        // Сдвинуть элементы вправо, чтобы освободить место
        System.arraycopy(photos, index, photos, index + 1, size - index);
        photos[index] = photo;
        size++;
        return true;
    }

    @Override
    public boolean removePhoto(int albumId, int photoId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getAlbumId() == albumId && photos[i].getPhotoId() == photoId) {
                System.arraycopy(photos, i + 1, photos, i, size - i - 1);
                photos[--size] = null;// Освободить ссылку
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int albumId, int photoId, String url) {
        Photo photo = getPhotoFromAlbum(albumId, photoId);
        if (photo == null) {
            return false;// Фото не найдено
        }
        photo.setUrl(url);// Обновить URL
        return true;
    }

    @Override
    public Photo getPhotoFromAlbum(int albumId, int photoId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getAlbumId() == albumId && photos[i].getPhotoId() == photoId) {
                return photos[i];
            }
        }
        return null; // Возвращаем null или выбрасываем исключение, если фотография не найдена
    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {
        // return Arrays.stream(photos)
        //        .filter(photo -> photo != null && photo.getAlbumId() == albumId)
        //        .toArray(Photo[]::new);
        return findPhotoByPredicate(photo -> photo.getAlbumId() == albumId);
    }

   @Override
    public Photo[] getPhotoBeetwenDate(LocalDate dateFrom, LocalDate dateTo) {
       return findPhotoByPredicate(photo ->photo.getDate().toLocalDate().isAfter(dateFrom.minusDays(1)) && photo.getDate().toLocalDate().isBefore(dateTo.plusDays(1)));
       // return  findPhotoByPredicate(photo -> photo.getDate().toLocalDate().isEqual(dateFrom))||
       // (photos[i].getData().isEqual(dateFrom) || events[i].getData().isAfter(dateFrom)) &&
        //       (events[i].getData().isEqual(dateTo) || events[i].getData().isBefore(dateTo)))
    }

    @Override
    public int size() {
        return size;
    }

    // служебный метод для отбора обьектов из массива по критертю
    private Photo[] findPhotoByPredicate(Predicate<Photo> predicate) {
        //  int count = 0;
        //for (int i = 0; i < size; i++) {
        //  if (predicate.test(employees[i])) { //обьект проходит тест
        //    count++;
        // }
        // }
        //читаем массив и перекладываем рез-ты в новый
        Photo[] res = new Photo[size];
        int j = 0;        //j это индекс массива результатов
        for (int i = 0; i < size; i++) {
            if (predicate.test(photos[i])) {
                res[j++] = photos[i];
            }
        }
        return Arrays.copyOf(res, j);//обрезаем хвост из null
    }
}//end of class
