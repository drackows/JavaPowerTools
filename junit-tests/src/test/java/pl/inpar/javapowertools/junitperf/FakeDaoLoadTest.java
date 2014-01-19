package pl.inpar.javapowertools.junitperf;

import com.clarkware.junitperf.ConstantTimer;
import com.clarkware.junitperf.LoadTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FakeDaoLoadTest {

    public static Test suite() {
        TestSuite suite = new TestSuite();

        TestCase testCase = new FakeDaoTest();
        suite.addTest(testCase);

        // test 5 users parallel (concurrent start)
        LoadTest loadTest = new LoadTest(testCase, 5);
        suite.addTest(loadTest);

        // test 5 users parallel (users start with 100ms delay)
        ConstantTimer timer = new ConstantTimer(100);
        LoadTest loadTestWithTimer = new LoadTest(testCase, 5, timer);
        suite.addTest(loadTestWithTimer);


        return suite;
    }

}
