package Experiment;

import java.util.Arrays;

public class Numbers20 {
    public static void main(String[] args) {
        int myNumbers[][] = new int[3][5];
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Length of row " + (i + 1) + ": " + myNumbers[i].length);
        }
    }
}
