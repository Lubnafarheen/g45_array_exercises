package se.lexicon;

/**
 * 6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
 * Expected output: Average is: 17.3
 */

public class Exercise06 {


    public static void main(String[] args) {
        ex6();
    }

    public static void ex6() {
        double[] value = {43, 5, 23, 17, 2, 14};
        double sum = 0;
            for (int i = 0; i < value.length; i++) {

                 sum += value[i];

            }
            System.out.println("The average of the array of elements is " + sum / value.length);
        }
    }


