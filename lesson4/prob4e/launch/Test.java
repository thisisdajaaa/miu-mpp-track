package lesson4.prob4e.launch;

public class Test {
    interface Iface1 {
        int myMethod(int x);
    }

    interface Iface2 {
        int myMethod(int x);
    }

    public static class GG implements Iface2, Iface1 {
        public  int myMethod(int x) {
            return x + 1;
        }
    }

    public static void main(String[] args) {
        GG gg = new GG();
        System.out.println(gg.myMethod(1));
    }
}
