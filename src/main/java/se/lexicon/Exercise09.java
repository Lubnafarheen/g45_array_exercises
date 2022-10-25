package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 9. Write a method which will add elements in an array.
 * Remember that arrays are fixed in size so you need to come up with a
 * solution to “expand” the array
 */

public class Exercise09 {
    final static String PRINT_MESSAGE = "#### Welcome ####\nThis is a program to create a array/list of values!\nNote: press 0 to exit\n";

    private static int[] array = new int[0]; // [5, 7, 56]

    public static void main(String[] args) {
        ex9();
    }

    public static void ex9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(PRINT_MESSAGE);

        while (true) {
            System.out.println("Enter a value you want to add to create an array: ");
            int userInput = scanner.nextInt();
            if (userInput != 0) {
                int[] newArray = Arrays.copyOf(array , array.length + 1);// [5, 7, 56 ,0]
                newArray[newArray.length - 1] = userInput;// [56]
                array = newArray;// [5, 7, 56]
                System.out.println(Arrays.toString(array));
            }
            else {
                System.out.println("You are exiting the program");
                break;
            }

        }
    }
}
