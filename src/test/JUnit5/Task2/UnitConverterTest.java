package test.JUnit5.Task2;
import JUnit5.Task2.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class UnitConverterTest {


    @Test
    void shouldConvertKiloToPound(){
        Weight weight1 = new Weight(WeightUnit.KILOGRAM, BigDecimal.TEN);
        weight1 = weight1.convert(WeightUnit.POUND);
        assertEquals(WeightUnit.POUND, weight1.getUnit());
        assertEquals(new BigDecimal("22.0459"), weight1.getValue());
    }

    @Test
    void shouldConvertPoundToKilo(){
        Weight weight1 = new Weight(WeightUnit.POUND, BigDecimal.TEN);
        weight1 = weight1.convert(WeightUnit.KILOGRAM);
        assertEquals(WeightUnit.KILOGRAM, weight1.getUnit());
        assertEquals(new BigDecimal("4.5360"), weight1.getValue());
    }

    @Test
    void shouldntConvertTheSameUnits(){
        Weight weight1 = new Weight(WeightUnit.POUND, BigDecimal.TEN);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()->weight1.convert(WeightUnit.POUND));
        assertEquals("Cannot convert within the same units", exception.getMessage());
    }

    @Test
    void shouldConvertZeroKilogramValue() {
        Pound pounds = new Kilogram(BigDecimal.ZERO).toPounds();
        assertEquals(BigDecimal.ZERO.setScale(4), pounds.value);
    }

    @Test
    void shouldConvertZeroPoundValue() {
        Kilogram kilograms = new Pound(BigDecimal.ZERO).toKilograms();
        assertEquals(BigDecimal.ZERO.setScale(4), kilograms.value);
    }

    @Test
    void shouldConvert1Pound() {
        assertEquals(new BigDecimal("0.4536"), new Pound(BigDecimal.ONE).toKilograms().value);
    }

    @Test
    void shouldConvert1Kilogram() {
        assertEquals(new BigDecimal("2.2046"), new Kilogram(BigDecimal.ONE).toPounds().value);
    }

    @Test
    @DisplayName("0.1 pounds to kilograms ♥ ♦ ♣ ♠")
    void shouldConvertFractions() {
        assertEquals(new BigDecimal("0.0454"), new Pound(new BigDecimal("0.1")).toKilograms().value);
    }

    @Test
    void shouldntAcceptNegativeWeightInPounds() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Pound(new BigDecimal(-1))
        );
        assertEquals("Weight can't be negative!", exception.getMessage());
    }

    @Test
    void shouldTransalteUnitsBlazinglyFast() {
        assertTimeout(Duration.ofMillis(10), () -> new Kilogram(BigDecimal.TEN).toPounds());
    }

    @Test
    void shouldntAcceptNullValue() {
        assertAll(
                () -> assertThrows(NullPointerException.class, () -> new Kilogram(null)),
                () -> assertThrows(NullPointerException.class, () -> new Pound(null))
        );
    }

    @RepeatedTest(3)
    void shouldAlwaysReturnTheSameValue() {
        assertEquals(new BigDecimal("29.4840").setScale(4), new Pound(new BigDecimal(65)).toKilograms().value);
    }



}
