package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieRepositoryTest {
    MovieRepository repository = new MovieRepository();
    Movie movie0 = new Movie();
    Movie movie1 = new Movie("1", "URl1", "The Terminator", "thriller");
    Movie movie2 = new Movie("2", "URl2", "The Green Mile", "drama");
    Movie movie3 = new Movie("3", "URl3", "Schindler's List", "drama");
    Movie movie4 = new Movie("4", "URl4", "The Lord of the Rings", "fantasy");
    Movie movie5 = new Movie("5", "URl5", "Pulp Fiction", "crime");

    @BeforeEach
    void setUp() {
        repository.save(movie1);
        repository.save(movie2);
        repository.save(movie3);
        repository.save(movie4);
        repository.save(movie5);
    }

    @Test
    void shouldSave() {
        Movie[] actual = repository.findAll();
        Movie[] expected = new Movie[]{movie1, movie2, movie3, movie4, movie5};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findById() {
        String id = "2";
        Movie actual = repository.findById(id);
        Movie expected = movie2;
        assertEquals(expected, actual);
    }

    @Test
    void shouldRemoveById() {
        String id = "3";
        repository.removeById(id);
        Movie[] actual = repository.findAll();
        Movie[] expected = new Movie[]{movie1, movie2, movie4, movie5};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveAll() {
        repository.removeAll();
        Movie[] actual = repository.findAll();
        Movie[] expected = new Movie[0];
        assertArrayEquals(expected, actual);
    }
}