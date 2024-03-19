package final_practice.prog3;

import java.util.List;
import java.util.Objects;

public class Main {
    public static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null) return false;
            if (this.getClass() != o.getClass()) return false;
            Person p = (Person) o;
            return this.name.equals(p.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("a");
        Person p2 = new Person("a");
        System.out.println(p1.equals(p2));
        Person p3 = p2;
        System.out.println(p3 == p2);

        var list = List.of(p1, p2);
        var arr = new Person[]{
                p1, p2
        };

        System.out.println(list.get(0) == (arr[0]));
    }
}
