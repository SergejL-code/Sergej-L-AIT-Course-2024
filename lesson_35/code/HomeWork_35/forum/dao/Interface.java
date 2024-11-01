package HomeWork_35.forum.dao;

import HomeWork_35.forum.model.Post;

import java.time.LocalDate;

public interface Interface {
    boolean addPost(Post post);

    boolean removePost(int postId);

    boolean updatePost(String content, int postId);

    Post getPostById(int postId);

    Post[] getPostsByAuthor(String author);

    Post[] getPostByAuthor(String author,LocalDate dateFrom, LocalDate dateTo);

    int size();
}
