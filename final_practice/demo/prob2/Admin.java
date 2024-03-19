package final_practice.demo.prob2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Admin {
    //Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
    public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
        return Arrays
                .stream(members)
                .map(phoneNumWithCheckoutEntriesFunction)
                .map(entriesPhoneNumWithLendingItemsFunction)
                .filter(x -> x.getItems().contains(item))
                .map(PhoneNumWithLendingItems::getPhoneNum)
                .sorted()
                .toList();
    }

    public static Function<PhoneNumWithCheckoutEntries, PhoneNumWithLendingItems> entriesPhoneNumWithLendingItemsFunction = (record) -> {
        List<LendingItem> items = new ArrayList<>();

        for (CheckoutRecordEntry checkoutRecordEntry : record.getList()) {
            items.add(checkoutRecordEntry.getLendingItem());
        }

        return new PhoneNumWithLendingItems(record.getPhoneNum(), items);
    };

    public static Function<LibraryMember, PhoneNumWithCheckoutEntries> phoneNumWithCheckoutEntriesFunction = (member) ->
            new PhoneNumWithCheckoutEntries(member.getPhone(), member.getCheckoutRecord().getCheckoutEntryList());
}
