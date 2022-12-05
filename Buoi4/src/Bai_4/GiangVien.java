package Bai_4;

import java.util.Scanner;

public abstract class GiangVien {
  private String Ma, HoTen, DiaChi;

  public abstract void Nhap();
  public abstract void HienThi();

  public String getMa() {
    return Ma;
  }

  public void setMa(String ma) {
    Ma = ma;
  }

  public String getHoTen() {
    return HoTen;
  }

  public void setHoTen(String hoTen) {
    HoTen = hoTen;
  }

  public String getDiaChi() {
    return DiaChi;
  }

  public void setDiaChi(String diaChi) {
    DiaChi = diaChi;
  }
}
