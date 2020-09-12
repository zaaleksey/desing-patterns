package Factory;

import Product.Ale.Ale;
import Product.Beer.Beer;
import Product.Cider.Cider;

public interface DrinkFactory {

  Ale ProduceAle();
  Beer ProduceBeer();
  Cider ProduceCider();

}
