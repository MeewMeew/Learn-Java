package Bai_5;

import java.util.Scanner;

public class QLCB {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    CanBo[] DSCanBo = new CanBo[10000];

    String[] messages = {
            "Them can bo moi",
            "Tim kiem theo ho ten",
            "Hien thi thong tin va danh sach can bo",
            "Thoat chuong trinh"
    };
    System.out.println("==== Menu ====");
    for (int i = 0; i < messages.length; i++) {
      System.out.println((i + 1) + ". " + messages[i]);
    }

    while (true ) {
      System.out.print("\nNhap lua chon: ");
      int choice = sc.nextInt(); sc.nextLine();
      switch (choice) {
        case 1: {
          String[] typeList = {
                  "Cong nhan",
                  "Ky su",
                  "Nhan vien"
          };
          System.out.println("\n==== Chon phan loai can bo ====");
          for (int i = 0; i < typeList.length; i++) {
            System.out.println("abcdefghijklmnopqrstuvwxyz".charAt(i) + ". " + typeList[i]);
          }
          System.out.print("\nNhap loai can bo can them: ");
          String type = sc.nextLine();
          switch (type) {
            case "a": {
              System.out.print("\nNhap so luong cong nhan can them: ");
              int n = sc.nextInt();
              for (int i = 0; i < n; i++) {
                System.out.println("Nhap thong tin cong nhan thu " + (i + 1));
                CongNhan congNhan = new CongNhan();
                congNhan.setInput();
                DSCanBo[i] = congNhan;
              }
              break;
            }
            case "b": {
              System.out.print("\nNhap so luong ky su can them: ");
              int n = sc.nextInt();
              for (int i = 0; i < n; i++) {
                System.out.println("Nhap thong tin ky su thu " + (i + 1));
                KySu kySu = new KySu();
                kySu.setInput();
                DSCanBo[i] = kySu;
              }
              break;
            }
            case "c": {
              System.out.print("\nNhap so luong nhan vien can them: ");
              int n = sc.nextInt();
              for (int i = 0; i < n; i++) {
                System.out.println("Nhap thong tin nhan vien thu " + (i + 1));
                NhanVien nhanVien = new NhanVien();
                nhanVien.setInput();
                DSCanBo[i] = nhanVien;
              }
              break;
            }
          }
          break;
        }
        case 2: {
          System.out.print("\nNhap ho ten can tim: ");
          String name = sc.nextLine();
          for (int i = 0; i < DSCanBo.length; i++) {
            if (DSCanBo[i] != null && DSCanBo[i].getName().equals(name)) {
              DSCanBo[i].getOutput();
            }
          }
          break;
        }
        case 3: {
          int i = 0;
          String leftAlignFormat = "| %-3d | %-25s | %-25s | %-10s | %-15s | %-15s |%n";
          System.out.format("+-----+---------------------------+---------------------------+------------+-----------------+-----------------+%n");
          System.out.format("| STT | Ho ten                    | Dia chi                   | Gioi tinh  | Tuoi            | Chuc vu         |%n");
          System.out.format("+-----+---------------------------+---------------------------+------------+-----------------+-----------------+%n");
          for (CanBo canBo : DSCanBo) {
            if (canBo != null) {
              System.out.format(
                leftAlignFormat,
                ++i,
                canBo.getName(),
                canBo.getAddress(),
                canBo.getAge(),
                canBo.getSex(),
                canBo.getPosition()
              );
            }
          }
          System.out.format("+-----+---------------------------+---------------------------+------------+-----------------+-----------------+%n");
          break;
        }
        case 4: {
          System.out.println("Thoat chuong trinh");
          System.exit(0);
        }
      }
    }
  }
}
