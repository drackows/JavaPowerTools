package pl.inpar.javapowertools.testng;

import org.testng.annotations.Test;

public class DependencyMethodTest {

    @Test
    public void init() {
        System.out.println("init method called");
    }

    @Test
    public void testA() {
        System.out.println("Test A");
    }

    @Test(dependsOnMethods = "init")
    public void testB() {
        System.out.println("Test B");
    }

    @Test(dependsOnGroups = "B")
    public void testDependendsOnGroupB() {
        System.out.println("TestDependendsOnGroupB");
    }
}
