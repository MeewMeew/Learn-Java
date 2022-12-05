package Bai_1;

public class MountainBike extends Bike {
  private double sizeBank;

  public double getSizeBank() {
    return sizeBank;
  }

  public void setSizeBank(double sizeBank) {
    this.sizeBank = sizeBank;
  }

  public MountainBike(String khungXe, double inStream, double sizeBank) {
    super(khungXe, inStream);
    this.sizeBank = sizeBank;
  }

  @Override
  public String toString() {
    return "Khung xe: " + this.getKhungXe() + "Chieu cao hang chan: " +this.getInStream()+ "Size banh: %f" + this.getSizeBank();
  }
}
