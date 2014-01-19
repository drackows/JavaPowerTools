package pl.inpar.javapowertools.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NewTest2 {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("  @Before suite");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("  @Before class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("  @Before method");
    }

    @Test(groups = {"A"})
    public void testA2() {
        System.out.println("  testA");
        assertEquals(1L, 1L, "one equals one");
    }

    @Test(groups = {"B"})
    public void testB2() {
        System.out.println("  testB");
        assertEquals(1L, 1L, "one equals one");
    }
}
