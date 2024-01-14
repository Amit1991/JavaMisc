package exceptionHandling.customException;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor @Data
public class Account {

    private long accountNumber;
    private String ownerName;
    private double balance;

    public void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);
        System.out.println("Amount deposited. Your current balance is: " + this.getBalance());
    }

    public void withdraw(double amount) throws UnderdraftException {
        if(this.getBalance() < 1) {
            throw new UnderdraftException("You have insufficient balance.");
        }
        if(this.getBalance() < amount) {
            throw new OverdraftException("Your account have less amount than you want to withdraw.");
        }
        else {
            this.setBalance(this.getBalance() - amount);
            System.out.println("Amount withdrawn. Your current balance is: " + this.getBalance());
        }
    }

    public void withdrawAll() throws UnderdraftException {
        if(this.getBalance() < 1) {
            throw new UnderdraftException("There is nothing to withdraw");
        }
        else {
            double withdrawalAmount = this.getBalance();
            this.setBalance(0.0);
            System.out.println("You have withdrawn " + withdrawalAmount + "/-" +
                    "\nYour current balance is NIL.");
        }
    }
}
