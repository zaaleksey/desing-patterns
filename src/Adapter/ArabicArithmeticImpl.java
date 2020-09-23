package Adapter;

public class ArabicArithmeticImpl implements ArabicArithmetic {

    @Override
    public double sum(double x, double y) {
        return x + y;
    }

    @Override
    public double difference(double x, double y) {
        return x - y;
    }

    @Override
    public double division(double x, double y) {
        return x / y;
    }

    @Override
    public double multiplication(double x, double y) {
        return x * y;
    }

}