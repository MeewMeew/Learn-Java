package Bai_6;

public class Main {
  public static void main(String[] args) {
    Shape s = new Shape();
    Rectangle r = new Rectangle();
    Circle c = new Circle();

    r.setHeight(5);
    r.setWidth(15);

    c.setRadius(5);

    r.draw();
    c.draw();

    Flyable[] flyables = new Flyable[2];

    flyables[0] = new Bird();
    flyables[1] = new Plane();

    for (Flyable flyable : flyables) {
      flyable.fly();
    }
  }
}
