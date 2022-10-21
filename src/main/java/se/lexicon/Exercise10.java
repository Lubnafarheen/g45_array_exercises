package se.lexicon;
/**
 * 10.Write a program which will represent multiplication table stored in multidimensional array.
 * Hint: You have two-dimensional array with values
 * [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
 */

public class Exercise10 {
    public static void main(String[] args) {
ex10();
    }
    public static void ex10(){

      int multiplicationTable [][] = new int[2][10];
      for(int row=0; row< multiplicationTable.length; row++){
        for (int column=0; column<multiplicationTable[row].length; column++){
          multiplicationTable[row][column] = (row + 1)*(column + 1);
          System.out.print(multiplicationTable[row][column] +"\t");
        }
        System.out.println("");
      }

    }
    }

