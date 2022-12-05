package Bai_4;

public class ThiSinh {
  private String name, address, subject1, subject2, subject3, block;
  private int priority;
  private int id;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getPriority() {
    return priority;
  }

  public void setPriority(int priority) {
    this.priority = priority;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getBlock() {
    return block;
  }

  public void setBlock(String block) {
    this.block = block;
  }

  public String getSubject1() {
    return subject1;
  }

  public void setSubject1(String subject1) {
    this.subject1 = subject1;
  }

  public String getSubject2() {
    return subject2;
  }

  public void setSubject2(String subject2) {
    this.subject2 = subject2;
  }

  public String getSubject3() {
    return subject3;
  }

  public void setSubject3(String subject3) {
    this.subject3 = subject3;
  }

  public ThiSinh(String name, String address, int priority, int id) {
    this.name = name;
    this.address = address;
    this.priority = priority;
    this.id = id;
  }

  public void setKhoiA() {
    this.setBlock("A");
    this.setSubject1("Math");
    this.setSubject2("Physical");
    this.setSubject3("Chemistry");
  }

  public void setKhoiB() {
    this.setBlock("B");
    this.setSubject1("Math");
    this.setSubject2("Chemistry");
    this.setSubject3("Biology");
  }

  public void setKhoiC() {
    this.setBlock("C");
    this.setSubject1("Literature");
    this.setSubject2("History");
    this.setSubject3("Geography");
  }
}
