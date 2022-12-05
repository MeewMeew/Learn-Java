import java.util.Scanner;

public class B2_Phan2_Bai2 {
    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = s.nextInt();
        double sum = 0;
        while (n < 1) {
            System.out.println("Vui long nhap n >= 1!");
            System.out.print("Nhap n = ");
            n = s.nextInt();
        }
        for (int i = 1; i <= n; i ++) {
            double division = (double) 1 / i;
            sum += division;
        }
        System.out.printf("S = %10.9f", sum);
    }
}
