package ru.netology.domain;

public class MovieManager {
    private MovieRepository repository;
    private int countMovie;

    public MovieManager(MovieRepository repository) {
        this.countMovie = 10;
        this.repository=repository; }

    public void setCountMovie(int count) {
        this.countMovie = count;
    }

    public void add(Movie poster) {
       repository.save(poster);
    }

    public Movie[] findLast() {
        Movie[] posters = repository.findAll();
        if (posters.length < countMovie) {
            Movie[] result = new Movie[posters.length];
            // перебираем массив в прямом порядке
            // но кладём в результаты в обратном
            for (int i = 0; i < result.length; i++) {
                int index = posters.length - i - 1;
                result[i] = posters[index];
            }
            return result;
        } else {
            Movie[] result = new Movie[countMovie];
            // перебираем массив в прямом порядке
            // но кладём в результаты в обратном
            for (int i = 0; i < countMovie; i++) {
                int index = posters.length - i - 1;
                result[i] = posters[index];
            }
            return result;
        }
    }

    public Movie[] findAll() {
        return repository.findAll();
    }

}
