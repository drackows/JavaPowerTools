package pl.inpar.javapowertools.junit.hamcrestlib;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import pl.inpar.javapowertools.junit.taxes.TaxCalculator;

public class StandardHamcrestInsideJunitTest {
	
	@Test
	public void calculateTax() {
		TaxCalculator taxCalculator = new TaxCalculator();
		double taxAmount = taxCalculator.calculateAmount(5000);
		
		assertThat(taxAmount, is(344.0));
	}
	
	@Test
	public void colorTest() {
		String result = "red";
		
		assertThat(result, equalTo("red"));
		
		assertThat(result, anyOf(is("green"), is("red"), is("blue")));
	}
	
	@Test
	public void readableOutputTest() {
		String color = "hebanowy";
		assertThat(color, is("hebanowy"));
//		assertThat("czarny to czarny", color, is("czarny")); //ten nie przechodzi
	}
	
}
