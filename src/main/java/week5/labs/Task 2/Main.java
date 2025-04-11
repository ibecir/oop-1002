public class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("101", "Grace", 1000, 0.03);
        s.deposit(200);
        s.applyInterest();
        System.out.println(s);

        CheckingAccount c = new CheckingAccount("202", "Henry", 500, 200);
        c.withdraw(600); // should work
        c.withdraw(200); // should not work
        System.out.println(c);
    }
}