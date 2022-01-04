package CurrencyConverterProject;

public class ClassILS extends CoinAbstract{
    private final double value = 0.28;

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public double calculate(double value) {
        return value * getValue();
    }
}
