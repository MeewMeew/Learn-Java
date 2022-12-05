import java.util.Scanner;

public class B1_Bai2_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("a = ");
        float a = s.nextFloat(); s.nextLine();
        System.out.print("b = ");
        float b = s.nextFloat(); s.nextLine();
        double perimeter = (a + b) * 2;
        double area = a * b;
        System.out.println("Chu vi: " + round(perimeter, 2) + "\nDien tich: " + round(area, 2));
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
