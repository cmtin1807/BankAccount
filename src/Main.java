import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();


        accounts.add(new SavingsAccount(23456, "Nguyên", 5000, 0.03));
        accounts.add(new CheckingAccount(12345, "Quyết", 2000, 1000));


        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new DepositTransaction(23456, 1000));
        transactions.add(new WithdrawTransaction(12345, 3001));
        transactions.add(new WithdrawTransaction(12345, 2500));


        for (Transaction transaction : transactions) {
            for (BankAccount account : accounts) {
                if (account.getAccountNumber() == (transaction.accountNumber)) {
                    transaction.processTransaction(account);
                    transaction.printTransactionDetails();
                    System.out.println();
                }
            }
        }

        System.out.println("Account Details:");
        for (BankAccount account : accounts) {
            if (account instanceof SavingsAccount) { // Kiểm tra nếu account là SavingsAccount
                System.out.println("SavingsAccount: " + account.toString());
            } else  {
                System.out.println("CheckingAccount: " + account.toString());
            }
        }
    }
}
