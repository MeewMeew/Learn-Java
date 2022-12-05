package Bai_3;

import java.util.Scanner;

public class Main2 {
  public static void main(String[] args) {
    TamGiac tamGiac = new TamGiac();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap canh 1: ");
    tamGiac.setCanh1(scanner.nextInt());
    System.out.print("Nhap canh 2: ");
    tamGiac.setCanh2(scanner.nextInt());
    System.out.print("Nhap canh 3: ");
    tamGiac.setCanh3(scanner.nextInt());
    System.out.print("Nhap mau: ");
    tamGiac.setMau(scanner.next());
    tamGiac.Inkq();
  }
}
