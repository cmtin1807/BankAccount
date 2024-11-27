// Xây dựng lớp BankAccount thông qua tính trừu tượng (Abstraction)
public abstract class BankAccount {

    // Các biến instance và phương thức sử dụng tính đóng gói (Encapsulation)
    private long accountNumber; // Encapsulation: Thuộc tính private
    private String accountHolder; // Encapsulation: Thuộc tính private
    private double balance; // Encapsulation: Thuộc tính private


    // OverLoad Constructor BankAccount sử dụng tính đa hình (Polymorphism)
    // Constructor mặc định
    public BankAccount() {}

    // Constructor đầy đủ
    public BankAccount(long accountNumber, String accountHolder, double balance) { // Encapsulation: Thiết lập giá trị qua constructor
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter và Setter tính đóng gói (Encapsulation: Điều khiển quyền truy cập thông qua các phương thức)
    public long getAccountNumber() { // Encapsulation
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) { // Encapsulation
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() { // Encapsulation
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) { // Encapsulation
        this.accountHolder = accountHolder;
    }

    public double getBalance() { // Encapsulation
        return balance;
    }

    public void setBalance(double balance) { // Encapsulation
        this.balance = balance;
    }

    // Phương thức trừu tượng (Abstraction): Không triển khai chi tiết tại đây
    public abstract boolean withdraw(double amount);

    // Phương thức gửi tiền (deposit) sử dụng tính đóng gói (Encapsulation) để thay đổi trạng thái của biến balance
    public void deposit(double amount) { // Encapsulation
        if (amount > 0) {
            balance += amount; // Encapsulation: Thay đổi thuộc tính thông qua phương thức
        }
    }

    // Phương thức toString sử dụng tính trừu tượng (Abstraction) và đóng gói (Encapsulation) để hiển thị thông tin
    @Override
    public String toString() { // Encapsulation: Truy cập thông tin qua phương thức
        return "Account Number: " + accountNumber +
                ", Account Holder: " + accountHolder +
                ", Balance: " + balance;
    }
}
