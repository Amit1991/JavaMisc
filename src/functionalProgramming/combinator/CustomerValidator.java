package combinator;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidator {

    private boolean isEmailValid(String email) {

        return email.contains("@");
    }

    private boolean isPhoneNumberValid(String phoneNum) {

        return phoneNum.contains("+91");
    }

    private boolean isAdult(LocalDate dob) {

        return Period.between(dob, LocalDate.now()).getYears() >= 18;
    }

    public boolean isValidCustomer(Customer c) {

        /* I'm ashamed for writing these lines...
        return !isEmailValid(c.getEmail()) ? false
                : (!isPhoneNumberValid(c.getPhoneNumber()) ? false
                : (!isAdult(c.getDob()) ? false : true)); */

        return isEmailValid(c.getEmail())
                && isPhoneNumberValid(c.getPhoneNumber())
                && isAdult(c.getDob());
    }
}
