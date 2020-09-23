package Adapter;

// client
public class Main {

    public static void main(String[] args) {
        AdapterRomanToArabic adapter = new AdapterRomanToArabic(new ArabicArithmeticImpl());

        String x = RomanNumeralGenerator.getRomanNumber();
        System.out.println("x = " + x);

        String y = RomanNumeralGenerator.getRomanNumber();
        System.out.println("y = " + y);

        System.out.println();

        System.out.println("x + y = " + adapter.sum(x, y));
        System.out.println("x - y = " + adapter.difference(x, y));
        System.out.println("x / y = " + adapter.division(x, y));
        System.out.println("x * y = " + adapter.multiplication(x, y));
    }

}
