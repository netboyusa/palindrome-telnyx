package telnyx.src.telnyxPalindrome.testsClasses;

import telnyx.src.telnyxPalindrome.Palindrome;

import static org.junit.Assert.assertTrue;

/**
 * Created by oscar.rivera on 11/12/17.
 * This is the test class for verifyIfPalindromeNumber method located in Palindrome.java
 */
public class PalindromeTest {

    @org.junit.Test
    public void testPalindrome() throws Exception{

        //New object reference of Palindrome
        Palindrome pal = new Palindrome();

        boolean output = pal.verifyIfPalindromeNumber(1);

        //assertFalse(output);

        assertTrue(output);
    }



}
