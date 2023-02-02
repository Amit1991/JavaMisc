package combinator;

import java.time.LocalDate;
import static combinator.ICustomerValidator.*;

public class TestClass {

    public static void main(String[] args) {

        Customer customer = new Customer("Amit", "a@b.com",
                "+918655090667", LocalDate.of(2010, 4, 30));

        System.out.println(new CustomerValidator().isValidCustomer(customer));

        ValidationResult result = isEmailValid().and(isPhoneNumberValid())
                                    .and(isAdult()).apply(customer);

        System.out.println(result.name() + " : " + result);
    }
}
