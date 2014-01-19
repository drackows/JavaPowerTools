package pl.inpar.javapowertools.junitperf;

import junit.framework.Test;

import com.clarkware.junitperf.LoadTest;

public class FakeDaoPerfTimedTest {
	
	public static Test suite() {
		Test testCase = new FakeDaoTest("testFindAll");
		LoadTest loadTest = new LoadTest(testCase, 20);
		return loadTest;
	}
	
}
