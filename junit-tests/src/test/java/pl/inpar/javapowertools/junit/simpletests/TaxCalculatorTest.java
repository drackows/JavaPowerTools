package pl.inpar.javapowertools.junit.simpletests;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.inpar.javapowertools.junit.taxes.TaxCalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TaxCalculatorTest {

    static TaxCalculator taxCalculator;

    @BeforeClass
    public static void beforeClass() {
        taxCalculator = new TaxCalculator();
    }

    @Before
    public void before() {
        System.out.println("Before test");
    }

    @After
    public void after() {
        System.out.println("After test");
    }

    @Test
    public void calculateTax() {
        System.out.println("Testing tax from 100.00");
        double taxAmount = taxCalculator.calculateAmount(100.00);
        assertTrue("podatek od 100.00 zl dochodu to 0.00zl", 0.00 == taxAmount);
    }

    @Test
    public void calculateTax2() {
        System.out.println("Testing tax from 5000.00");
        double taxAmount = taxCalculator.calculateAmount(5000.0);
        assertEquals("podatek od 5000.00zl dochodu wynosi 344,00zl", taxAmount, 344.00, 0.0);

    }

}
