package Builder;

import java.util.ArrayList;
import java.util.List;

public class WoodenHouse {

  private final List<Object> walls;
  private final List<Object> doors;
  private final List<Object> windows;


  public WoodenHouse() {
    walls = new ArrayList<>();
    doors = new ArrayList<>();
    windows = new ArrayList<>();
  }

  public WoodenHouse addWall() {
    walls.add(1);
    System.out.println("+ одна стена");
    return this;
  }

  public WoodenHouse addDoor() {
    doors.add(1);
    System.out.println("+ одна дверь");
    return this;
  }

  public WoodenHouse addWindow() {
    windows.add(1);
    System.out.println("+ одно окно");
    return this;
  }

}
