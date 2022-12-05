package B3_Bai2;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1, "Minh", 13465);

        System.out.println("So TK: " + acc.getAcc_no());
        System.out.println("Ten TK: " + acc.getName());
        System.out.println("So Tien: " + acc.getAmount());
    }
}
