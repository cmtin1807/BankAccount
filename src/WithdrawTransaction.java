// Lớp CheckingAccount kế thừa lớp BankAccount sử dụng tính kế thừa (Inheritance)
public class WithdrawTransaction extends Transaction {

    // Constructor để khởi tạo giao dịch rút tiền
    public WithdrawTransaction(long accountNumber, double amount) {
        super(accountNumber, amount); // Inheritance: Gọi constructor của lớp cha Transaction
    }

    // Phương thức processTransaction Override từ lớp cha Transaction sử dụng tính đa hình (Polymorphism)
    @Override
    public void processTransaction(BankAccount account) { // Polymorphism: Ghi đè phương thức cha
        if (account.withdraw(amount)) { // Encapsulation: Gọi phương thức withdraw() của BankAccount
            System.out.println("Withdrawal successful."); // Thông báo khi giao dịch thành công
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or overdraft limit exceeded."); // Thông báo khi giao dịch thất bại
        }
    }

    // Phương thức printTransactionDetails Override từ lớp cha Transaction sử dụng tính đa hình (Polymorphism)
    @Override
    public void printTransactionDetails() { // Polymorphism: Ghi đè phương thức cha
        System.out.println("Withdraw Transaction: Account " + accountNumber + ", Amount: " + amount); // Inheritance: Sử dụng thuộc tính từ lớp cha
    }
}
