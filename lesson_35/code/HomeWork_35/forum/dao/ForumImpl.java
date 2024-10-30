package HomeWork_35.forum.dao;

import HomeWork_35.forum.model.Post;

import java.time.LocalDate;

public class ForumImpl implements Interface {

    Post[]posts;
    int size;

    public ForumImpl(int capacity) {
        this.posts = new Post[capacity];
        this.size = 0;
    }

    @Override
    public boolean addPost(Post post) {
        return false;
    }

    @Override
    public boolean removePost(int posId) {
        return false;
    }

    @Override
    public boolean updatePost(String content, int postId) {
        return false;
    }

    @Override
    public Post getPostById(int postId) {
        return null;
    }

    @Override
    public Post[] getPostsByAuthor(String author) {
        return new Post[0];
    }

    @Override
    public Post[] getPostByAuthor(LocalDate dateTo, LocalDate dateFrom) {
        return new Post[0];
    }

    @Override
    public int size() {
        return 0;
    }
}
