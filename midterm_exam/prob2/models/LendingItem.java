package midterm_exam.models;

import midterm_exam.constants.ItemType;

public abstract class LendingItem {
    private Integer numCopiesInLib;
    private ItemType type;

    public LendingItem(Integer numCopiesInLib, ItemType type) {
        this.numCopiesInLib = numCopiesInLib;
        this.type = type;
    }

    public Integer getNumCopiesInLib() {
        return numCopiesInLib;
    }

    public void setNumCopiesInLib(Integer numCopiesInLib) {
        this.numCopiesInLib = numCopiesInLib;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }
}
