package final_practice.demo.prob2;

import java.util.Objects;

public class CD extends LendingItem {
    private String productId;
    private String title;
    private String company;

    public CD(String productId, String title, String company) {
        super(0);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CD cd = (CD) o;
        return Objects.equals(productId, cd.productId) && Objects.equals(title, cd.title) && Objects.equals(company, cd.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), productId, title, company);
    }

    @Override
    public String toString() {
        return STR."CD{productId='\{productId}\{'\''}, title='\{title}\{'\''}, company='\{company}\{'\''}\{'}'}";
    }
}
