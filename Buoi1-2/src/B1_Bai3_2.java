import java.util.Scanner;

public class B1_Bai3_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap b = ");
        int b = s.nextInt(); s.nextLine();
        String result = "b la so " + (b % 2 == 0 ? "chan" : "le");
        System.out.println(result);
    }
}
