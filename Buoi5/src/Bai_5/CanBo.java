package Bai_5;

import java.util.Scanner;

public class CanBo {
  private String name, sex, address;
  private int age;
  private String position;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public void setInput() {
    Scanner s = new Scanner(System.in);
    System.out.print("Nhap ten: ");
    name = s.nextLine();
    System.out.print("Nhap dia chi: ");
    address = s.nextLine();
    System.out.print("Nhap gioi tinh(1 = Nam, 2 = Nu, 3 = Khac): ");
    int _sex = s.nextInt();
    if (_sex == 1) sex = "Nam";
    else if (_sex == 2) sex = "Nu";
    else sex = "Khac";
    System.out.print("Nhap tuoi: ");
    age = s.nextInt(); s.nextLine();
  }

  public void getOutput() {
    System.out.println("Ten can bo: " + name);
    System.out.println("Dia chi: " + address);
    System.out.println("Tuoi: " + age);
    System.out.println("Gioi tinh: " + sex);
  }
}
