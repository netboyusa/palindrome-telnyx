package telnyx.src.telnyxPalindrome;

/**
 * Created by oscar.rivera on 11/12/17.
 */
public class Palindrome {

    public boolean verifyIfPalindromeNumber(int num) throws Exception {

        int numberObtained = num;
        int numberReverse = 0;
        int reminder;


            try {
                if (num > 0) {

                    while (num != 0) {
                        reminder = (num % 10);
                        num = (num / 10);
                        numberReverse = ((numberReverse * 10) + reminder);
                    }
                    if (numberObtained == numberReverse) {
                        return true;
                    } else {
                        return false;
                    }
                }
                else{
                    return false;
                }

            } catch (Exception e) {
                System.out.println("You need to use a integer number");
                return false;
            }
    }

}
