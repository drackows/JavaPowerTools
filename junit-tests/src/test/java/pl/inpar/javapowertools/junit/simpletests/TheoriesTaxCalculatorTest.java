package pl.inpar.javapowertools.junit.simpletests;

import static org.hamcrest.Matchers.*;
import static org.junit.Assume.assumeThat;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import pl.inpar.javapowertools.junit.taxes.TaxCalculator;


@RunWith(Theories.class)
public class TheoriesTaxCalculatorTest {
	
	@DataPoint public static double INCOME_1 = 100.0;
	@DataPoint public static double INCOME_2 = 500.0;
	@DataPoint public static double INCOME_3 = 3000.0;
	@DataPoint public static double INCOME_4 = 6000.0;
	@DataPoint public static double INCOME_5 = 23456.0;
	
	@Theory
	public void testLowTaxRateIsEighteenPercent(double income) {
		assumeThat(income, allOf(greaterThan(3091.00), lessThan(80000.00)));
		System.out.println("Testing theory test with income: " + income);
		
		TaxCalculator taxCalculator = new TaxCalculator();
		double taxAmount = taxCalculator.calculateAmount(income);
		double expectedAmount = (income-3091) * 0.18;
		assertThat(taxAmount, closeTo(expectedAmount, 1.0));
		
	}
	
}
