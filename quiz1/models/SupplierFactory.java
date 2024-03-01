package quiz1.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SupplierFactory {
    private static final List<Product> products = new ArrayList<>();

    public static Supplier createSupplier(String supplierNumber, String supplierName, String contactPhoneNumber, String street, String city, String state, String zipcode, Long productId, String productName, LocalDate dateSupplied, Integer quantityInStock, Double unitPrice) {
        Supplier supplier = new Supplier(supplierNumber, supplierName, contactPhoneNumber, street, city, state, zipcode);

        addProduct(productId, productName, dateSupplied, quantityInStock, unitPrice, supplier);

        return supplier;
    }

    public static void addProduct(Long productId, String productName, LocalDate dateSupplied, Integer quantityInStock, Double unitPrice, Supplier supplier) {
        if (productId == null || productName == null || dateSupplied == null || quantityInStock == null || unitPrice == null || supplier == null)
            throw new IllegalArgumentException("Missing argument/s!");

        products.add(new Product(productId, productName, dateSupplied, quantityInStock, unitPrice, supplier));
    }

    public static List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }
}
