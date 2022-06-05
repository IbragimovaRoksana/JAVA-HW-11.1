package ru.netology.domain;

public class MovieRepository {
    Movie[] posters = new Movie[0];

    public void save(Movie poster) {
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

    public Movie[] findAll() {
        return posters;
    }

    public Movie findById(String id) {
        Movie result = new Movie();
        for (Movie poster : posters) {
            if (poster.getId().equals(id)) result = poster;
        }
        return result;
    }

    public void removeById(String id) {
        Movie[] result = new Movie[posters.length - 1];
        int j = 0;
        for (int i = 0; i < posters.length; i++) {
            if (!(posters[i].getId().equals(id))) {
                result[j] = posters[i];
                j++;
            }
        }
        posters = result;
    }

    public void removeAll() {
        Movie[] tmp = new Movie[0];
        posters = tmp;
    }
}
