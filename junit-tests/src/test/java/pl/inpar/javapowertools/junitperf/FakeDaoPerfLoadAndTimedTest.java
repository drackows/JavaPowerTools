package pl.inpar.javapowertools.junitperf;

import junit.framework.Test;

import com.clarkware.junitperf.ConstantTimer;
import com.clarkware.junitperf.LoadTest;
import com.clarkware.junitperf.TimedTest;

public class FakeDaoPerfLoadAndTimedTest {

	private static final int ONE_TEST_TIMEOUT = 280;

	private static final int CONCURENT_USERS = 50;

	// without it there was a problem with concurrent create objects or
	// something else
	private static final int DELAY_BETWEEN_CONCURRENT_USERS = 25;

	private static final int TOTAL_TEST_TIMEOUT = ONE_TEST_TIMEOUT + CONCURENT_USERS * DELAY_BETWEEN_CONCURRENT_USERS;

	public static Test suite() {
		Test testCase = new FakeDaoTest("testFindAll");
		TimedTest timedTest = new TimedTest(testCase, ONE_TEST_TIMEOUT);
		LoadTest loadTest = new LoadTest(timedTest, CONCURENT_USERS, new ConstantTimer(DELAY_BETWEEN_CONCURRENT_USERS));
		TimedTest totalTimedTest = new TimedTest(loadTest, TOTAL_TEST_TIMEOUT, false); //interrupt on timeout
		return totalTimedTest;
	}

}
