package pl.inpar.javapowertools.junit.simpletests;

import org.junit.Test;

public class TimeoutTest {
	
	@Test(timeout=100)
	public void timeoutTest() throws InterruptedException {
		System.out.println("Start test");
		Thread.sleep(50); 
//		Thread.sleep(55); //not pass with this line
		System.out.println("Stop test");
	}
	
}
