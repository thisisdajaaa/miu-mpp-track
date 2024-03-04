package lesson5.prob1.rulesets;

import lesson5.prob1.gui.CDWindow;

import java.awt.Component;
import java.math.BigDecimal;


/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {
	private CDWindow cdWindow;

	@Override
	public void applyRules(Component ob) throws RuleException {
		cdWindow = (CDWindow) ob;
		nonemptyRule();
		priceNumericRule();
		priceMinRule();
	}

	private void nonemptyRule() throws RuleException {
		if (cdWindow.getTitleValue().trim().isEmpty() || cdWindow.getArtistValue().trim().isEmpty() || cdWindow.getPriceValue().trim().isEmpty()) {
			throw new RuleException("All fields must be non-empty");
		}
	}

	private void priceNumericRule() throws RuleException {
		String val = cdWindow.getPriceValue().trim();

		try {
			BigDecimal price = new BigDecimal(val);

			if (price.scale() != 2) throw new RuleException("Price must be a floating point number with two decimal places");
		} catch (NumberFormatException e) {
			throw new RuleException("Price must be numeric");
		}
	}

	private void priceMinRule() throws RuleException {
		String val = cdWindow.getPriceValue().trim();

		priceNumericRule();

		BigDecimal price = new BigDecimal(val);
		BigDecimal numToCompare = new BigDecimal("0.49");

		if (price.compareTo(numToCompare) <= 0)
			throw new RuleException("Price must be greater than 0.49");
	}
	
}
