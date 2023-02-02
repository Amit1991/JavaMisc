package combinator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinator.ValidationResult.*;

public interface ICustomerValidator extends Function<Customer, ValidationResult> {

    static ICustomerValidator isEmailValid() {

        return customer -> customer.getEmail().contains("@") ? Success : Invalid_Email;
    }

    static ICustomerValidator isPhoneNumberValid() {

        return customer -> customer.getPhoneNumber().contains("+91")
                ? Success : Invalid_Phone_Number;
    }

    static ICustomerValidator isAdult() {

        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() >= 18
                ? Success
                : Not_An_Adult.setResultMsg(String.format(Not_An_Adult.toString(),
                                            Period.between(customer.getDob(), LocalDate.now())
                                                    .getYears()));
    }

    default ICustomerValidator and(ICustomerValidator other) {

        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(Success) ? other.apply(customer) : result;
        };
    }
}
