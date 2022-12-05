package Bai_3;

public class TamGiac extends Hinh {
  private int canh1;
  private int canh2;
  private int canh3;

  public TamGiac() {
    super();
    this.canh1 = 0;
    this.canh2 = 0;
    this.canh3 = 0;
  }

  public int getCanh1() {
    return canh1;
  }

  public void setCanh1(int canh1) {
    this.canh1 = canh1;
  }

  public int getCanh2() {
    return canh2;
  }

  public void setCanh2(int canh2) {
    this.canh2 = canh2;
  }

  public int getCanh3() {
    return canh3;
  }

  public void setCanh3(int canh3) {
    this.canh3 = canh3;
  }

  public void Inkq() {
    System.out.println("Canh 1: " + this.getCanh1());
    System.out.println("Canh 2: " + this.getCanh2());
    System.out.println("Canh 3: " + this.getCanh3());
    System.out.println("Mau: " + this.getMau());
  }

  public boolean kiemTra() {
    if (this.getCanh1() + this.getCanh2() > this.getCanh3() && this.getCanh1() + this.getCanh3() > this.getCanh2() && this.getCanh2() + this.getCanh3() > this.getCanh1()) {
      return true;
    }
    return false;
  }

  public double chuVi() {
    return this.getCanh1() + this.getCanh2() + this.getCanh3();
  }

  public double dienTich() {
    double p = this.chuVi() / 2;
    return Math.sqrt(p * (p - this.getCanh1()) * (p - this.getCanh2()) * (p - this.getCanh3()));
  }
}
