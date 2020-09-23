package Adapter;

import java.util.Random;

// server
public class RomanNumeralGenerator {

  // псевдогенерация
  public static String getRomanNumber() {
    String[] romanNumeral = "I IV V IX X XL L XC C CD D CM M".split(" ");
    Random r = new Random();
    return romanNumeral[r.nextInt(romanNumeral.length)];
  }

}
