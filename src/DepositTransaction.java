// Lớp DepositTransaction kế thừa lớp trừu tượng Transaction sử dụng tính kế thừa (Inheritance)
public class DepositTransaction extends Transaction {

    // Constructor của DepositTransaction
    public DepositTransaction(long accountNumber, double amount) {
        super(accountNumber, amount); // Inheritance: Gọi constructor của lớp cha Transaction
    }

    // Phương thức processTransaction Override từ lớp cha Transaction sử dụng tính đa hình (Polymorphism)
    @Override
    public void processTransaction(BankAccount account) {
        account.deposit(amount); // Encapsulation: Thay đổi trạng thái của BankAccount thông qua phương thức deposit
    }

    // Phương thức printTransactionDetails Override từ lớp cha Transaction sử dụng tính đa hình (Polymorphism)
    @Override
    public void printTransactionDetails() {
        System.out.println("Deposit Transaction: Account " + accountNumber + ", Amount: " + amount);
    }
}
