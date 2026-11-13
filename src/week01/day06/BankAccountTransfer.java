package week01.day06;
import week01.day05.BankAccount;
public class BankAccountTransfer {

    public static boolean transfer(
            BankAccount src,
            BankAccount dest,
            double amount
    ) {
            if (src == null ||
                    dest == null ||
                    src == dest ||
                    amount <= 0.0) {

                return false;
            }
             if (!src.withdraw(amount)) {
             return false;
             }
            if (dest.deposit(amount)) {
                // Transfer is complete
                return true;

             }
            // Rollback: restore money to source account
               src.deposit(amount);
               return false;
            }

             public static void main(String[] args) {


                 BankAccount acc1 = new BankAccount("ACC-101", "Abebe", 500.0);
                 BankAccount acc2 = new BankAccount("ACC-102", "Kebede", 200.0);
                 boolean success = transfer(acc1,acc2,150.0);
                 System.out.println("Transfer Success: " + success);
                 System.out.println("ACC-101 Balance: $" + acc1.getBalance());
                 System.out.println("ACC-102 Balance: $" + acc2.getBalance());
                 BankAccount acc3 = new BankAccount("ACC-103", "Dawit", 100.0);
                 BankAccount acc4 = new BankAccount("ACC-104", "Mekdes", 200.0);

                 boolean failedTransfer = transfer(acc3, acc4, 100.0);

                 System.out.println("Transfer Success: " + failedTransfer);
                 System.out.println("ACC-103 Balance: $" + acc3.getBalance());
                 System.out.println("ACC-104 Balance: $" + acc4.getBalance());
                 boolean self =  transfer(acc3, acc3, 50.0);
                 System.out.println("self-Transfer " + self);
    }
}
