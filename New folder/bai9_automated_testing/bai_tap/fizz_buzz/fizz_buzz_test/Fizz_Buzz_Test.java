package bai9_automated_testing.bai_tap.fizz_buzz.fizz_buzz_test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Fizz_Buzz_Test {
    @Test
    void test12() {
        int number = 12;
        String expected = "Fizz";
        String result = FizzBuzz.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void test20() {
        int number = 20;
        String expected = "Buzz";
        String result = FizzBuzz.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void test15() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void test16() {
        int number = 16;
        String expected = "mot sau ";
        String result = FizzBuzz.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void test434() {
        int number = 434;
        String expected = "Fizz";
        String result = FizzBuzz.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void test454() {
        int number = 454;
        String expected = "Buzz";
        String result = FizzBuzz.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void test26() {
        int number = 26;
        String expected = "hai sau ";
        String result = FizzBuzz.translate(number);
        assertEquals(expected, result);
    }
}
