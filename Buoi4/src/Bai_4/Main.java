package Bai_4;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    CanBo DSCanBo[] = new CanBo[100];

    for (int i = 0; i < 100; i++) {
      DSCanBo[i] = new CanBo();
//      System.out.printf("Nhap thong tin can bo thu %d", i + 1);
//      System.out.print("Nhap ma gv: ");
//      DSCanBo[i].setMa(scanner.nextLine());
//      System.out.print("Nhap ho ten: ");
//      DSCanBo[i].setHoTen(scanner.nextLine());
//      System.out.print("Nhap dia chi: ");
//      DSCanBo[i].setDiaChi(scanner.nextLine());
//      System.out.print("Nhap chuc vu: ");
//      DSCanBo[i].setChucVu(scanner.nextLine());
//      System.out.print("Nhap he so: ");
//      DSCanBo[i].setHeSo(scanner.nextFloat());
//      System.out.println("Nhap them can bo khac? (y/n)");
//      if (scanner.next().equals("n")) {
//        break;
//      }
      // random data
      DSCanBo[i].setMa("GV" + i);
      DSCanBo[i].setHoTen("Ho ten " + i);
      DSCanBo[i].setDiaChi("Dia chi " + i);
      DSCanBo[i].setChucVu("Chuc vu " + i);
      DSCanBo[i].setHeSo(i);
    }

    System.out.print("Nhap ten can bo can tim: ");
    String ten = scanner.nextLine();
    for (int i = 0; i < 100; i++) {
      if (DSCanBo[i].getHoTen().equals(ten)) {
        System.out.println("\nThong tin can bo can tim: ");
        DSCanBo[i].HienThi();
      }
    }
    System.out.println("Khong tim thay thong tin can bo can tim");
  }
}
