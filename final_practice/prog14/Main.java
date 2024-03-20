package final_practice.prog14;


import final_practice.helperclasses.CheckoutRecordEntry;
import final_practice.helperclasses.TestData;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;


/*
 * Print to the console the list of book titles – in sorted order --
 * for which the book was checked out on June 27, 2015.
 * The ordering of the book titles is as follows: First sort by the length
 * of the title (number of characters), then by alphabetical order.
 */
public class Main {

    public static void main(String[] args) {
        //use this list

        List<CheckoutRecordEntry> list = TestData.INSTANCE.getAllEntries();

        List<String> output = list.stream()
                .filter(x -> x.getCheckoutDate().equals(LocalDate.of(2015, 6, 27)))
                .sorted(Comparator.comparing((CheckoutRecordEntry x) -> x.getCopy().getBook().getTitle().length()).thenComparing((CheckoutRecordEntry x) -> x.getCopy().getBook().getTitle()))
                .map(x -> x.getCopy().getBook().getTitle())
                .toList();


        System.out.print(output);
    }


}