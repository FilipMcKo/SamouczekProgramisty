import java.math.BigDecimal;

/**
 * @author fmucko
 */
public class PassingValuesAndObjects {

    public static void changeValue(Integer number){
        number++;
    }

    public static void changeBigDecimal(BigDecimal nr){
        nr.add(BigDecimal.TEN);
    }


    public static void main(String[] args) {
        Integer nr = 0;
        changeValue(nr);
        System.out.println(nr);

        BigDecimal nr2 = BigDecimal.ONE;
        changeBigDecimal(nr2);
        System.out.println(nr2);



    }

}
