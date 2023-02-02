package dsa.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {

        /* Print all possible sub-arrays */
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        char[] charArr = inputStr.replace(" ", "").toCharArray();

        for (int a = 0; a < charArr.length+1; a++)
        {
            for (int b = a+1; b < charArr.length+1; b++)
            {
                System.out.println(Arrays.copyOfRange(charArr, a, b));
            }
        }
    }
}
