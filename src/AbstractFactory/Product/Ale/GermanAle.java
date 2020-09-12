package AbstractFactory.Product.Ale;

public class GermanAle implements Ale {

  @Override
  public void drink() {
    System.out.println("Drinking german ale...");
  }

}
