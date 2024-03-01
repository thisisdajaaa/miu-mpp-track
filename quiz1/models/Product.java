package quiz1.models;

import java.time.LocalDate;

public class Product {
    private Long productId;
    private String productName;
    private LocalDate dateSupplied;
    private Integer quantityInStock;
    private Double unitPrice;
    private Supplier supplier;

    Product(Long productId, String productName, LocalDate dateSupplied, Integer quantityInStock, Double unitPrice, Supplier supplier) {
        this.productId = productId;
        this.productName = productName;
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
        this.supplier = supplier;
    }

    Product(){}

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public LocalDate getDateSupplied() {
        return dateSupplied;
    }

    public void setDateSupplied(LocalDate dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", dateSupplied=" + dateSupplied +
                ", quantityInStock=" + quantityInStock +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
