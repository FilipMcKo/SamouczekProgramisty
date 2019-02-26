import java.math.BigInteger;

public class ZadanieKrzysia {

    public static void main(String[] args) {

        boolean a;
        boolean b;
        for (int i = 0; i < 33; i++) {
            a = i % 3 == 0;
            b = i % 5 == 0;

            if (a && b) {
                System.out.println(i + ": Podzielne przez 15");
            } else if (a) {
                System.out.println(i + ": Podzielne przez 3");
            } else if (b) {
                System.out.println(i + ": Podzielne przez 5");
            } else {
                System.out.println(i + ": Niepodzielne przez 3, 5 ani 15");
            }
        }
    }
}
