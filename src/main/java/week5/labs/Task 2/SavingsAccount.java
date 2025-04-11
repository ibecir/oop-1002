public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        deposit(getBalance() * interestRate);
    }

    @Override
    public String toString() {
        return "SavingsAccount -> " + super.toString() + ", Interest Rate: " + interestRate;
    }
}