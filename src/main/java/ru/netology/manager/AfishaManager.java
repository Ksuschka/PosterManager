package ru.netology.manager;

import ru.netology.domain.Movie;


public class AfishaManager {
    private int resultLength;
    public Movie[] movies = new Movie[0];

    public AfishaManager() {
        this.resultLength = 10;
    }

    public AfishaManager(int resultLength) {
        this.resultLength = resultLength;
    }

    // добавление фильма в ленту
    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }


    public Movie[] getAll() {
        int movieCount;
        if (this.resultLength <= movies.length) {
            movieCount = this.resultLength;
        } else {
            movieCount = movies.length;
        }
        Movie[] result = new Movie[movieCount];
        for (int i = 0; i < movieCount; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}





