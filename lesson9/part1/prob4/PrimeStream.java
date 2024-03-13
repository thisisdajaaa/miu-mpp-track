package lesson9.part1.prob4;

import java.math.BigInteger;
import java.util.stream.Stream;

public class PrimeStream {
    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream();
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }

    public void printFirstNPrimes(int n) {
        final Stream<BigInteger> primes = Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime);

        primes.limit(n).forEach(System.out::println);
    }
}
