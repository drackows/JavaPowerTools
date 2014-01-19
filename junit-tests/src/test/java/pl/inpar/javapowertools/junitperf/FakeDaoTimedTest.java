package pl.inpar.javapowertools.junitperf;

import com.clarkware.junitperf.TimedTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FakeDaoTimedTest extends TestCase {

    public static Test suite() {
        TestSuite suite = new TestSuite();

        TestCase testCase = new FakeDaoTest();
        suite.addTest(testCase);

        TimedTest timedTest = new TimedTest(testCase, 300);
        suite.addTest(timedTest);

        TimedTest timedTestNonWaiting = new TimedTest(testCase, 300, false);
        suite.addTest(timedTestNonWaiting);

        return suite;
    }

}
