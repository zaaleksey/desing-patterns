package Singleton;

public class Main {

  public static void main(String[] args) {
    System.out.println("Singleton...");
    Clock clock1 = Clock.getInstance();
    clock1.showTime();
    clock1.setTime(1000000);
    clock1.showTime();

    Clock clock2 = Clock.getInstance();
    clock2.showTime();
  }

}
