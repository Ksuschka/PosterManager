package ru.netology.manager;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

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

    public static final Movie[] testMovies = new Movie[] {bloodshot, forward, hotelBelgrade, gentlemen, invisibleMan, trollsWorldTour, numberOne, houseGucci, encanto, pilot};

    AfishaManager manager = new AfishaManager();

    @Test
    public void shouldgetAllMovie(){
        for (int i = 0; i < testMovies.length; i++) {
            manager.add(testMovies[i]);
        }
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[] {pilot, encanto, houseGucci, numberOne, trollsWorldTour, invisibleMan, gentlemen, hotelBelgrade, forward, bloodshot};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovie() {
        manager.add(AfishaManager.numberOne);
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{numberOne};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovie5() {
        for (int i = 0; i < 5; i++) {
            manager.add(testMovies[i]);
        }
        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[] {invisibleMan, gentlemen, hotelBelgrade, forward, bloodshot};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShow5() {
        for (int i = 0; i < testMovies.length; i++) {
            manager.add(testMovies[i]);
        }
        Movie[] actual = manager.getAll(5);
        Movie[] expected = new Movie[] {pilot, encanto, houseGucci, numberOne, trollsWorldTour};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShow13() {
        for (int i = 0; i < testMovies.length; i++) {
            manager.add(testMovies[i]);
        }
        Movie[] actual = manager.getAll(13);
        Movie[] expected = new Movie[] {pilot, encanto, houseGucci, numberOne, trollsWorldTour, invisibleMan, gentlemen, hotelBelgrade, forward, bloodshot};
        assertArrayEquals(expected, actual);

    }


}