package midterm_exam.prob2.models;

import midterm_exam.prob2.constants.ItemType;

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
