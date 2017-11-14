# palindrome-telnyx
Program that determines the smallest base (greater than or equal to 2) in which the first 1000 positive decimal integers are palindromes. 

Author: Oscar Rivera
Date: Nov 12, 2017
Last Update: Nov 13, 2017
Last Update README.md: Nov 14, 2017

Functions inside: telnyx/src/telnyxPalindrome

Base.java
- Base(int) # Constructor
- toBase(int) # Converts the given number using the new base number
- toInteger(List<Integer>) # convert the numbers inside the list into integers
- reverseNumber # This methods makes a reverse of numbers in the list.
  
Palindrome.java
- verifyIfPalindromeNumber # verifies if the number is a palindrome when checks the reverse.

Tests Classes using junit 4.12 - telnyx/src/telnyxPalindrome/testsClasses
- PalindromeTest.java
- ReverseTest.java
- saveRecord.java # Verify if exists a file with heading
- ToBaseTest.java
- ToIntegerTest.java

Steps to run:
1. Run mave pom.xml file (clean and install)
2. The tests will be executed automatically
3. Run as Java file (PalindromeMain.java) inside telnyx/src/telnyxPalindrome
4. Check the output.csv text file.

EOF
