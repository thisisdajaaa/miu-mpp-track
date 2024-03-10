package lesson8.ex1_remove_dups.model;

import java.util.Objects;

/**
 * Product
 */
public class Product {
    private String productName;
    private double price;
    private int quantityInStock;

    public Product(String productName, Double price, int quantityInStock) {
        this.productName = productName;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    @Override
    public String toString() {
        return String.format("{%s, %,.2f, %d}\n",
                productName, price, quantityInStock);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.getPrice()) == 0 && quantityInStock == product.getQuantityInStock() && productName.equals(product.getProductName());
    }

    @Override
    public int hashCode(){
        return Objects.hash(productName, price, quantityInStock);
    }
}