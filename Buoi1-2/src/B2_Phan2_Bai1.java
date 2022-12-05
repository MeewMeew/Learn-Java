import java.util.Scanner;

public class B2_Phan2_Bai1 {
    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = s.nextInt();
        int sum = 0;
        while (n <= 1) {
            System.out.println("Vui long nhap n > 1!");
            System.out.print("Nhap n = ");
            n = s.nextInt();
        }
        for (int i = 0; i < n; i ++) {
            if (i % 2 == 0 && i % 3 == 0) sum += i;
        }
        System.out.println("S = " + sum);
    }
}
