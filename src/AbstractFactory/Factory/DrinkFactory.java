package AbstractFactory.Factory;

import AbstractFactory.Product.Ale.Ale;
import AbstractFactory.Product.Beer.Beer;
import AbstractFactory.Product.Cider.Cider;

public interface DrinkFactory {

  Ale ProduceAle();
  Beer ProduceBeer();
  Cider ProduceCider();

}
