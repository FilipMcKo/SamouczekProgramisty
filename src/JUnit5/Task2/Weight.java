package JUnit5.Task2;

import java.math.BigDecimal;

public class Weight {
    private WeightUnit unit;
    private BigDecimal value;
    private Kilogram kilogram;
    private Pound pound;

    public WeightUnit getUnit() {
        return unit;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Weight(WeightUnit unit, BigDecimal value) {
        this.unit = unit;
        this.value = value;
        switch (unit){
            case KILOGRAM:
                kilogram = new Kilogram(value);
                break;
            case POUND:
                pound = new Pound(value);
                break;
        }
    }

    public Weight convert(WeightUnit convertTo){
        if(this.unit == convertTo) throw new IllegalArgumentException("Cannot convert within the same units");
        switch (convertTo){
            case POUND:
                value = kilogram.toPounds().value;
                pound = new Pound(value);
                kilogram = null;
                unit = WeightUnit.POUND;
                break;
            case KILOGRAM:
                value = pound.toKilograms().value;
                kilogram = new Kilogram(value);
                pound = null;
                unit = WeightUnit.KILOGRAM;
                break;

        }
        return this;
    }

}
