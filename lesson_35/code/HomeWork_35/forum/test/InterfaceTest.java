package HomeWork_35.forum.test;

import HomeWork_35.forum.dao.ForumImpl;
import HomeWork_35.forum.dao.Interface;
import HomeWork_35.forum.model.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class InterfaceTest {
   Interface anInterface;
    Post[] posts = new Post[6];
    Comparator<Post> comparator = (p1, p2) -> Integer.compare(p1.getPostId(), p2.getPostId());
    @BeforeEach
    void setUp() {
        anInterface = new ForumImpl(7);
        posts[0] = new Post(0, "title1", "author1", "content");
        posts[1] = new Post(1, "title2", "author2", "content");
        posts[2] = new Post(2, "title3", "author2", "content");
        posts[3] = new Post(3, "title4", "author1", "content");
        posts[4] = new Post(4, "title1", "author3", "content");
        posts[5] = new Post(5, "title2", "author1", "content");
        for (int i = 0; i < posts.length - 1; i++) {
            anInterface.addPost(posts[i]);
        }
    }

    @Test
    void testAddPost() {
        assertFalse(anInterface.addPost(null));
        assertTrue(anInterface.addPost(posts[5]));
        assertEquals(6, anInterface.size());
        assertFalse(anInterface.addPost(posts[5]));
        assertEquals(6, anInterface.size());
    }

    @Test
    void testRemovePost() {
        assertTrue(anInterface.removePost(2));
        assertEquals(4, anInterface.size());
        assertFalse(anInterface.removePost(2));
        assertEquals(4, anInterface.size());
    }

    @Test
    void testUpdatePost() {
        assertFalse(anInterface.updatePost("content", 5));
        assertTrue(anInterface.updatePost("content", 1));
        assertEquals("new content", anInterface.getPostById(1).getContent());
    }

    @Test
    void testGetPostById() {
        assertEquals(posts[3], anInterface.getPostById(3));
        assertNull(anInterface.getPostById(5));
    }

    @Test
    void testGetPostsByAuthor() {
        Post[] actual = anInterface.getPostsByAuthor("author1");
        Arrays.sort(actual, comparator);
        Post[] expected = {posts[0], posts[3]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void testGetPostByAuthorStringLocalDateLocalDate() {
        posts[0].setDate(LocalDateTime.now().minusDays(6));
        posts[1].setDate(LocalDateTime.now().minusDays(9));
        posts[2].setDate(LocalDateTime.now().minusDays(5));
        posts[3].setDate(LocalDateTime.now().minusDays(7));
        posts[4].setDate(LocalDateTime.now().minusDays(10));
        posts[5].setDate(LocalDateTime.now().minusDays(8));
        // FIXME
        // forum.addPost(posts[5]);
        anInterface = new ForumImpl(6);
        for (int i = 0; i < posts.length; i++) {
            anInterface.addPost(posts[i]);
        }
        Post[] actual = anInterface.getPostByAuthor("author1", LocalDate.now().minusDays(8), LocalDate.now().minusDays(7));
        Arrays.sort(actual, comparator);
        Post[] expected = {posts[3], posts[5]};
        assertArrayEquals(expected, actual);
        actual = anInterface.getPostByAuthor("author1", LocalDate.now().minusDays(15), LocalDate.now().minusDays((10)));
        assertEquals(0, actual.length);
    }

    @Test
    void testSize() {
        assertEquals(5, anInterface.size());
    }
}