package CurrencyConverterProject;

public class ClassUSD extends CoinAbstract{
    private final double value = 3.52;


    @Override
    public double getValue() {
        return value;
    }

    @Override
    public double calculate(double value) {
        return value * getValue();
    }
}
