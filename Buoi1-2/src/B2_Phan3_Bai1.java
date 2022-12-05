import java.util.Scanner;

public class B2_Phan3_Bai1 {
    public void run() {
        Scanner s = new Scanner(System.in);
        Consoler c = new Consoler();
        System.out.print("Nhap n = ");
        int n = s.nextInt();
        int[] A = new int[n];
        while (n < 1) {
            System.out.println("Vui long nhap n >= 1!");
            System.out.print("Nhap n = ");
            n = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap A[" + i + "] = ");
            A[i] = s.nextInt();
        }

        c.clear();

        System.out.print("Day A vua nhap la: ");
        for (int i = 0; i < n; i++) {
            if ( i == (n-1)) System.out.println(A[i]);
            else System.out.print(A[i] + ", ");
        }

        int sumEven = 0;
        int multiplicationOdd = 1;

        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                sumEven += A[i];
            } else {
                multiplicationOdd *= A[i];
            }
        }

        System.out.println("Tong cac phan tu co gia tri chan la: " + sumEven);
        System.out.println("Tich cac phan tu co gia tri le la: " + multiplicationOdd);

        double TB = 0;
        int sumAll = 0;
        for (int i = 0; i < n; i++) {
            sumAll += A[i];
        }
        TB = (double) (sumAll / n);

        System.out.printf("GIA TRI TRUNG BINH CUA MANG A LA %6.2f\n" ,TB);

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] > TB) count++;
        }

        System.out.printf("SO PHAN TU A CO GIA TRI > %6.2f LA %3d\n", TB, count);
    }
}
