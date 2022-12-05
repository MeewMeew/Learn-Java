import java.util.Scanner;

public class B2_Phan1_Bai3 {
    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap a = ");
        int a = s.nextInt();
        System.out.print("Nhap b = ");
        int b = s.nextInt();
        System.out.print("Nhap c = ");
        char c = s.next().charAt(0);

        switch (c) {
            case '+':
                System.out.println("Tong = " + (a+b));
                break;
            case '-':
                System.out.println("Hieu = " + (a-b));
                break;
            case '*' :
                System.out.println("Tich = " + (a*b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Khong chia duoc");
                } else {
                    int d = a / b;
                    System.out.println("Thuong = " + d);
                }
                break;
            case '%':
                System.out.println("Chia du = " + (a%b));
                break;
            default:
                System.out.println("Nhap sai toan tu!");
                break;
        }
    }
}
