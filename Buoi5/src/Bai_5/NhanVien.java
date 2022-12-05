package Bai_5;

import java.util.Scanner;

public class NhanVien extends CanBo {
  private String job;

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  @Override
  public void setInput() {
    Scanner s = new Scanner(System.in);
    super.setInput();
    System.out.print("Nhap cong viec: ");
    job = s.nextLine();
    this.setPosition("Nhan Vien");
  }

  @Override
  public void getOutput() {
    super.getOutput();
    System.out.println("Cong viec: " + job);
    System.out.println("Phan loai can bo: Nhan Vien");
  }
}
