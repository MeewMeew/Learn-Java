import java.util.Scanner;

public class B2_Phan2_Bai6 {
    public void run() {
        // so nguyen so la so lon hon 1 va khong phai la tich cua 2 so tu nhien nho hon
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = s.nextInt();
        boolean isPrime = false;

        if (n < 2) {
            System.out.println(n + " khong phai la so nguyen to");
        } else {
            int squareRoot = (int) Math.sqrt(n);
            for (int i = 2; i <= squareRoot; i++) {
                if (n % i == 0) {
                    System.out.println(n + " khong phai la so nguyen to");
                    isPrime = false;
                } else isPrime = true;
            }
            if (isPrime) {
                System.out.println(n + " la so nguyen to");
            }
        }
    }
}
