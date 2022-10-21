package se.lexicon;
/**
 * 7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
 * Expected output: Array: 1 2 4 7 9 12
 * Odd Array: 1 7 9
 */
public class Exercise07 {
  public static void main(String[] args) {
     ex7();
  }

  public static void ex7() {
    int [] numbers = {1, 2, 4, 7, 9, 12, 15, 17, 20};
    System.out.print("Odd Array : ");
    for (int number : numbers){
      if (number % 2 != 0){
        System.out.print(number + "\t");
      }
    }
  }
  public static void demo(){
    for(int i=0; i<20; i++){
      if(i % 2 != 0){
        System.out.println(i);
      }
    }
  }

}
