package com.purwadhika;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PracticeTest03 {

    @Test
    void testCalculateNumberSeries() {
        Practice03 practice03 = new Practice03();
        assertEquals(10, practice03.calculateNumberSeries(1234));
        assertThrows(IllegalArgumentException.class, () -> practice03.calculateNumberSeries(-1));
    }

    @Test
    void testIsPrime() {
        Practice03 practice03 = new Practice03();
        assertTrue(practice03.isPrime(17));
        assertFalse(practice03.isPrime(10));
        assertFalse(practice03.isPrime(1));
    }

    @Test
    void testLargestNumbers() {
        Practice03 practice03 = new Practice03();
        int[] values = {3, 7, 2, 8, 1};
        assertEquals(8, practice03.largestNumbers(values));
        assertThrows(IllegalArgumentException.class, () -> practice03.largestNumbers(null));
    }

    @Test
    void testCalculator() {
        Practice03 practice03 = new Practice03();
        assertEquals(8, practice03.calculator(5, 3, "+"));
        assertEquals(5, practice03.calculator(10, 5, "-"));
        assertEquals(30, practice03.calculator(5, 6, "*"));
        assertEquals(5, practice03.calculator(10, 2, "/"));
        assertThrows(IllegalArgumentException.class, () -> practice03.calculator(10, 0, "/"));
        assertThrows(IllegalArgumentException.class, () -> practice03.calculator(10, 5, "%"));
    }

    @Test
    void testReversedString() {
        Practice03 practice03 = new Practice03();
        assertEquals("olleh", practice03.reversedString("hello"));
        assertNull(practice03.reversedString(null));
    }

    @Test
    void testFibonacci() {
        Practice03 practice03 = new Practice03();
        assertEquals("0 1 1 2 3 5", practice03.fibonacci(6));
        assertEquals("1 1 2 3 5 8", practice03.fibonacci(6, 1));
        assertThrows(IllegalArgumentException.class, () -> practice03.fibonacci(1));
        assertThrows(IllegalArgumentException.class, () -> practice03.fibonacci(6, 2));
    }

    @Test
    void testCountVowel() {
        Practice03 practice03 = new Practice03();
        assertEquals(3, practice03.countVowel("programming"));
        assertEquals(-1, practice03.countVowel(null));
    }

    @Test
    void testBubbleSort() {
        Practice03 practice03 = new Practice03();
        int[] values = {64, 34, 25, 12, 22, 11, 90};
        int[] sortedValues = {11, 12, 22, 25, 34, 64, 90};
        assertArrayEquals(sortedValues, practice03.bubbleSort(values));
        assertThrows(IllegalArgumentException.class, () -> practice03.bubbleSort(null));
    }

    @Test
    void testIsAnagram() {
        Practice03 practice03 = new Practice03();
        assertTrue(practice03.isAnagram("listen", "silent"));
        assertFalse(practice03.isAnagram("hello", "world"));
        assertThrows(IllegalArgumentException.class, () -> practice03.isAnagram(null, "silent"));
        assertThrows(IllegalArgumentException.class, () -> practice03.isAnagram("listen", null));
    }

    @Test
    void testGetSecondSmallest() {
        Practice03 practice03 = new Practice03();
        int[] values = {5, 3, 8, 1, 2, 9};
        assertEquals(2, practice03.getSecondSmallest(values));
        assertThrows(IllegalArgumentException.class, () -> practice03.getSecondSmallest(null));
        assertThrows(IllegalArgumentException.class, () -> practice03.getSecondSmallest(new int[]{}));
    }
}
