import java.util.Scanner;

public class B1_Bai3_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Giai phuong trinh ax^2 + bx + c = 0");
        System.out.print("Nhap a = ");
        float a = s.nextFloat(); s.nextLine();
        System.out.print("Nhap b = ");
        float b = s.nextFloat(); s.nextLine();
        System.out.print("Nhap c = ");
        float c = s.nextFloat(); s.nextLine();

        double delta = delta(a, b, c);
        calc(a, b, c, delta);
    }

    public static double delta (float a, float b, float c) {
        return (b * b) - (4 * a * c);
    }

    public static void calc (float a, float b, float c, double delta) {
        String result;
        if (delta < 0) result = "Phuong trinh vo nghiem";
        else if (delta == 0) {
            double x = -b / (2 * a);
            result = "Phuong trinh co nghiem kep: x1 = x2 = " + round(x, 2);
        }
        else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            // result is rounded
            result = "Phuong trinh co 2 nghiem phan biet: x1 = " + round(x1, 2) + " va x2 = " + round(x2, 2);
        }
        System.out.println(result);
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}