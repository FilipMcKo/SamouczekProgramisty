package JUnit5.CurrencyExchange;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class CurrencyCantor {
    private Currencies baseCurrency = Currencies.PLN;
    private BigDecimal eurToPlnRatio;
    private BigDecimal eurPlnSpreadInBaseCurrency = BigDecimal.valueOf(0.15);
    private BigDecimal eurToUsdRatio;
    private BigDecimal eurUsdSpreadInBaseCurrency = BigDecimal.valueOf(0.15);
    private BigDecimal usdToPlnRatio;
    private BigDecimal usdPlnSpreadInBaseCurrency = BigDecimal.valueOf(0.15);

    public CurrencyCantor(BigDecimal eurToPlnRatio,
                          BigDecimal eurToUsdRatio,
                          BigDecimal usdToPlnRatio) {
        this.eurToPlnRatio = eurToPlnRatio;
        this.eurToUsdRatio = eurToUsdRatio;
        this.usdToPlnRatio = usdToPlnRatio;
    }

    public BigDecimal getEurPlnSpreadInBaseCurrency() {
        return eurPlnSpreadInBaseCurrency;
    }

    public BigDecimal getEurUsdSpreadInBaseCurrency() {
        return eurUsdSpreadInBaseCurrency;
    }

    public BigDecimal getUsdPlnSpreadInBaseCurrency() {
        return usdPlnSpreadInBaseCurrency;
    }

    public void changeDefaultSpreads(double eurPlnSpreadInBaseCurrency, double eurUsdSpreadInBaseCurrency, double usdPlnSpreadInBaseCurrency) {
        this.eurPlnSpreadInBaseCurrency = BigDecimal.valueOf(eurPlnSpreadInBaseCurrency);
        this.eurUsdSpreadInBaseCurrency = BigDecimal.valueOf(eurUsdSpreadInBaseCurrency);
        this.usdPlnSpreadInBaseCurrency = BigDecimal.valueOf(usdPlnSpreadInBaseCurrency);
    }

    public BigDecimal plnToEur(double pln) {
        BigDecimal plnBD = BigDecimal.valueOf(pln);
        return plnBD.divide(eurToPlnRatio, 4, BigDecimal.ROUND_HALF_UP);
    }

    public BigDecimal eurToPln(double eur) {
        BigDecimal eurDB = BigDecimal.valueOf(eur);
        return eurDB.multiply(eurToPlnRatio).subtract(eurPlnSpreadInBaseCurrency).setScale(4, BigDecimal.ROUND_HALF_UP);
    }

    public BigDecimal plnToUsd(double pln) {
        BigDecimal plnBD = BigDecimal.valueOf(pln);
        return plnBD.divide(usdToPlnRatio, 4, BigDecimal.ROUND_HALF_UP);
    }


    public BigDecimal usdToPln(double usd) {
        BigDecimal usdBD = BigDecimal.valueOf(usd);
        return usdBD.multiply(usdToPlnRatio).subtract(usdPlnSpreadInBaseCurrency).setScale(4,RoundingMode.HALF_UP);
    }
}
