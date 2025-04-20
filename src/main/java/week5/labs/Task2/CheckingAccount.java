package week5.labs.Task2;
public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String ownerName, double balance, double overdraftLimit) {
        super(accountNumber, ownerName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount -> " + super.toString() + ", Overdraft Limit: $" + overdraftLimit;
    }
}