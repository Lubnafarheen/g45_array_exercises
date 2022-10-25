package se.lexicon;
/**
 * 12.Write a program which will print the diagonal elements of two dimensional array.
 * Expected output: 1 4 9
 */
public class Exercise12 {
  public static void main(String[] args) {
ex12();
  }

  public static void ex12() {
int [][] twoDArray = {{1,2,3},{2,4,6},{3,6,9}};
    System.out.println("The diagonal elements of 2D array are ");
for (int i =0; i<twoDArray.length; i++){
  for (int j =0; j<twoDArray[i].length; j++){
    if( i == j){
      System.out.print(twoDArray[i][j] + "\t" );
    }
  }
}

  }

}
