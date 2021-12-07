package ru.netology.manager;

import ru.netology.domain.Movie;

public class AfishaManager {

    public static final Movie bloodshot = new Movie(1, 010, "bloodshot", "hitman", false);
    public static final Movie forward = new Movie(2, 011, "forward", "cartoon", false);
    public static final Movie hotelBelgrade = new Movie(3, 012, "hotelBelgrade", "comedy", false);
    public static final Movie gentlemen = new Movie(4, 013, "gentlemen", "hitman", false);
    public static final Movie invisibleMan = new Movie(5, 014, "invisibleMan", "horrors", false);
    public static final Movie trollsWorldTour = new Movie(6, 015, "trollsWorldTour", "cartoon", true);
    public static final Movie numberOne = new Movie(7, 016, "numberOne", "comedy", true);
    public static final Movie houseGucci = new Movie(8, 017, "houseGucci", "drama", false);
    public static final Movie encanto = new Movie(9, 021, "encanto", "cartoon", false);
    public static final Movie pilot = new Movie(10, 022, "pilot", "biography", false);

    public Movie[] movies = new Movie[0];

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


    public Movie[] getAll(int resultLength) {
        int movieCount;
        if (resultLength <= movies.length) {
            movieCount = resultLength;
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

    public Movie[] getAll() {
        int resultLength = 10;
        return this.getAll(resultLength);
    }
}





