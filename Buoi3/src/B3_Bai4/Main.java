package B3_Bai4;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.ScanInfo();
        hcn.PrintInfo();

        System.out.println("Hinh chu nhat co chieu dai = 10, chieu rong = 5 la:");
        HinhChuNhat vip = new HinhChuNhat(10, 5);
        vip.PrintInfo();
    }
}
