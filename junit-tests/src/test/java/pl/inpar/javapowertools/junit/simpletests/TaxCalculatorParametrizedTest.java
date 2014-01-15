package pl.inpar.javapowertools.junit.simpletests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import pl.inpar.javapowertools.junit.taxes.TaxCalculator;

@RunWith(Parameterized.class)
public class TaxCalculatorParametrizedTest {
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				{     0.00,     0.00},
				{   100.00,     0.00},
				{  3091.00,     0.00},
				{  3092.00,     0.00},
				{  5000.00,   344.00},
				{ 10000.00,  1244.00},
				{ 50000.00,  8444.00},
				{ 90000.00, 16270.00},
				{250000.00, 67470.00},
		});
	}

	private double input;
	private double taxAmountExpected;

	public TaxCalculatorParametrizedTest(double money, double taxAmount) {
		System.out.println("Testing " + money + " with taxExpected " + taxAmount);
		this.input = money;
		this.taxAmountExpected = taxAmount;
	}
	
	@Test
	public void calculateTax() {
		TaxCalculator taxCalculator = new TaxCalculator();
		double taxAmount = taxCalculator.calculateAmount(input);
		assertEquals("podatek od "+input+" zl dochodu to "+taxAmountExpected+"zl", taxAmountExpected, taxAmount, 0.0);
	}
	
}
