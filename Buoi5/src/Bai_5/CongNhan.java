package Bai_5;

import java.util.Scanner;

public class CongNhan extends CanBo {
  private int level;

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  @Override
  public void setInput() {
    Scanner s = new Scanner(System.in);
    super.setInput();
    System.out.print("Nhap bac: ");
    level = s.nextInt(); s.nextLine();
    this.setPosition("Cong Nhan");
  }

  @Override
  public void getOutput() {
    super.getOutput();
    System.out.println("Bac: " + level);
    System.out.println("Phan loai can bo: Cong Nhan");
  }
}
