package pl.inpar.javapowertools.junitperf;

import junit.extensions.RepeatedTest;
import junit.framework.Test;

import com.clarkware.junitperf.LoadTest;
import com.clarkware.junitperf.RandomTimer;
import com.clarkware.junitperf.TimedTest;

public class FakeDaoPerfRepetedTimedLoadTest {

	public static Test suite() {
		Test testCase = new FakeDaoTest("testFindAll");
		RandomTimer randomTimer = new RandomTimer(10, 100);
		TimedTest timedTest = new TimedTest(testCase, 290);
		RepeatedTest repeatedTest = new RepeatedTest(timedTest, 10);
		LoadTest loadTest = new LoadTest(repeatedTest, 25, randomTimer);
		TimedTest totalTimedTest = new TimedTest(loadTest, 4000);
		return totalTimedTest;
	}

}
