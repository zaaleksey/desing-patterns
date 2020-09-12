package Factory;

import Product.Ale.Ale;
import Product.Ale.GermanAle;
import Product.Beer.Beer;
import Product.Beer.GermanBeer;
import Product.Cider.Cider;
import Product.Cider.GermanCider;

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

