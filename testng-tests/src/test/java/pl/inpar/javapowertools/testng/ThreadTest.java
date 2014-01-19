package pl.inpar.javapowertools.testng;

import org.testng.annotations.Test;

import java.util.Random;

public class ThreadTest {

    @Test(threadPoolSize = 10, invocationCount = 30, timeOut = 300)
    public void testMultipleThreads() throws InterruptedException {
        randomSleep();
    }

    private void randomSleep() throws InterruptedException {
        int sleepTime = new Random().nextInt(100);
        System.out.println("Go to sleep for: " + sleepTime + "ms");
        Thread.sleep(sleepTime);
    }

}
