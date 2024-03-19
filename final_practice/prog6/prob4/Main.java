package final_practice.prog6.prob4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(countWords(Arrays.asList("Das", "Wat"), 'd', 'c', 3));
    }

    public static int countWords(List<String> words, char c, char d, int len) {
        return (int) words.stream()
                .filter(x -> x.toLowerCase().contains(Character.toString(c).toLowerCase()))
                .filter(x -> !x.toLowerCase().contains(Character.toString(d).toLowerCase()))
                .filter(x -> x.length() == len)
                .count();
    }
}
