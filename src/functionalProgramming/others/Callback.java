package others;

import java.util.Scanner;
import java.util.function.Function;

public class Callback {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String fNname = sc.nextLine();

        System.out.print("Enter your last name: ");
        String lNname = sc.nextLine();

        //greetings("Amit", null, null);
        greetings(fNname, lNname, (a) -> {
            System.out.println(a);
            return null;
        });
    }

    static void greetings(String firstName, String lastName, Function<String, String> callback) {

        System.out.print("Hello " + firstName);
        if (lastName != null && lastName.trim().length() > 0)
        {
            System.out.print(" " + lastName + "!");
        }
        else {
            callback.apply("! Surname kya hai aapka?");
        }

    }
}
