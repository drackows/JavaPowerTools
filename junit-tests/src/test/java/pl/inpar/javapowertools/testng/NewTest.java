package pl.inpar.javapowertools.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("  @Before suite");
	}

	@BeforeGroups(groups="A")
	public void beforeGroupA() {
		System.out.println("  @BeforeGroups A");
	}

	@AfterGroups(groups="A")
	public void afterGroupA() {
		System.out.println("  @AfterGroups A");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("  @Before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("  @Before method");
	}

	@Test(groups={"A"})
	public void testA() {
		System.out.println("  testA");
		assertEquals(1L, 1L, "one equals one");
	}

	@Test(groups={"B"})
	public void testB() {
		System.out.println("  testB");
		assertEquals(1L, 1L, "one equals one");
	}
}
