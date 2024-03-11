package lesson9.lecture;

import lesson9.lecture.models.Person;
import lesson9.lecture.models.PersonInfo;
import lesson9.lecture.models.TransformedPerson;
import lesson9.lecture.models.TransformedPersonInfo;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(19, 7, 23, 99);
        Stream<Integer> streamNums = nums.stream();
        // streamNums.forEach(System.out::println);

        Stream<String> stringStream = Stream.of("Eye", "Like", "Java", "Stream", "API");
        // stringStream.forEach(System.out::println);

        Stream<Integer> first5EvenNumbers = Stream.iterate(0, n -> n + 2).limit(5);
        Stream<Integer> first5OddNumbers = Stream.iterate(1, n -> n + 2).skip(4).limit(4);

        // Stream.concat(first5EvenNumbers, first5OddNumbers).forEach(System.out::println);

        // first5EvenNumbers.forEach(System.out::println);
        // first5OddNumbers.forEach(System.out::println);

        // Stream.generate(() -> "Echo").limit(3).forEach(System.out::println);

        PersonInfo personInfo1 = new PersonInfo("das1", 21, List.of(new Person("firstWat", "lastWat")));
        PersonInfo personInfo2 = new PersonInfo("das2", 22, List.of(new Person("secondFirstName", "secondWatzLastName")));

        List<PersonInfo> personInfos = List.of(personInfo1, personInfo2);

        Function<PersonInfo, TransformedPersonInfo> personInfoTransformedPersonInfoFunction = info -> {
            Stream<Person> personStream = info.getPersons().stream();

            List<TransformedPerson> list = personStream.map(person -> new TransformedPerson(person.getFirstName())).toList();

            return new TransformedPersonInfo(info.getName(), list);
        };

        List <TransformedPersonInfo> personList = personInfos.stream().map(personInfoTransformedPersonInfoFunction).toList();

        personList.forEach(System.out::println);

        Stream.of(1,2,3).map(int[]::new).map(Arrays::toString).forEach(System.out::println);

        List<List<PersonInfo>> listOfLists = Arrays.asList(
                List.of(personInfo1, personInfo1),
                List.of(personInfo2, personInfo2)
        );

        // listOfLists.stream().flatMap(List::stream).map(item -> item.name).toList().forEach(System.out::println);
        listOfLists.stream()
                .flatMap(List::stream)
                .map(PersonInfo::getPersons)
                .flatMap(List::stream)
                .map(Person::getFirstName)
                .forEach(System.out::println);

        List<PersonInfo> personInfos1 = Arrays.asList
                (

                        new PersonInfo("das2", 13, new ArrayList<>()),
                        new PersonInfo("das1", 12, new ArrayList<>()),
                        new PersonInfo("das2", 14, new ArrayList<>())
                );

        personInfos1.stream().sorted().forEach(System.out::println);

        Optional<Integer> integer = findMax(List.of(1, 1, 1));

        integer.ifPresentOrElse(System.out::println, () -> {
            throw new RuntimeException();
        });

        personInfos1.stream().filter(item -> item.getName().equals("das2")).limit(1).forEach(System.out::println);
        System.out.println(personInfos1.stream().filter(item -> item.getName().equals("das2")).findFirst());
    }

    public static Optional<Integer> findMax(List<Integer> nums) {
        return nums.stream().max(Integer::compareTo);
    }
}
