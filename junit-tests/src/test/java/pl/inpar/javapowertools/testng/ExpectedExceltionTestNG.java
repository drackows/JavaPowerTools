package pl.inpar.javapowertools.testng;

import org.testng.annotations.Test;

public class ExpectedExceltionTestNG {

    @Test(expectedExceptions = {NumberFormatException.class})
    public void numberFormatExcExp() {
        Long.parseLong("xxx");
    }

}
