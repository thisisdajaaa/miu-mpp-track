package lesson9.lecture.models;

import lesson9.lecture.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersonInfo implements Comparable<PersonInfo> {
    private String name;
    private int age;
    private List<Person> persons = new ArrayList<>();

    public PersonInfo(String name, int age, List<Person> persons) {
        this.name = name;
        this.age = age;
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "PersonInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", persons=" + persons +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonInfo that = (PersonInfo) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(persons, that.persons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, persons);
    }

    @Override
    public int compareTo(PersonInfo o) {
        if (this.equals(o)) return 0;
        if (this.name.compareTo(o.name) > 0 || this.name.compareTo(o.name) == 0 && this.age > o.age) return 1;
        return -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
