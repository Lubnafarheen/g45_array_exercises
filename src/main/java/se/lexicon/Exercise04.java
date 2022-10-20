package se.lexicon;

import java.util.Arrays;

public class Exercise04 {

    public static void main(String[] args) {
        ex4();
    }

    /**
     * 4. Write a program which will copy the elements of one array into another array.
     * Expected output:
     * Elements from first array: 1 15 20
     * Elements from second array: 1 15 20
     */
    public static void ex4() {
        int[] firstArray = { 1 , 15 , 20 };
        int[] secondArray = Arrays.copyOf(firstArray , firstArray.length);

        System.out.println("Elements from first array");
        for (int elementsOfFirstArray : firstArray) {
            System.out.print(elementsOfFirstArray + "\t");
        }

        System.out.println("\nElements from second array");
        for (int elementsOfSecondArray : secondArray) {
            System.out.print(elementsOfSecondArray + "\t");
        }
    }

}
