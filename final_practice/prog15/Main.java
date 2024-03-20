package final_practice.prog15;

import final_practice.helperclasses.Book;
import final_practice.helperclasses.LibraryMember;
import final_practice.helperclasses.TestData;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Main p = new Main();
        List<LibraryMember> participants = TestData.INSTANCE.getMembers();
        p.specialBooks = TestData.INSTANCE.getAllBooks().iterator();
        LibraryMember mem = p.detectIfWinnerDuringCheckout(participants);
        System.out.println("Winner: " + (mem == null ? "none" : mem.getFirstName()));

    }

    Iterator<Book> specialBooks;

    public LibraryMember detectIfWinnerDuringCheckout(List<LibraryMember> mems) {
        //fix this
        return mems.stream().filter(mem ->
                        unchecked((LibraryMember x) -> x.checkout(specialBooks.next().getNextAvailableCopy(), LocalDate.now(), LocalDate.of(2015, 9, 1))
                                .getCheckoutRecordEntries().size() == 10).test(mem))
                .findFirst().orElse(null);
//
    }

    static <T> Predicate<T> unchecked(PredWithException<T> tPredWithException) {
        return value -> {
            try {
                return tPredWithException.test(value);
            } catch (Exception e) {
                throw new RuntimeException();
            }
        };
    }
}