package telnyx.src.telnyxPalindrome.testsClasses;

import telnyx.src.telnyxPalindrome.Base;

import static org.junit.Assert.assertEquals;
/**
 * Created by oscar.rivera on 11/13/17.
 * This is the test class for toInteger method located in Base.java
 */
public class ToIntegerTest {

    Base baseObj = new Base(2);

    @org.junit.Before
    public void firstValues(){
        baseObj.reminderNumber.add(4);
        baseObj.reminderNumber.add(2);
        baseObj.reminderNumber.add(3);
        baseObj.reminderNumber.add(1);
    }

    @org.junit.Test
    public void toIntegerTest(){
        int output = baseObj.toInteger(baseObj.reminderNumber);
        assertEquals(Integer.parseInt("4231"), output);
    }
}
