package Bai_2;

public class Tiger extends Animal {
  public void run(int speed) {
    System.out.println(this.getName() + " said: I'm running with speed " + speed);
  }

  @Override
  public Tiger haveBaby(String name) {
    Tiger baby = new Tiger();
    baby.setName(name);
    return baby;
  }
}
