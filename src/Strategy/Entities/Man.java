package Strategy.Entities;

public class Man implements General {

  private final String name;
  private final int age;

  public Man(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return this.name + " - " + this.age;
  }

  @Override
  public double criterion() {
    return age;
  }
}
