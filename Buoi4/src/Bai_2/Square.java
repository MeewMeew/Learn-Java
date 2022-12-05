package Bai_2;

public class Square extends Shape {
  private int chieuDai;

  public Square(String colour, int chieuDai) {
    super(colour);
    this.chieuDai = chieuDai;
  }

  public int getChieuDai() {
    return chieuDai;
  }

  public void setChieuDai(int chieuDai) {
    this.chieuDai = chieuDai;
  }

  public int tinhDienTich() {
    return this.chieuDai * this.chieuDai;
  }

  @Override
  public String toString() {
    int dientich = this.tinhDienTich();
    return "Mau: " + this.getColour() + ", Chieu dai: " + this.getChieuDai() + ", Dien tich: " + dientich + "\n";
  }
}
