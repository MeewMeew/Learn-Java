package B3_Bai8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat();
        System.out.print("Nhap so luong xe: ");
        int n = s.nextInt();
        Vehicle v[] = new Vehicle[n];
//            System.out.println("===================================");

        // unrecomment to using this
        // auto add temp data to array
        for (int i = 0; i < n; i++) {
            v[i] = new Vehicle("Xe " + (i + 1), "Chu xe " + (i + 1), 1000 + i, 1000000 + i);
        }
//        for (int i = 0; i < n; i++) {
//            System.out.printf("Nhap thong tin xe thu %d\n", (i + 1));
//            System.out.print("Nhap ma xe: ");
//            String maXe = s.next();
//            System.out.print("Nhap ten chu xe: ");
//            String chuXe = s.next();
//            System.out.print("Nhap dung tich xe: ");
//            int dungTichXe = s.nextInt();
//            System.out.print("Nhap gia tri xe: ");
//            double giaTriXe = s.nextDouble();
//            v[i] = new Vehicle(maXe, chuXe, dungTichXe, giaTriXe);
//            System.out.println("===================================");
//        }

        String leftFormatRowInTable = "| %-9s | %-24s | %-12d | %-15s | %-16s |\n";
        System.out.println("================================== BANG KE KHAI TIEN THUE ==================================");

        System.out.format("+-----------+--------------------------+--------------+-----------------+------------------+\n");
        System.out.format("|   Ma xe   |          Chu xe          | Dung tich xe |    Gia tri xe   |   Thue phai nop  |\n");
        System.out.format("+-----------+--------------------------+--------------+-----------------+------------------+\n");
        for (int i = 0; i < n; i++) {
            double tax = v[i].getDungTichXe() < 100 ? v[i].getDungTichXe() * 0.01 : v[i].getDungTichXe() < 200 ? v[i].getDungTichXe() * 0.03 : v[i].getDungTichXe() * 0.05;
            System.out.format(leftFormatRowInTable, v[i].getMaXe(), v[i].getChuXe(), v[i].getDungTichXe(), f.format(v[i].getGiaTriXe()), f.format(tax));
        }
        System.out.format("+-----------+--------------------------+--------------+-----------------+------------------+\n");
    }
}