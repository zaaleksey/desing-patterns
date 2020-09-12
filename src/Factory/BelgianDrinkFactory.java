package Factory;

import Product.Ale.Ale;
import Product.Ale.BelgianAle;
import Product.Beer.Beer;
import Product.Beer.BelgianBeer;
import Product.Cider.BelgianCider;
import Product.Cider.Cider;

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
