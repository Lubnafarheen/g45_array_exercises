package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 11.Write a program that ask the user for an integer and repeat that
 * question until user give you a specific value that user already has been
 * told about as a message in your program. Store these values in an array
 * and print that array. After that reverse the array elements so that the
 * first element becomes the last element, the second element becomes
 * the second to last element, etc. Do not just reverse the order in which
 * they are printed. You need to change the way they are stored in the
 * array.
 */

public class Exercise11 {

    public static void main(String[] args) {
       ex11();
    }

    public static void ex11() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Java Program to create an Array by taking Input from the user and then reversing the same array \n");
        System.out.println("Enter the number of elements you want in your array?");
        int numberOfElements = scanner.nextInt();
        int[] array = new int[numberOfElements];
        for (int i =0; i<numberOfElements; i++){
            System.out.println("Enter array element " +(i +1));
            array[i] = scanner.nextInt();
        }
        System.out.println("Original array:");
        for (int i =0; i<numberOfElements; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n Reversed array:");
        for (int i= numberOfElements - 1; i>=0; i--){
            System.out.print(array[i] + " ");
        }


    }

}

