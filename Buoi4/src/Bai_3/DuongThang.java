package Bai_3;

public class DuongThang extends Hinh {
  private int chieuDai;

  public int getChieuDai() {
    return chieuDai;
  }

  public void setChieuDai(int chieuDai) {
    this.chieuDai = chieuDai;
  }

  public DuongThang() {
    super();
  }

  public DuongThang(int chieuDai) {
    super();
    this.chieuDai = chieuDai;
  }

  public void Inkq() {
    System.out.println("So canh: " + this.getSoCanh());
    System.out.println("Mau: " + this.getMau());
  }

  public void ve() {
    while (this.getChieuDai() > 0) {
      System.out.print("-");
      this.setChieuDai(this.getChieuDai() - 1);
    }
  }
}
