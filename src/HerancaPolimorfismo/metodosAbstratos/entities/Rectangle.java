package HerancaPolimorfismo.metodosAbstratos.entities;

import HerancaPolimorfismo.metodosAbstratos.entities.enums.Color;

public class Rectangle extends Shape {
  private Double width;
  private Double height;

  public Rectangle() {
    super();
  }

  public Rectangle(Double width, Double height, Color color) {
    super(color);
    this.width = width;
    this.height = height;
  }

  @Override
  public double area() {
    return this.height * this.width;
  }
}
