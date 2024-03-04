package lesson5.prob1.rulesets;

import lesson5.prob1.gui.BookWindow;

import java.awt.Component;
import java.math.BigDecimal;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places
 * 6. Price must be a number greater than 0.49.
 */
public class BookRuleSet implements RuleSet {
    private BookWindow bookWindow;

    @Override
    public void applyRules(Component ob) throws RuleException {
       bookWindow = (BookWindow) ob;
       nonemptyRule();
       isbnLength10Rule();
       isbnLength10Rule();
       isbnLength13Rule();
       priceNumericRule();
       priceMinRule();
    }

    private void nonemptyRule() throws RuleException {
        if (bookWindow.getIsbnValue().trim().isEmpty() || bookWindow.getPriceValue().trim().isEmpty() || bookWindow.getTitleValue().trim().isEmpty()) {
            throw new RuleException("All fields must be non-empty!");
        }
    }

    private void isbnNumericRule() throws RuleException {
        String val = bookWindow.getIsbnValue().trim();

        try {
            Integer.parseInt(val);
        } catch (NumberFormatException e) {
            throw new RuleException("ISBN must be numeric");
        }
    }

    private void isbnLength10Rule() throws RuleException {
        String val = bookWindow.getIsbnValue().trim();

        if (val.length() == 13 && !val.startsWith("978") && !val.startsWith("979")) {
            throw new RuleException("ISBN with 130 length should start with either 978 or 979");
        }
    }

    private void isbnLength13Rule() throws RuleException {
        String val = bookWindow.getIsbnValue().trim();

        if (val.length() == 10 && !val.startsWith("0") && !val.startsWith("1")) {
            throw new RuleException("ISBN with 10 length should start with either 0 or 1");
        }
    }

    private void priceNumericRule() throws RuleException {
        String val = bookWindow.getPriceValue().trim();

        try {
            BigDecimal price = new BigDecimal(val);

            if (price.scale() != 2)
                throw new RuleException("Price must be a floating point number with two decimal places");
        } catch (NumberFormatException e) {
            throw new RuleException("Price must be numeric");
        }
    }

    private void priceMinRule() throws RuleException {
        String val = bookWindow.getPriceValue().trim();

        // checks if it is numeric first to avoid duplication of try catch
        priceNumericRule();

        BigDecimal price = new BigDecimal(val);
        BigDecimal numToCompare = new BigDecimal("0.49");

        if (price.compareTo(numToCompare) <= 0)
            throw new RuleException("Price must be greater than 0.49");
    }
}
