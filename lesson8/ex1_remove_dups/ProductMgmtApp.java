package lesson8.ex1_remove_dups;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lesson8.ex1_remove_dups.model.Product;

public class ProductMgmtApp {
    public static void main(String[] args) {
        System.out.println("Hello. Welcome to my Products Management App");

        var products = List.of(
            new Product("Banana", 2.75, 124),
            new Product("Apple", 1.60, 854),
            new Product("Banana", 2.75, 124)
        );
        var productsNoDups = removeDuplicates(products);
        // System.out.println(productsNoDups);

        Integer[] arrOfInt = {1, 3, 5, 7};
        Stream<Integer> strOfInt = Stream.of(arrOfInt);

        int[] arrsOfInt = new int[] {1, 3, 5, 7};
        Stream<int[]> strzzOfInt = Stream.of(arrsOfInt);

        strzzOfInt.forEach(System.out::println);
    }

    /**
     * Removes duplicate products from the given list.
     * Products are considered duplicates if they have
     * the same productName, price and quantityInStock
     * @param products
     * @return list of only distinct products
     */
    private static List<Product> removeDuplicates(List<Product> products) {
        return products.stream().distinct().toList();
    }
}
