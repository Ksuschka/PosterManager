package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaManagerTest {
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

    public static final Movie[] testMovies = new Movie[]{bloodshot, forward, hotelBelgrade, gentlemen, invisibleMan, trollsWorldTour, numberOne, houseGucci, encanto, pilot};


    @Test
    public void shouldgetAllMovie() {
        AfishaManager manager = new AfishaManager();
        for (int i = 0; i < testMovies.length; i++) {
            manager.add(testMovies[i]);
        }
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{pilot, encanto, houseGucci, numberOne, trollsWorldTour, invisibleMan, gentlemen, hotelBelgrade, forward, bloodshot};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovie() {
        AfishaManager manager = new AfishaManager();
        manager.add(numberOne);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{numberOne};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovie5() {
        AfishaManager manager = new AfishaManager();
        for (int i = 0; i < 5; i++) {
            manager.add(testMovies[i]);
        }
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{invisibleMan, gentlemen, hotelBelgrade, forward, bloodshot};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShow5() {
        AfishaManager manager = new AfishaManager(5);
        for (int i = 0; i < testMovies.length; i++) {
            manager.add(testMovies[i]);
        }
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{pilot, encanto, houseGucci, numberOne, trollsWorldTour};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShow13() {
        AfishaManager manager = new AfishaManager(13);
        for (int i = 0; i < testMovies.length; i++) {
            manager.add(testMovies[i]);
        }
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{pilot, encanto, houseGucci, numberOne, trollsWorldTour, invisibleMan, gentlemen, hotelBelgrade, forward, bloodshot};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShow10() {
        AfishaManager manager = new AfishaManager(10);
        for (int i = 0; i < testMovies.length; i++) {
            manager.add(testMovies[i]);
        }
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{pilot, encanto, houseGucci, numberOne, trollsWorldTour, invisibleMan, gentlemen, hotelBelgrade, forward, bloodshot};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShow0() {
        AfishaManager manager = new AfishaManager(0);
        for (int i = 0; i < testMovies.length; i++) {
            manager.add(testMovies[i]);
        }
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{};
        assertArrayEquals(expected, actual);

    }
}