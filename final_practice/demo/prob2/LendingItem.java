package final_practice.demo.prob2;

import java.util.Objects;

public class LendingItem {
    private Integer numCopiesInLib;

    public LendingItem(Integer numCopiesInLib) {
        this.numCopiesInLib = numCopiesInLib;
    }

    public Integer getNumCopiesInLib() {
        return numCopiesInLib;
    }

    public void setNumCopiesInLib(Integer numCopiesInLib) {
        this.numCopiesInLib = numCopiesInLib;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        LendingItem item = (LendingItem) o;

        return this.numCopiesInLib.equals(item.numCopiesInLib);
    }


    @Override
    public int hashCode() {
        return Objects.hash(numCopiesInLib);
    }
}
