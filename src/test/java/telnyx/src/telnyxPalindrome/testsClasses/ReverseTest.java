package telnyx.src.telnyxPalindrome.testsClasses;

import telnyx.src.telnyxPalindrome.Base;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by oscar.rivera on 11/13/17.
 * This is the test class for reverseNumber method located in Base.java
 */
public class ReverseTest {

    //Base Object
    int baseNumberToTest = 2;
    Base baseObj = new Base(baseNumberToTest);

    @org.junit.Before
    public void firstValues() {
        baseObj.reminderNumber.add(4);
        baseObj.reminderNumber.add(1);
        baseObj.reminderNumber.add(1);
        baseObj.reminderNumber.add(4);
    }

    @org.junit.Test
    public void ReverseTest(){
        List<Integer> myList = baseObj.reverseNumber();
        String output = "";
        for(int x: myList){
            output += x;
        }

        assertEquals("4114", output);
    }
}
