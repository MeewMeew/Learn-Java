import java.util.Scanner;

public class B1_Bai3_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Giai phuong trinh ax + b = 0");
        System.out.print("Nhap a = ");
        float a = s.nextFloat(); s.nextLine();
        System.out.print("Nhap b = ");
        float b = s.nextFloat(); s.nextLine();
        String result;
        if (a == 0) {
            if (b != 0) result = "Phuong trinh vo nghiem";
            else result = "Phuong trinh vo so nghiem";
            System.out.println(result);
        } else {
            double x = -b/a;
            System.out.printf("x = %.2f", x);
        }
    }
}
