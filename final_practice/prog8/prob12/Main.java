package final_practice.prog8.prob12;

public class Main {
    static class Product {
        private String name;

        public Product(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        MySingletonLazy mySingletonLazy1 = MySingletonLazy.getInstance();
        MySingletonLazy mySingletonLazy2 = MySingletonLazy.getInstance();

//        System.out.println(mySingletonLazy1);
//        System.out.println(mySingletonLazy2);

        Product product1 = new Product("asd");
        Product product2 = product1;
        System.out.println(product1 == product2);
        System.out.println(product1.equals(product2));
    }
}
