package Bai_3;

import java.util.Scanner;

public class Main3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DuongThang duongThang = new DuongThang();
    System.out.print("Nhap chieu dai: ");
    duongThang.setChieuDai(scanner.nextInt());
    duongThang.setSoCanh(1);
    duongThang.Inkq();
    duongThang.ve();
  }
}
