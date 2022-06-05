package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    MovieManager manager = new MovieManager(10);
    MovieManager movieManager = new MovieManager();
    Movie movie0 = new Movie();
    Movie movie1 = new Movie("1", "URl1", "The Terminator", "thriller");
    Movie movie2 = new Movie("2", "URl2", "The Green Mile", "drama");
    Movie movie3 = new Movie("3", "URl3", "Schindler's List", "drama");
    Movie movie4 = new Movie("4", "URl4", "The Lord of the Rings", "fantasy");
    Movie movie5 = new Movie("5", "URl5", "Pulp Fiction", "crime");
    Movie movie6 = new Movie("6", "URl6", "Coco", "cartoon");
    Movie movie7 = new Movie("7", "URl7", "Interstellar", "fantasy");
    Movie movie8 = new Movie("8", "URl8", "The Lion King", "cartoon");
    Movie movie9 = new Movie("9", "URl9", "Fight Club", "thriller");
    Movie movie10 = new Movie("10", "URl10", "Gladiator", "history");
    Movie movie11 = new Movie("11", "URl11", "Sherlock Holms", "detective");
    Movie movie12 = new Movie("12", "URl12", "The Matrix", "fantasy");
    Movie movie13 = new Movie("13", "URl13", "Claus", "cartoon");
    Movie movie14 = new Movie("14", "URl14", "The Gentlemen", "crime");
    Movie movie15 = new Movie("15", "URl15", "The Green Book", "biography");


    @Test
    void shouldAddMovie() {
        movieManager.add(movie15);
        Movie[] actual = movieManager.findAll();
        Movie[] expected = new Movie[]{movie15};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetAllMoreTen() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);
        manager.add(movie13);
        manager.add(movie14);
        manager.add(movie15);
        Movie[] actual = manager.findLast();
        Movie[] expected = new Movie[]{movie15, movie14, movie13, movie12, movie11,
                movie10, movie9, movie8, movie7, movie6};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetAllLessTen() {
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);
        manager.add(movie13);
        manager.add(movie14);
        manager.add(movie15);
        Movie[] actual = manager.findLast();
        Movie[] expected = new Movie[]{movie15, movie14, movie13, movie12, movie11,
                movie10};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSetCountMovie() {
        manager.add(movie0);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.setCountMovie(4);
        Movie[] actual = manager.findLast();
        Movie[] expected = new Movie[]{movie10, movie9, movie8, movie7};
        assertArrayEquals(expected, actual);
    }
}