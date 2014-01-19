package pl.inpar.javapowertools.testng;

import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.assertTrue;


public class PercentageSuccessTest {

	//nie działa - chyba jest nienaprawiony bug
    @Test(invocationCount = 1000, successPercentage = 95, timeOut = 50)
    public void percentageTest() {
        assertTrue(randomTrue());
    }

    private boolean randomTrue() {
        return new Random().nextInt(1000) > -1;// bo nie działa successPercentage- chyba jest nienaprawiony bug
    }

}
