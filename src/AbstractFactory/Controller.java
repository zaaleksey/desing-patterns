package AbstractFactory;

import AbstractFactory.Factory.DrinkFactory;
import AbstractFactory.Product.Ale.Ale;
import AbstractFactory.Product.Beer.Beer;
import AbstractFactory.Product.Cider.Cider;

public class Controller {

  DrinkFactory drinkFactory;

  public Controller(DrinkFactory drinkFactory) {
    this.drinkFactory = drinkFactory;
  }

  public void produceDrinks() {
    Ale ale = drinkFactory.ProduceAle();
    Beer beer = drinkFactory.ProduceBeer();
    Cider cider = drinkFactory.ProduceCider();

    ale.drink();
    beer.drink();
    cider.drink();
  }

}