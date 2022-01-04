package CurrencyConverterProject;

import java.io.IOException;

public class CoinFactory {
    public static CoinAbstract getCoinInstance (CoinEnum coin) {
        switch (coin){
            case ILS:
                return new ClassILS();

            case USD:
                return new ClassUSD();

        } return null;
    }
}
