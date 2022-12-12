package Java14;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class SwitchExpression {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month name:");
        String monthName = sc.nextLine();

        /* Earlier, it was not possible to combine multiple cases,
            Every case has to be written using old school switch case style using break statements. */
        int daysInMonth = switch (monthName.substring(0,3).toUpperCase()) {

            case "JAN", "MAR", "MAY", "JUL", "AUG", "OCT", "DEC" -> 31;
            case "APR", "JUN", "SEP", "NOV" -> 30;
            case "FEB" -> 28;
            default -> throw new IllegalArgumentException("I don't know what month '" + monthName + "' is");
        };

        System.out.println(daysInMonth);

        System.out.println("Enter a vowel:");
        String ch = sc.nextLine().substring(0,1).toUpperCase();
        switch (ch) {
            case "A", "E", "I", "O", "U" -> System.out.println("That's right son. It is a vowel!");
            case "B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P",
                    "Q", "R", "S", "T", "V", "W", "X", "Z" -> System.out.println("It's a consonant dummy!");
            case "Y" -> System.out.println("It can be both, depends on how you use it. A needy alphabet.");
            default -> System.out.println("Are you kidding me? That's not even an alphabet!!");
        }
    }
}