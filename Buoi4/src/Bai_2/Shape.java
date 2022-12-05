package Bai_2;

public class Shape {
  private String colour;

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public Shape(String colour) {
    this.colour = colour;
  }

  @Override
  public String toString() {
    return "Shape{" +
            "colour='" + colour + '\'' +
            '}';
  }
}
