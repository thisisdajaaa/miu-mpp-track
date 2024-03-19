package final_practice.demo.prob2;

import java.util.List;

public class PhoneNumWithCheckoutEntries {
    private String phoneNum;
    private List<CheckoutRecordEntry> list;

    public PhoneNumWithCheckoutEntries(String phoneNum, List<CheckoutRecordEntry> list) {
        this.phoneNum = phoneNum;
        this.list = list;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public List<CheckoutRecordEntry> getList() {
        return list;
    }

    public void setList(List<CheckoutRecordEntry> list) {
        this.list = list;
    }
}
