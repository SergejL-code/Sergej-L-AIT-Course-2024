package ClassWork_035.album.dao;

import ClassWork_035.album.model.Photo;

import java.time.LocalDate;

public interface Album {
    boolean addPhoto(Photo photo);
    boolean removePhoto(int albumId,int photoId);
    boolean updatePhoto(int albumId,int photoId,String url);
    Photo getPhotoFromAlbum(int albumId,int photoId);
    Photo[] getAllPhotoFromAlbum(int albumId);
    Photo[] getPhotoBeetwenDate(LocalDate dateFrom, LocalDate dateTo);
    int size();

}
