import java.util.Scanner;

public class B2_Phan2_Bai3 {
    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap a = ");
        int a = s.nextInt();
        System.out.print("Nhap b = ");
        int b = s.nextInt();

        for (int i = 0; i < a; i ++) {
            for (int j = 0; j < b; j ++) {
                if (j == (b - 1)) {
                    System.out.println("*");
                } else {
                    System.out.print("* ");
                }
            }
        }
    }
}
