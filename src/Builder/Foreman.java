package Builder;

public class Foreman {

  private HouseBuilder builder;

  public Foreman(HouseBuilder builder) {
    this.builder = builder;
  }

  public void changeBuilder(HouseBuilder builder) {
    this.builder = builder;
  }

  public void makeHouse() {
    builder.reset();
    builder.buildWalls();
    builder.buildDoors();
    builder.buildWindows();
  }

}