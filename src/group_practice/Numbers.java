package group_practice;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

    public static void main(String[] args) {
        System.out.println(primesFinder(15));
    }

    public static ArrayList<Integer> primesFinder(int howManyPrimes) {

        int currentInt = 2;
        ArrayList<Integer> primes = new ArrayList<>();
        List<Integer> divisors = new ArrayList<>();


        while (primes.size() < howManyPrimes) {


            for ( int i = 0; i < divisors.size(); i++ ) {
                if (currentInt % divisors.get(i) == 0) {
                    break;
                } else if (currentInt % divisors.get(i) != 0 && i == divisors.size() - 1) {
                    primes.add(currentInt);
                }
            }
            divisors.add(currentInt);
            currentInt++;
        }
        return primes;
    }
}
