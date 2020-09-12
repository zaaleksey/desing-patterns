package Singleton;

public class Clock {

  private static Clock instance = null;
  private double time;

  private Clock() {
    this.time = 0;
  }

  public static Clock getInstance() {
    if (instance == null) {
      instance = new Clock();
    }
    return instance;
  }

  public void showTime() {
    System.out.println("Now  " + getTime());
  }

  public double getTime() {
    return time;
  }

  public void setTime(double time) {
    this.time = time;
  }
}
