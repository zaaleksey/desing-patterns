package AbstractFactory.Factory;

import AbstractFactory.Product.Ale.Ale;
import AbstractFactory.Product.Ale.BelgianAle;
import AbstractFactory.Product.Beer.Beer;
import AbstractFactory.Product.Beer.BelgianBeer;
import AbstractFactory.Product.Cider.BelgianCider;
import AbstractFactory.Product.Cider.Cider;

public class BelgianDrinkFactory implements DrinkFactory {

  public BelgianDrinkFactory() {
    System.out.println("Start working belgian drink factory\n");
  }

  @Override
  public Ale ProduceAle() {
    return new BelgianAle();
  }

  @Override
  public Beer ProduceBeer() {
    return new BelgianBeer();
  }

  @Override
  public Cider ProduceCider() {
    return new BelgianCider();
  }

}
