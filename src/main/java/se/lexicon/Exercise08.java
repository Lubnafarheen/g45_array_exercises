package se.lexicon;

import java.util.Arrays;

/**
 * 8. Write a program which will remove the duplicate elements of a given array [20, 20, 40, 20, 30, 40, 50, 60, 50].
 * Expected output:
 * Array: 20 20 40 20 30 40 50 60 50
 * Array without duplicate values: 20 40 30 50 60
 */

public class Exercise08 {
    public static void main(String[] args) {
        ex8();
    }

    public static void ex8(){
        int numbers[] = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        int size = numbers.length;
        System.out.print("The original array is: [");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.print("]");
        System.out.println();
        Arrays.sort(numbers);
        int result = dupElement(numbers, size);
        for (int i = 0; i < result; i++) {
            System.out.print(numbers[i] + " ");
        }
    }


    public static int dupElement(int[] arr, int size) {
        if (size == 0 || size == 1) {
            return size;
        }

        int j = 0;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[size - 1];
        return j;
    }
}








