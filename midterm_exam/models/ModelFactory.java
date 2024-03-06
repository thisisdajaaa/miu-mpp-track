package midterm_exam.models;

import midterm_exam.constants.ItemType;

public class ModelFactory {
    public static LendingItem createLendingItem(ItemType type,Integer numCopiesInLib) {
        return switch (type) {
            case CD -> new CD(numCopiesInLib);
            case BOOK -> new Book(numCopiesInLib);
        };
    }
}
