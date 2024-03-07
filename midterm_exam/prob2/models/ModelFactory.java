package midterm_exam.prob2.models;

import midterm_exam.prob2.constants.ItemType;

public class ModelFactory {
    public static LendingItem createLendingItem(ItemType type,Integer numCopiesInLib) {
        return switch (type) {
            case CD -> new CD(numCopiesInLib);
            case BOOK -> new Book(numCopiesInLib);
        };
    }
}
