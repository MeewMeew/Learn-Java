package Bai_5;

import java.util.Scanner;

public class KySu extends CanBo {
  private String majors;

  public String getMajors() {
    return majors;
  }

  public void setMajors(String majors) {
    this.majors = majors;
  }

  @Override
  public void setInput() {
    Scanner s = new Scanner(System.in);
    super.setInput();
    System.out.print("Nhap nganh dao tao: ");
    majors = s.nextLine();
    this.setPosition("Ky Su");
  }

  @Override
  public void getOutput() {
    super.getOutput();
    System.out.println("Nganh dao tao: " + majors);
    System.out.println("Phan loai can bo: Ky Su");
  }
}
