package se.lexicon;

/**
 * 1. Write a program which will store elements in an array of type ‘int’ and
 * print it out.
 * Expected output: 11 23 39 etc.
 */

public class Exercise01 {
    public static void main(String[] args) {
        ex1();
    }

    public static void ex1() {
        int[] numbers = { 12 , 34 , 67 , 98 , 82 };
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

