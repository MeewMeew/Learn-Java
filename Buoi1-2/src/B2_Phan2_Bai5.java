import java.util.Scanner;

public class B2_Phan2_Bai5 {
    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap a = ");
        int a = s.nextInt();
        System.out.print("Nhap b = ");
        int b = s.nextInt();
        int ucln = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) ucln = i;
        }
        System.out.println("Uoc chung lon nhat cua 2 so a va b la: " + ucln);
    }
}
