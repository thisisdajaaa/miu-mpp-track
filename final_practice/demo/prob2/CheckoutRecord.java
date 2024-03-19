package final_practice.demo.prob2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
    private List<CheckoutRecordEntry> list;

    public List<CheckoutRecordEntry> getCheckoutEntryList() {
        return list;
    }

    public void addCheckoutEntry(CheckoutRecordEntry entry) {
        if (list == null) list = new ArrayList<>();

        list.add(entry);
    }
}
