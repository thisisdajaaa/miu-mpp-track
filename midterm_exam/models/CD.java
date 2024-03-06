package midterm_exam.models;

import midterm_exam.constants.ItemType;

public class CD extends LendingItem {
    private String productId;
    private String title;
    private String company;

    CD(Integer numCopiesInLib) {
        super(numCopiesInLib, ItemType.CD);
    }

    CD(Integer numCopiesInLib, String productId, String title, String company) {
        super(numCopiesInLib, ItemType.CD);
        this.productId = productId;
        this.title = title;
        this.company = company;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "CD{" +
                "productId='" + productId + '\'' +
                ", title='" + title + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
