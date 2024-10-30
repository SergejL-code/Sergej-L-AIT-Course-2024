package HomeWork_35.forum.dao;

import HomeWork_35.forum.model.Post;

import java.time.LocalDate;

public interface Interface {
    boolean addPost(Post post);

    boolean removePost(int posId);

    boolean updatePost(String content, int postId);

    Post getPostById(int postId);

    Post[] getPostsByAuthor(String author);

    Post[] getPostByAuthor(LocalDate dateTo, LocalDate dateFrom);

    int size();
}
