package SieveOfEratosthenes;

import java.util.Arrays;

public class Sieve {
    static int range;
    static boolean[] numbers;

    Sieve() {
        range = Integer.MAX_VALUE/100;
        numbers = new boolean[range];
        Arrays.fill(numbers, true);
        numbers[0] = false;
        numbers[1] = false;

        for (int i = 0; i * i <= range; i++) {
            if (numbers[i]) {
                for (int j = i * i; j < range; j += i) {
                    numbers[j] = false;
                }
            }
        }
    }

    int findFirstPrimeNrBelowRange(int range) {
        while (true) {
            if (numbers[range--])
                return ++range;
        }
    }

    boolean isPrime(int number){
        for (int i = 2; i*i <= number; i++) {
            if(number%i==0) return false;
        }
        return true;
    }


}
