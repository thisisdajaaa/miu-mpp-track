package lesson1.oop_demo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Student("Student1", LocalDate.of(1997, 12, 30), 1),
                new Student("Student2", LocalDate.of(1997, 12, 30), 1),
                new Staff("Staff", LocalDate.of(1997, 12, 30), 1, 1234)
        };

        for (Person person: people) {
            System.out.println(person.getInfo());
        }

        String user = "Dann";
        String fullname = user + " Anthony" + " J." + " Astillero";
        char option = 'b';
        String choice  = STR."\{user} has chosen option \{option} and my full name is: \{fullname} and my salary is: \{String.format("$%,.2f", 1234.0)}";
        System.out.println(choice);
        System.out.printf("Today's weather is %s, with a temperature of %s degrees %s%n",
                1, 2, 3);

        String gg = "1";
        String zz = new String("1");
        String yy = zz.intern();

        System.out.println(gg == yy);
    }
}
