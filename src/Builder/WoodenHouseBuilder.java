package Builder;

public class WoodenHouseBuilder implements HouseBuilder {

  private WoodenHouse woodenHouse;

  @Override
  public void reset() {
    woodenHouse = new WoodenHouse();
  }

  @Override
  public void buildWalls() {
    System.out.println("Постройка стен из дерева: ");
    woodenHouse.addWall()
        .addWall()
        .addWall()
        .addWall();
  }

  @Override
  public void buildDoors() {
    System.out.println("Постройка деревянных дверей: ");
    woodenHouse.addDoor()
        .addDoor();
  }

  @Override
  public void buildWindows() {
    System.out.println("Постройка окон с деревянными рамами: ");
    woodenHouse.addWindow()
        .addWindow()
        .addWindow();
  }

  public WoodenHouse getHouse() {
    return woodenHouse;
  }

}
