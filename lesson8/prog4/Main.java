package lesson8.prog4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static int countWords(List<String> words, char c, char d, int len) {
        return (int) words.stream()
                .filter(word -> word.contains(Character.toString(c)))
                .filter(word -> !word.contains(Character.toString(c)))
                .filter(word -> word.length() == len)
                .count();
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("foot", "bolt", "best", "tab", "function");
        System.out.println(countWords(list, 't', 'e', 4));
    }
}
