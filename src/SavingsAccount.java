// Lớp SavingsAccount kế thừa lớp BankAccount sử dụng tính kế thừa (Inheritance)
public class SavingsAccount extends BankAccount {

    // Các biến instance và phương thức sử dụng tính đóng gói (Encapsulation)
    private double interestRate; // Encapsulation: Thuộc tính private chỉ truy cập thông qua getter và setter

    // Overload Constructor SavingsAccount sử dụng tính đa hình (Polymorphism)
    public SavingsAccount() {} // Polymorphism: Constructor mặc định

    public SavingsAccount(long accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance); // Inheritance: Gọi constructor của lớp cha
        this.interestRate = interestRate; // Encapsulation: Gán giá trị qua constructor
    }


    // Getter và Setter cho interestRate (Encapsulation)
    public double getInterestRate() { // Encapsulation
        return interestRate;
    }

    public void setInterestRate(double interestRate) { // Encapsulation
        this.interestRate = interestRate;
    }

    // Phương thức withdraw Override từ lớp cha BankAccount sử dụng tính đa hình (Polymorphism)
    @Override
    public boolean withdraw(double amount) { // Polymorphism: Ghi đè phương thức cha
        if (amount > 0 && getBalance() >= amount) { // Encapsulation: Gọi phương thức getBalance()
            setBalance(getBalance() - amount); // Encapsulation: Thay đổi trạng thái thông qua setter
            return true;
        }
        return false;
    }

    /**
     * Phương thức toString trong lớp SavingsAccount
     * Sử dụng tính trừu tượng (Abstraction) để định nghĩa cách hiển thị thông tin cụ thể của tài khoản tiết kiệm.
     * Sử dụng tính đóng gói (Encapsulation) để truy cập dữ liệu private interestRate một cách an toàn.
     * Sử dụng tính kế thừa (Inheritance) để mở rộng logic từ phương thức toString của lớp cha BankAccount.
     * Sử dụng tính đa hình (Polymorphism) để triển khai cách hiển thị đặc biệt cho lớp SavingsAccount.
     */
    @Override
    public String toString() {
        // Gọi phương thức toString từ lớp cha BankAccount
        // Kế thừa logic hiển thị thông tin cơ bản (số tài khoản, tên chủ tài khoản, số dư)
        return super.toString()
                + ", Interest Rate: " + interestRate;
    }
}
