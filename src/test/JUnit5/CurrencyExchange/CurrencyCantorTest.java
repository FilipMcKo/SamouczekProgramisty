package test.JUnit5.CurrencyExchange;

import JUnit5.CurrencyExchange.CurrencyCantor;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyCantorTest {
    CurrencyCantor cantor = new CurrencyCantor(BigDecimal.valueOf(4.2936),
                                                 BigDecimal.valueOf(1.1434),
                                                    BigDecimal.valueOf(3.7552));

    @Test
    void shouldChangeDefaulSpreads(){
        cantor.changeDefaultSpreads(0.172,0.101,0.144);
        assertEquals(BigDecimal.valueOf(0.172), cantor.getEurPlnSpreadInBaseCurrency());
        assertEquals(BigDecimal.valueOf(0.101), cantor.getEurUsdSpreadInBaseCurrency());
        assertEquals(BigDecimal.valueOf(0.144), cantor.getUsdPlnSpreadInBaseCurrency());
    }

    @Test
    void shouldExchangePlnToEur(){
        assertEquals(BigDecimal.valueOf(2.0961), cantor.plnToEur(9.0));
    }

    @Test
    void shouldExchangeEurToPln(){
        assertEquals(BigDecimal.valueOf(13.4178), cantor.eurToPln(3.16));
    }

    @Test
    void shouldExchangePlnToUsd(){
        assertEquals(BigDecimal.valueOf(3.9945), cantor.plnToUsd(15));
    }

    @Test
    void shouldExchangeUsdToPln(){
        assertEquals(BigDecimal.valueOf(7.2853), cantor.usdToPln(1.98));
    }

}