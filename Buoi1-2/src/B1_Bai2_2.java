import java.util.Scanner;

public class B1_Bai2_2 {
    public static void main(String[] args) {
        final float rate = 5;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so tien da gui: ");
        float amount = s.nextFloat(); s.nextLine();
        System.out.print("Nhap thoi gian gui: ");
        int months = s.nextInt(); s.nextLine();
        double interest = amount * months / 12 / 100 * rate;
        System.out.println("So tien lai la: " + round(interest, 2));
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
