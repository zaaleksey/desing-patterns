package AbstractFactory.Factory;

import AbstractFactory.Product.Ale.Ale;
import AbstractFactory.Product.Ale.GermanAle;
import AbstractFactory.Product.Beer.Beer;
import AbstractFactory.Product.Beer.GermanBeer;
import AbstractFactory.Product.Cider.Cider;
import AbstractFactory.Product.Cider.GermanCider;

public class GermanDrinkFactory implements DrinkFactory {

  public GermanDrinkFactory() {
    System.out.println("Start working german drink factory\n");
  }

  @Override
  public Ale ProduceAle() {
    return new GermanAle();
  }

  @Override
  public Beer ProduceBeer() {
    return new GermanBeer();
  }

  @Override
  public Cider ProduceCider() {
    return new GermanCider();
  }

}

