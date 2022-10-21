package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 9. Write a method which will add elements in an array.
 * Remember that arrays are fixed in size so you need to come up with a
 * solution to “expand” the array
 */

public class Exercise09 {

    private static int[] array = new int[0]; // [5, 7, 56]



    public static void ex9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n1 = sc.nextInt();
        int[] newArray = Arrays.copyOf(array , array.length + 1);// [5, 7, 56 ,0]
        newArray[newArray.length - 1] = n1;// [56]

        array = newArray;// [5, 7, 56]
        System.out.println(Arrays.toString(array));

    }

}


