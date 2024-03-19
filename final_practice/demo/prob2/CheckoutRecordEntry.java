package final_practice.demo.prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
    private LocalDate checkoutDate;
    private LocalDate dueDate;
    private ItemType itemType;
    private LendingItem lendingItem;

    public CheckoutRecordEntry(LendingItem lendingItem, LocalDate checkoutDate, LocalDate dueDate, ItemType itemType) {
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        this.itemType = itemType;
        this.lendingItem = lendingItem;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public LendingItem getLendingItem() {
        return lendingItem;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public void setLendingItem(LendingItem lendingItem) {
        this.lendingItem = lendingItem;
    }
}
