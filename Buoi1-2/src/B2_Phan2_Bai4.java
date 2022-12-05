import java.util.Scanner;

public class B2_Phan2_Bai4 {
    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = s.nextInt();
        while (n < 1) {
            System.out.println("Vui long nhap n >= 1!");
            System.out.print("Nhap n = ");
            n = s.nextInt();
        }
        long result = 1;

        for (int i = n; i > 0; i--) result *= i;

        System.out.println("Giai thua cua so n = " + result);
    }
}
