package midterm_exam;

import midterm_exam.constants.ItemType;
import midterm_exam.models.Book;
import midterm_exam.models.CD;
import midterm_exam.models.ModelFactory;

public class Main {
    public static void main(String[] args) {
        CD cd1 = (CD) ModelFactory.createLendingItem(ItemType.CD, 12);
        cd1.setTitle("Title CD 1");
        cd1.setProductId("Product ID CD 1");
        cd1.setCompany("Company CD 1");

        CD cd2 = (CD) ModelFactory.createLendingItem(ItemType.CD, 13);
        cd2.setTitle("Title CD 2");
        cd2.setProductId("Product ID CD 2");
        cd2.setCompany("Company CD 2");

        Book book1 = (Book) ModelFactory.createLendingItem(ItemType.BOOK, 1);
        book1.setTitle("Book 1");
        book1.setAuthorFirstName("AUTHOR 1");
        book1.setAuthorLastName("AUTHOR 1");
        book1.setIsbn("lmao");

        System.out.println(book1);
        System.out.println(cd1);
        System.out.println(cd2);
    }
}
