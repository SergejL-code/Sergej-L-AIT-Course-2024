package ClassWork_034.album.dao;

import ClassWork_034.album.model.Photo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class AlbumImpl implements Album {
    private Photo[] photos;
    private int size ;

    public AlbumImpl( int capacity) {
        this.photos = new Photo[capacity];
      //  this.size =0;
    }
    Comparator<Photo> comparator = (p1, p2)->{
        int res =Integer.compare(p1.getAlbumId(), p2.getAlbumId());
        return  res !=0 ? res : Integer.compare(p1.getPhotoId(),p2.getPhotoId());
    };
    @Override
    public boolean addPhoto(Photo photo) {
        if(photo==null || size==photos.length|| getPhotoFromAlbum(photo.getAlbumId(),photo.getPhotoId())!= null){
            return false;}



        //find index where insert photo
        int index = Arrays.binarySearch(photos,0,size,photo,comparator);
        index =index>=0? index: -index-1;
        photos[index]=photo;
        size++;
        return true;
    }

    @Override
    public boolean removePhoto(int albumId, int photoId) {
        for (int i = 0; i < size; i++) {
            if(photos[i].getAlbumId() == albumId && photos[i].getPhotoId() == photoId){
                System.arraycopy(photos,i+1,photos,i,size -i -1);
                photos[--size]=null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto( int albumId, int photoId,String url) {
        Photo photo = getPhotoFromAlbum(albumId,photoId);
        if(photo != null){return false;
           }
        photo.setUrl(url);
        return true;
    }

    @Override
    public Photo getPhotoFromAlbum(int albumId, int photoId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getAlbumId() == albumId && photos[i].getPhotoId() == photoId) {
                return photos[i];
            }
        }
            return null;
    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {

            return new Photo[0];
    }

    @Override
    public Photo[] getPhotoBeetwenDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Photo[0];
    }

    @Override
    public int size() {
        return size;
    }
}
