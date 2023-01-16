package InterviewQues;

import java.util.Arrays;
import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();

        int count = 0;

        for (char a: inputStr.toCharArray()) {

            count++;
        }

        System.out.println(count);


        count = 0;

        while(count>=0)
        {
            try {
                inputStr.charAt(count);
            }
            catch (StringIndexOutOfBoundsException e) {
                break;
            }
            count++;
        }

        System.out.println(count);

        System.out.println(inputStr.lastIndexOf(""));
    }
}
