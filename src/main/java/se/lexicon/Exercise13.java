package se.lexicon;

import java.util.Arrays;

/**
 * 13. Create two arrays with arbitrary size and fill one with random numbers.
 * Then copy over the numbers from the array with random numbers so
 * that the even numbers are located in the rear (the right side) part of the
 * array and the odd numbers are located in the front part (the left side).
 */

public class Exercise13 {
  public static void main(String[] args) {
ex13();
  }

  public static void ex13() {
int[] firstArray =  {1,2,3,4,5,6,7,8,9,10};
int[] secondArray = new int [firstArray.length];
int frontIndex = 0;
int backIndex = firstArray.length-1;

for (int i : firstArray){
  if(i % 2 == 0){
    secondArray[frontIndex] = i;
    frontIndex++;
  }else {
    secondArray[backIndex] = i;
    backIndex--;
  }
}
    System.out.println(Arrays.toString(firstArray));
    System.out.println(Arrays.toString(secondArray));
  }

}
