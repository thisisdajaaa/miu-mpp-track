package final_practice.demo.prob2;

import java.util.List;

public class PhoneNumWithLendingItems {
    private String phoneNum;
    private List<LendingItem> items;

    public PhoneNumWithLendingItems(String phoneNum, List<LendingItem> items) {
        this.phoneNum = phoneNum;
        this.items = items;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public List<LendingItem> getItems() {
        return items;
    }

    public void setItems(List<LendingItem> items) {
        this.items = items;
    }
}
