package HerancaPolimorfismo.metodosAbstratos.entities;

import HerancaPolimorfismo.metodosAbstratos.entities.enums.Color;

public abstract class Shape {
  private Color color;

  public Shape() {}

  public Shape (Color color) {
    this.color = color;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  //A implementação fica a cargo das subclasses
  abstract public double area();
}
