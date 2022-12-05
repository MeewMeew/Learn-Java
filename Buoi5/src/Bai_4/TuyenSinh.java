package Bai_4;

import java.util.Scanner;

public class TuyenSinh {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] messages = {
            "Them thi sinh moi",
            "Hien thi thong tin thi sinh va khoi thi",
            "Tim kiem theo so bao danh",
            "Thoat chuong trinh"
    };
    System.out.println("==== Menu ====");
    for (int i = 0; i < messages.length; i++) {
      System.out.println((i + 1) + ". " + messages[i]);
    }

    ThiSinh[] DSThiSinh = new ThiSinh[500];
    while (true) {
      System.out.print("Nhap lua chon: ");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1: {
          System.out.printf("Nhap so luong thi sinh: ");
          int n = scanner.nextInt(); scanner.nextLine();
          for (int i = 0; i < n; i++) {
            // bat dau nhap
            System.out.println("Nhap thong tin thi sinh thu " + (i + 1));
            System.out.printf("Nhap ten: ");
            String name = scanner.nextLine();
            System.out.printf("Nhap dia chi: ");
            String address = scanner.nextLine();
            System.out.printf("Nhap muc uu tien: ");
            int priority = scanner.nextInt();
            System.out.printf("Nhap so bao danh: ");
            int id = scanner.nextInt(); scanner.nextLine();
            System.out.printf("Nhap khoi thi: ");
            String block = scanner.nextLine();
            ThiSinh thiSinh = new ThiSinh(name, address, priority, id);
            // ket thuc nhap

            // su dung tinh nang tu dong them thong tin test
//              String name = "ThiSinh" + i;
//              String address = "DiaChi" + i;
//              int priority = (int) (Math.random() * 3 + 1);
//              String block = "ABC".charAt((int) (Math.random() * 3)) + "";
//              ThiSinh thiSinh = new ThiSinh(name, address, priority, i);
            // ket thuc tinh nang

            if (block.equals("A")) {
              thiSinh.setKhoiA();
            } else if (block.equals("B")) {
              thiSinh.setKhoiB();
            } else {
              thiSinh.setKhoiC();
            }
            DSThiSinh[i] = thiSinh;
          }
          break;
        }
        case 2: {
          int i = 0;
          String leftFormatRowInTable = "| %-11d | %-25s | %-40s | %-7s | %-8s |\n";
          System.out.println("=========================================== DANH SACH THI SINH ============================================");
          System.out.println("+-------------+---------------------------+------------------------------------------+---------+----------+");
          System.out.println("| So bao danh | Ho va ten                 | Dia chi                                  | Uu tien | Khoi thi |");
          System.out.println("+-------------+---------------------------+------------------------------------------+---------+----------+");
          for (ThiSinh thiSinh : DSThiSinh) {
            if (thiSinh == null) break;
            System.out.printf(
              leftFormatRowInTable,
              thiSinh.getId(),
              thiSinh.getName(),
              thiSinh.getAddress(),
              thiSinh.getPriority(),
              thiSinh.getBlock()
            );
            i++;
          }
          System.out.println("+-------------+---------------------------+------------------------------------------+---------+----------+");
          System.out.println("Co tat ca " + i + " thi sinh trong danh sach");
          break;
        }
        case 3: {
          System.out.printf("Nhap so bao danh: ");
          int id = scanner.nextInt();
          int i = 0;
          while (i++ < DSThiSinh.length) {
            if (DSThiSinh[i] == null) {
              System.out.println("Khong tim thay thi sinh co so bao danh " + id);
              break;
            } else if (DSThiSinh[i].getId() == id) {
              System.out.println("Thong tin thi sinh co so bao danh " + id);
              System.out.println("Ho va ten: " + DSThiSinh[i].getName());
              System.out.println("Dia chi: " + DSThiSinh[i].getAddress());
              System.out.println("Uu tien: " + DSThiSinh[i].getPriority());
              System.out.println("Khoi thi: " + DSThiSinh[i].getBlock());
              System.out.println("Mon thi: " + DSThiSinh[i].getSubject1() + ", " + DSThiSinh[i].getSubject2() + ", " + DSThiSinh[i].getSubject3());
              break;
            }
          }
          break;
        }
        case 4:
          System.out.println("Thoat chuong trinh");
          System.exit(0);
      }
    }
  }
}
