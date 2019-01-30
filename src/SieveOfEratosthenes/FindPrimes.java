package SieveOfEratosthenes;

public class FindPrimes {
    static Sieve sieve = new Sieve();


    public static void main(String[] args) {



        int prime = (sieve.findFirstPrimeNrBelowRange(14000000));
        System.out.println(prime);


    }
}
