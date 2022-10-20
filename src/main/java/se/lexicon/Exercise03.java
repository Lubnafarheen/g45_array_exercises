package se.lexicon;

import java.util.Arrays;

public class Exercise03 {
    public static void main(String[] args) {
        ex3();
    }

    /**
     * 3. Write a program which will sort string array.
     * Expected output:
     * String array: [Paris, London, New York, Stockholm]
     * Sort string array: [London, New York, Paris, Stockholm]
     */
    public static void ex3() {
        String[] names = { "Paris" , "London" , "New York" , "Stockholm" };
        Arrays.sort(names);
        for (String name : names) {
            System.out.print(name + "\t");
        }
    }


}
