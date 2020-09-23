package Adapter;

public class AdapterRomanToArabic {

  private ArabicArithmetic arabicArithmetic;

  public AdapterRomanToArabic(ArabicArithmetic arabicArithmetic) {
    this.arabicArithmetic = arabicArithmetic;
  }

  public double sum(String x, String y) {
    return arabicArithmetic.sum(RomanNumeral.romanToArabic(x), RomanNumeral.romanToArabic(y));
  }

  public double difference(String x, String y) {
    return arabicArithmetic.difference(RomanNumeral.romanToArabic(x), RomanNumeral.romanToArabic(y));
  }

  public double division(String x, String y) {
    return arabicArithmetic.division(RomanNumeral.romanToArabic(x), RomanNumeral.romanToArabic(y));
  }

  public double multiplication(String x, String y) {
    return arabicArithmetic.multiplication(RomanNumeral.romanToArabic(x), RomanNumeral.romanToArabic(y));
  }

}
