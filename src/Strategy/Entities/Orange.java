package Strategy.Entities;

public class Orange implements General {

  private boolean ripe;
  private String grade;
  private double weight;

  public Orange(String grade, boolean ripe, double weight) {
    this.grade = grade;
    this.ripe = ripe;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return this.grade;
  }

  @Override
  public double criterion() {
    return this.weight;
  }
}
