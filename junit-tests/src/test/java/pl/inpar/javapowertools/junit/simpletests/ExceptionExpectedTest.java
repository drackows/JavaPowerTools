package pl.inpar.javapowertools.junit.simpletests;

import org.junit.Test;

public class ExceptionExpectedTest {

    @Test(expected = NumberFormatException.class)
    public void expectedExceptionTest() {
        System.out.println(Long.parseLong("1234"));
        System.out.println(Long.parseLong("bad long")); //this throws expected exception
    }

}
