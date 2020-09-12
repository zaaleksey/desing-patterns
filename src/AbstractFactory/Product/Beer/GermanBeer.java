package AbstractFactory.Product.Beer;

public class GermanBeer implements Beer {

  @Override
  public void drink() {
    System.out.println("Drinking german beer...");
  }

}
