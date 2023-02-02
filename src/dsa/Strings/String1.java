package dsa.Strings;

import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();

        for (char c: inputStr.toCharArray()) {

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {

            }
            else {
                System.out.print(c);
            }
        }

        String[] chars = {"a", "e", "i", "o", "u"};
        for (int a = 0; a < chars.length; a++)
        {
            inputStr = inputStr.replace(chars[a], "");
        }

        System.err.println(inputStr);
    }
}
