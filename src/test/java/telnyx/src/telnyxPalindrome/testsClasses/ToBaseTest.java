package telnyx.src.telnyxPalindrome.testsClasses;

import telnyx.src.telnyxPalindrome.Base;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by oscar.rivera on 11/12/17.
 * This is the test class for toBase method located in Base.java
 */
public class ToBaseTest {

    @org.junit.Test
    public void toBaseTest() throws Exception {
        Base baseObj = new Base(2);
        baseObj.toBase(7);
        List<Integer> newList = baseObj.reverseNumber();
        String output = "";

        for (int newNum : newList) {
            output += newNum;
        }
        assertEquals("111", output);

    }
}
