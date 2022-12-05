import java.util.Scanner;

public class B1_Bai2_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap cuong do dong dien I: ");
        float i = s.nextFloat(); s.nextLine();
        System.out.print("Nhap dien tro R: ");
        float r = s.nextFloat(); s.nextLine();
        System.out.println("Hieu dien the U = " + i * r);
    }
}
