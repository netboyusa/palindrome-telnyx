package telnyx.src.telnyxPalindrome;

import java.util.*;

/**
 * Created by oscar.rivera on 11/12/17.
 */
public class Base {

    int baseNumber;
    int quotientNumber;
    public List<Integer> reminderNumber = new ArrayList<Integer>();

        public Base (int number){
            baseNumber = number;
        }

        public void toBase(int number) throws Exception{
            quotientNumber = ((number / baseNumber));
                if (quotientNumber == 0){
                    reminderNumber.add((number % baseNumber));
                }
                else{
                    reminderNumber.add((number % baseNumber));
                    toBase(quotientNumber);
                }
        }

        public int toInteger(List<Integer> numList){
            String output = "";
            int x = 0;
            while (x < numList.size()){
                output += numList.get(x);
                x++;
            }
            output = output.trim();
            int num = Integer.parseInt(output);
            return num;

        }

        public List<Integer> reverseNumber(){
            Collections.reverse(reminderNumber);
            return reminderNumber;
        }
}

