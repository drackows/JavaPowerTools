package pl.inpar.javapowertools.junitperf;

import com.clarkware.junitperf.TimedTest;

import junit.framework.Test;

public class FakeDaoPerfLoadTest {
	
	public static Test suite() {
		Test testCase = new FakeDaoTest("testFindAll");
		return new TimedTest(testCase, 270);
	}
	
}
