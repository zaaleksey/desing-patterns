package AbstractFactory;

import AbstractFactory.Factory.BelgianDrinkFactory;
import AbstractFactory.Factory.GermanDrinkFactory;

public class Main {

  public static void main(String[] args) {

    Controller german = new Controller(new GermanDrinkFactory());
    german.produceDrinks();

    System.out.println("#".repeat(100));

    Controller belgian = new Controller(new BelgianDrinkFactory());
    belgian.produceDrinks();

  }

}
