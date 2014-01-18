package pl.inpar.javapowertools.testng;

import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.testng.annotations.Test;


public class PercentageSuccessTest {
	
	//TODO: nie działa - chyba jest nienaprawiony bug
	@Test(invocationCount=1000, successPercentage=95, timeOut=50 )
	public void percentageTest() {
		assertTrue(randomTrue());
	}

	private boolean randomTrue() {
	    return new Random().nextInt(1000)>2;
    }
	
}
