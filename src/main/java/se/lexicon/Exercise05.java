package se.lexicon;

public class Exercise05 {
    public static void main(String[] args) {
        ex5();
    }
    /**
     * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
     * Expected output:
     * France Paris
     * Sweden Stockholm
     */
    public static void ex5() {
        String[][] countryCityArray = { { "France" , "Paris" } , { "Sweden" , "Stockholm" } };
        for (int i=0; i< countryCityArray.length; i++ ){
            for (int j = 0; j < countryCityArray[i].length; j++) {
                System.out.print(countryCityArray[i][j] +"\t");
            }
            System.out.println();
        }


    }

}
