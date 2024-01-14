package exceptionHandling.customException;

public class TestCustomException {

    public static void main(String[] args) {

        try {
            Account myAccount = new Account(4563589, "Amit", 130119.5);
            myAccount.deposit(110000);
            myAccount.withdraw(140000);
            myAccount.withdrawAll();
            myAccount.withdraw(5);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
