package Bai_4;

import java.util.Scanner;

public class CanBo extends GiangVien {
  private String ChucVu;
  private float HeSo;

  public String getChucVu() {
    return ChucVu;
  }

  public void setChucVu(String chucVu) {
    ChucVu = chucVu;
  }

  public float getHeSo() {
    return HeSo;
  }

  public void setHeSo(float heSo) {
    HeSo = heSo;
  }

  public void Nhap() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap ma gv: ");
    this.setMa(scanner.nextLine());
    System.out.print("Nhap ho ten: ");
    this.setHoTen(scanner.nextLine());
    System.out.print("Nhap dia chi: ");
    this.setDiaChi(scanner.nextLine());
    System.out.print("Nhap chuc vu: ");
    this.setChucVu(scanner.nextLine());
    System.out.print("Nhap he so: ");
    this.setHeSo(scanner.nextFloat());
  }

  public void HienThi() {
    System.out.println("Ma gv: " + this.getMa());
    System.out.println("Ho ten: " + this.getHoTen());
    System.out.println("Dia chi: " + this.getDiaChi());
    System.out.println("Chuc vu: " + this.getChucVu());
    System.out.println("He so: " + this.getHeSo());
  }
}
