package hu.fazekas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SheepCounterTest {

    @Test
    void getAllSheepCount() {
        SheepCounter obj = new SheepCounter();
        int total = obj.getAllSheepCount();
        assertEquals(0, total);
        String[] animals = new String[]{"sheep", "duck", "dog", "sheep"};
        obj.sheepCount(animals);
        total = obj.getAllSheepCount();
        assertEquals(2, total);
        obj.sheepCount(animals);
        total = obj.getAllSheepCount();
        assertEquals(4, total);
    }

    @Test
    void getAliveSheepCount() {

        String[] animals = new String[]{"sheep", "duck", "wolf", "sheep"};
        SheepCounter obj = new SheepCounter();
        int total25 = obj.getAliveSheepCount(animals);
        assertEquals(1, total25);
    }

    @Test
    void getAliveSheepCount2() {

        String[] animals = new String[]{"sheep", "duck", "wOlf", "sheep"};
        SheepCounter obj = new SheepCounter();
        int total25 = obj.getAliveSheepCount(animals);
        assertEquals(1, total25);

    }

    @Test
    void getAliveSheepCount3() {

        String[] animals = new String[]{"sheep", "duck", "WOlf", "sheep"};
        SheepCounter obj = new SheepCounter();
        int total25 = obj.getAliveSheepCount(animals);
        assertEquals(1, total25);
    }
    @Test
    void getAliveSheepCount5() {

        String[] animals = new String[]{"sheep", "duck", "WTlF", "sheep"};
        SheepCounter obj = new SheepCounter();
        int total25 = obj.getAliveSheepCount(animals);
        assertEquals(1, total25);
    }
    @Test
    void getAliveSheepCount6() {

        String[] animals = new String[]{"sheep", "duck", "WSlK", "sheep"};
        SheepCounter obj = new SheepCounter();
        int total25 = obj.getAliveSheepCount(animals);
        assertEquals(1, total25);
    }
    @Test
    void getAliveSheepCount7() {

        String[] animals = new String[]{"sheep", "duck", "ALWolF", "sheep"};
        SheepCounter obj = new SheepCounter();
        int total25 = obj.getAliveSheepCount(animals);
        assertEquals(1, total25);
    }
    @Test
    void getAliveSheepCount8() {

        String[] animals = new String[]{"sheep", "duck", "WolF", "sheep"};
        SheepCounter obj = new SheepCounter();
        int total25 = obj.getAliveSheepCount(animals);
        assertEquals(1, total25);
    }
    @Test
    void getAliveSheepCount9() {

        String[] animals = new String[]{"sheep", "duck", "WlF", "sheep"};
        SheepCounter obj = new SheepCounter();
        int total25 = obj.getAliveSheepCount(animals);
        assertEquals(1, total25);
    }
}