package lesson10.thread;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Runnable runnableOdds = Main::printOdds;
        Runnable runnableEvens = Main::printEvens;

        Thread threadOdds = new Thread(runnableOdds, "Odds");
        Thread threadEvens = new Thread(runnableEvens, "Evens");

        threadOdds.start();
        threadEvens.start();
        calcAvg(new int[]{1, 2, 3, 4});

        System.out.println("GG: " + Thread.activeCount());

    }

    private static void printOdds() {
        int odd = 1;

        while (odd < 100) {
            System.out.println("Odd: " + odd);
            odd += 2;
            pause();
        }
    }

    private static void printEvens() {
        int even = 0;

        while (even < 100) {
            System.out.println("Even: " + even);
            even += 2;
            pause();
        }
    }

    private static void pause() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int calcAvg(int[] array) {
        int sum = IntStream.of(array).sum();
        int avg = sum / array.length;

        System.out.printf("Calculating average of %d\n", avg);

        return avg;
    }
}
