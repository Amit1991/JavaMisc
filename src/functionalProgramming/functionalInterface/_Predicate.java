package functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        Predicate<String> validIndianPhoneNumber = a -> a.startsWith("+91");
        Predicate<String> validMobileNumber = a -> a.substring(1).length() == 12;
        Predicate<String> validIndianMobileNumber = validIndianPhoneNumber.and(validMobileNumber);

        System.out.println(validIndianPhoneNumber.test("+918655090667"));
        System.out.println(validIndianPhoneNumber.test("+768655090667"));
        System.out.println("----");

        System.out.println(validMobileNumber.test("+918655090667"));
        System.out.println(validMobileNumber.test("+768655090"));
        System.out.println("--------");

        System.out.println(validIndianMobileNumber.test("+918655090667"));
        System.out.println(validIndianMobileNumber.test("+918655090"));
        System.out.println(validIndianMobileNumber.test("+768655090667"));
        System.out.println("----------------");

        BiPredicate<String, Integer> validIndianMobileNumberV2 =
                (a, b) -> a.startsWith("+91") && a.length() == b;

        System.out.println(validIndianMobileNumberV2.test("+918655090667", 13));
        System.out.println(validIndianMobileNumberV2.test("+918655090", 13));
        System.out.println(validIndianMobileNumberV2.test("+768655090667", 13));
    }
}
