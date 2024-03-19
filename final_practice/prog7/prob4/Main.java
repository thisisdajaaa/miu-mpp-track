package final_practice.prog7.prob4;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Main ps = new Main(); //PrimeStream is enclosing class
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);

    }

    public void printFirstNPrimes(long n) {
        Stream<Integer> integerStream = Stream.iterate(2, Main::getNextPrime);

        integerStream.limit(n).toList().forEach(System.out::println);
    }

    public static boolean isPrime(int x) {
        if (x < 2) return false;

        for (int i = 2; i < x / 2; i++) {
            if (x % i == 0) return false;
        }

        return true;
    }

    public static int getNextPrime(int x) {
        int nextInt = x + 1;

        while (!isPrime(nextInt)) nextInt++;

        return nextInt;
    }
}
