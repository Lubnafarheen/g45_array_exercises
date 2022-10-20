package se.lexicon;

/**
 * 9. Write a method which will add elements in an array.
 * Remember that arrays are fixed in size so you need to come up with a
 * solution to “expand” the array
 */

public class Exercise09 {
  public static void main(String[] args) {
ex9();
  }

  public static void ex9() {
    int [] number= new int [] {1,2,3,4};
    int [] exnum =  new int [12];

    exnum [4]= 5;
    exnum [5]= 6;
    exnum [6]= 7;
    exnum [7]= 8;
    System.arraycopy(number, 0, exnum, 0, number.length);
    for (int num: exnum){
      System.out.println(num);
    }


  }

}
