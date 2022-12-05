import java.util.Scanner;

public class B1_Bai3_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap a = ");
        int a = s.nextInt();
        String result = "A la so " + (a < 0 ? "am" : a == 0 ? "0" : "duong");
        System.out.println(result);
    }
}
