// Lớp CheckingAccount kế thừa lớp BankAccount sử dụng tính kế thừa (Inheritance)
public class CheckingAccount extends BankAccount {

    // Các biến instance và phương thức sử dụng tính đóng gói (Encapsulation)
    private double overdraftLimit; // Encapsulation: Thuộc tính private chỉ truy cập qua getter/setter

    // Overload Constructor CheckingAccount sử dụng tính đa hình (Polymorphism)
    public CheckingAccount() {} // Polymorphism: Constructor mặc định

    public CheckingAccount(long accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance); // Inheritance: Gọi constructor của lớp cha
        this.overdraftLimit = overdraftLimit; // Encapsulation: Gán giá trị qua constructor
    }

    // Getter và Setter cho overdraftLimit (Encapsulation)
    public double getOverdraftLimit() { // Encapsulation
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) { // Encapsulation
        this.overdraftLimit = overdraftLimit;
    }

    // Phương thức withdraw Override từ lớp cha BankAccount sử dụng tính đa hình (Polymorphism)
    @Override
    public boolean withdraw(double amount) { // Polymorphism: Ghi đè phương thức cha
        if (amount > 0 && getBalance() + overdraftLimit >= amount) { // Encapsulation: Gọi phương thức getBalance()
            setBalance(getBalance() - amount); // Encapsulation: Thay đổi trạng thái thông qua setter
            return true;
        }
        return false;
    }

    /**
     * Phương thức toString trong lớp CheckingAccount
     * Sử dụng tính trừu tượng (Abstraction) để định nghĩa cách hiển thị thông tin cụ thể của tài khoản tiết kiệm.
     * Sử dụng tính đóng gói (Encapsulation) để truy cập dữ liệu private interestRate một cách an toàn.
     * Sử dụng tính kế thừa (Inheritance) để mở rộng logic từ phương thức toString của lớp cha BankAccount.
     * Sử dụng tính đa hình (Polymorphism) để triển khai cách hiển thị đặc biệt cho lớp CheckingAccount.
     */
    @Override
    public String toString() {
        // Gọi phương thức toString từ lớp cha BankAccount
        // Kế thừa logic hiển thị thông tin cơ bản (số tài khoản, tên chủ tài khoản, số dư)
        return super.toString() + ", Overdraft Limit: " + overdraftLimit;
    }
}
