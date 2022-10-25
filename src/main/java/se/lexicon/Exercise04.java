package se.lexicon;
/**
 * 4. Write a program which will copy the elements of one array into another array.
 * Expected output:
 * Elements from first array: 1 15 20
 * Elements from second array: 1 15 20
 */

import java.util.Arrays;

public class Exercise04 {

    public static void main(String[] args) {
        ex4();
    }

    public static void ex4() {
        int[] firstArray = { 1 , 15 , 20 };
        int[] secondArray = Arrays.copyOf(firstArray , firstArray.length);

        System.out.println("Elements from first array");
        printArrayElements(firstArray);

        System.out.println("\nElements from second array");
        printArrayElements(firstArray);
    }

    public static void printArrayElements(int[] arrayToPrint) {
        for (int element : arrayToPrint) {
            System.out.print(element + "\t");
        }
    }

}
