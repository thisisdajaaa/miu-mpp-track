package lesson9.part2.prob12;

public class Main {
    public static void main(String[] args) {
        MySingletonLazy mySingletonLazy1 = MySingletonLazy.getInstance();
        MySingletonLazy mySingletonLazy2 = MySingletonLazy.getInstance();
        System.out.println(mySingletonLazy1);
        System.out.println(mySingletonLazy2);
    }
}
