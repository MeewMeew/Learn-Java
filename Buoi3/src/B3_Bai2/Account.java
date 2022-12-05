package B3_Bai2;

public class Account {
    private int acc_no;
    private String name;
    private double amount;

    public int getAcc_no() {
        return acc_no;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account(int acc_no, String name, double amount) {
        this.setAcc_no(acc_no);
        this.setName(name);
        this.setAmount(amount);
    }
}
