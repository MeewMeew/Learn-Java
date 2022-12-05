package Bai_2;

public class Animal {
  protected String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void eat (Food food, int m) {
    food.setMass(food.getMass() - m);
  }

  protected Animal haveBaby (String name) {
    Animal baby = new Animal();
    baby.setName(name);
    return baby;
  }
}
