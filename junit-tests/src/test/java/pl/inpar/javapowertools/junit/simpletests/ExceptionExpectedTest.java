package pl.inpar.javapowertools.junit.simpletests;

import org.junit.Test;

public class ExceptionExpectedTest {
	
	@Test(expected = NumberFormatException.class)
	public void expectedExceptionTest() {
		Long.parseLong("1234");
		Long.parseLong("bad long"); //this throws expected exception
	}
	
}
