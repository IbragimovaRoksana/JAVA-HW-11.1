package ru.netology.domain;

public class MovieManager {
    private Movie[] posters = new Movie[0];
    private int countMovie;

    public MovieManager(int countMovie) {
        this.countMovie = countMovie;
    }

    public MovieManager() { this.countMovie = 10;
    }

    public void setCountMovie(int count) {
        this.countMovie = count;
    }

    public void add(Movie poster) {
        // создаём новый массив размером на единицу больше
        int length = posters.length + 1;
        Movie[] tmp = new Movie[length];
        // копируем поэлементно
        System.arraycopy(posters, 0, tmp, 0, posters.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = poster;
        posters = tmp;
    }

    public Movie[] findLast() {
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
        return posters;
    }

}
