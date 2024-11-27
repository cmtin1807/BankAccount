// Xây dựng lớp Transaction thông qua tính trừu tượng (Abstraction)
abstract class Transaction {

    // Các biến instance và phương thức sử dụng tính đóng gói (Encapsulation)
    protected long accountNumber; // Encapsulation: Thuộc tính được bảo vệ, truy cập trong lớp con
    protected double amount; // Encapsulation: Tương tự với accountNumber

    // Constructor để khởi tạo giao dịch
    public Transaction(long accountNumber, double amount) { // Encapsulation: Gán giá trị thông qua constructor
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    // Phương thức trừu tượng processTransaction, sử dụng tính trừu tượng (Abstraction) và tính đóng gói (Encapsulation)
    public abstract void processTransaction(BankAccount account);

    // Phương thức trừu tượng printTransactionDetails, sử dụng tính trừu tượng (Abstraction) và tính đóng gói (Encapsulation)
    public abstract void printTransactionDetails();
}
