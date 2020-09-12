import Factory.DrinkFactory;
import Product.Ale.Ale;
import Product.Beer.Beer;
import Product.Cider.Cider;

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