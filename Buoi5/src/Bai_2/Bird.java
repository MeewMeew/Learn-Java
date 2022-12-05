package Bai_2;

public class Bird extends Animal {
  public void fly () {
    System.out.println(this.getName() + " said: I'm flying !!");
  }

  @Override
  public Bird haveBaby (String name) {
    Bird baby = new Bird();
    baby.setName(name);
    return baby;
  }
}
