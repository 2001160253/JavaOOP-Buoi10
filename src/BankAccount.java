import java.text.DecimalFormat;

public class BankAccount {
    private long accountNumber;
    private String accountName;
    private double money;

    private static final double interest = 0.035;
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public BankAccount(long accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.money = 50;
    }

    public BankAccount() {
        this.accountNumber = 0;
        this.accountName = "";
        this.money = 50;
    }

    private String formatCurrency(double amount) {
        DecimalFormat formatter = new DecimalFormat("###,### VNĐ");
        return formatter.format(amount);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", money=" + formatCurrency(money) +
                '}';
    }

    public void deposit(double amount) {
        if (amount > 0) {
            money += amount;
            System.out.println("Nạp tiền thành công. Số tiền trong tài khoản: " + formatCurrency(money));
        } else {
            System.out.println("Số tiền nạp vào phải lớn hơn 0.");
        }
    }

    public void withdraw(double amount, double fee) {
        if (amount > 0 && money >= (amount + fee)) {
            money -= (amount + fee);
            System.out.println("Rút tiền thành công. Số tiền trong tài khoản: " + formatCurrency(money));
        } else {
            System.out.println("Số tiền rút phải lớn hơn 0.");
        }
    }

    public void termDeposit() {
        double profit  = money * interest;
        money += profit;
        System.out.println("Đáo hạn thành công. Số tiền trong tài khoản sau đáo hạn: " + formatCurrency(money));
    }

    public void transfer(BankAccount account, double amount) {
        if (amount > 0 && money >= amount) {
            money -= amount;
            account.deposit(amount);
            System.out.println("Chuyển khoản thành công. Số tiền trong tài khoản: " + formatCurrency(money));
        } else {
            System.out.println("Số tiền chuyển khoản phải lớn hơn 0 và đủ trong tài khoản.");
        }
    }
}
