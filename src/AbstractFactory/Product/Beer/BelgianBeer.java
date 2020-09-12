package AbstractFactory.Product.Beer;

public class BelgianBeer implements Beer {

  @Override
  public void drink() {
    System.out.println("Drinking belgian beeer...");
  }

}
