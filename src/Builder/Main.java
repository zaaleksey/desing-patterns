package Builder;

public class Main {

  public static void main(String[] args) {

    HouseBuilder builder = new WoodenHouseBuilder();
    Foreman foreman = new Foreman(builder);

    foreman.makeHouse();
  }

}
