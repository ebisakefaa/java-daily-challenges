package week01.day05;

public class BankAccount {
private final String accountNumber;
private String accountHolder;
private double balance;
private static final double MINIMUM_BALANCE=25.00;


public BankAccount(String accountNumber, String accountHolder, double initialDeposit) {

    if (accountNumber == null || accountNumber.isBlank()) {
        throw new IllegalArgumentException(
                "Account number cannot be null or blank."
        );
    }
    if (initialDeposit < MINIMUM_BALANCE) {
        throw new IllegalArgumentException("Initial deposit must be at least $25.00.");
    }

    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = initialDeposit;
}
    public boolean deposit(double amount) {
    if(amount<=0.0){
            System.out.println("Failed"+"balance can't be less than or equal to 0.0");
            return false;
        }
        balance+=amount;
        System.out.printf(
                "✅ [SUCCESS] Deposited $%.2f -> New Balance: $%.2f%n",
                amount, balance
        );
      return true;
    }
    public boolean withdraw(double amount) {

        if (amount <= 0.0) {
            System.out.println("❌ Withdrawal amount must be positive.");
            return false;
        }

        if (balance - amount < MINIMUM_BALANCE) {
            System.out.println("❌ Withdrawal rejected: minimum balance requirement would be violated.");
            return false;
        }

        balance -= amount;

        System.out.printf(
                "✅ [SUCCESS] Withdrew $%.2f -> New Balance: $%.2f%n",
                amount, balance
        );

        return true;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(
                "ACC-101",
                "Abebe Bekele",
                500.00
        );

          acc.deposit(150.00);
          acc.deposit(0.00);
          acc.deposit(-50.00);
        acc.withdraw(100.00);
        acc.withdraw(625.00);
        acc.withdraw(640.00);
        acc.withdraw(0.00);
        acc.withdraw(-150.00);
        BankAccount testAccount = new BankAccount(
                "ACC-102",
                "Mekdes",
                650.00
        );

        testAccount.withdraw(625.00);
    }
}
