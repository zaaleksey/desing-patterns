package AbstractFactory.Product.Cider;

public class BelgianCider implements Cider {

  @Override
  public void drink() {
    System.out.println("Drinking belgian cider...");
  }

}
