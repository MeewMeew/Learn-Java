package Bai_6;

public class Circle extends Shape {
  private int radius;

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  public void draw() {
    for (int i = -radius; i <= radius; i++) {
      for (int j = -radius; j <= radius; j++) {
        if (i * i + j * j <= radius * radius) System.out.print("* ");
        else System.out.print(". ");
      }
      System.out.println();
    }
  }
}
