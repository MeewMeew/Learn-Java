package Bai_1;

public class Bike {
  private String khungXe;
  private double inStream;

  public String getKhungXe() {
    return khungXe;
  }

  public void setKhungXe(String khungXe) {
    this.khungXe = khungXe;
  }

  public double getInStream() {
    return inStream;
  }

  public void setInStream(double inStream) {
    this.inStream = inStream;
  }

  public Bike(String khungXe, double inStream) {
    this.khungXe = khungXe;
    this.inStream = inStream;
  }

  @Override
  public String toString() {
    return "Khung xe: " + this.khungXe + "Chieu cao hang chan: " + this.inStream;
  }
}
