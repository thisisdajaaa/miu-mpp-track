package lesson8.prog5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachExample {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        list.forEach(stringConsumer);

        //print each element of the list in upper case format
        System.out.println(transformToUpper(list));

    }

    //implement a Consumer
    public static Consumer<String> stringConsumer = System.out::println;

    public static List<String> transformToUpper(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .toList();
    }

}