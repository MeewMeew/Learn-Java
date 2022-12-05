package Bai_2;

public class Fish extends Animal {
  public void swim () {
    System.out.println(this.getName() + " said: I'm swimming !!");
  }

  public void dive () {
    System.out.println(this.getName() + " said: I'm diving");
  }

  @Override
  public Fish haveBaby (String name) {
    Fish baby = new Fish();
    baby.setName(name);
    return baby;
  }
}
