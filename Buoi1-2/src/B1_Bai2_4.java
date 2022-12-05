import java.util.Scanner;

public class B1_Bai2_4 {
    public static void main(String[] args) {
        final double pi = 3.14;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ban kinh r = ");
        float r = s.nextFloat(); s.nextLine();
        double chuVi = 2 * pi * r;
        double dienTich = (chuVi / 2) * r;
        double dienTichXungQuanh = round(4 * dienTich, 2);
        double theTich = round((dienTichXungQuanh * r) / 3, 2);
        System.out.println("Chu vi: " + chuVi + "\nDien tich: " + dienTich + "\nDien tich xung quanh: " + dienTichXungQuanh  + "\nThe tich: " + theTich);
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
