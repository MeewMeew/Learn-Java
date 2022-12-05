package Bai_2;

public class Circle extends Shape {
  private int banKinh;

  public Circle(String colour, int banKinh) {
    super(colour);
    this.banKinh = banKinh;
  }

  public int getBanKinh() {
    return banKinh;
  }

  public void setBanKinh(int banKinh) {
    this.banKinh = banKinh;
  }

  public double tinhDienTich() {
    return 3.14 * 2 * this.banKinh;
  }

  @Override
  public String toString() {
    double dientich = this.tinhDienTich();
    return "Mau: " + this.getColour() + ", Dien tich: " + dientich + ", Ban kinh: " + this.getBanKinh() + "\n";
  }
}
