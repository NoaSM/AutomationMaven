package CurrencyConverterProject;

public abstract  class CoinAbstract implements ICalculate {
    public abstract double getValue();

    @Override
    public double calculate(double value){ return value;}

}
