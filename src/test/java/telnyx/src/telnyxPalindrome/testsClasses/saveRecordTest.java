package telnyx.src.telnyxPalindrome.testsClasses;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import telnyx.src.telnyxPalindrome.*;

public class saveRecordTest {
	
	@org.junit.Before
	public void addHeaderToFile() throws IOException{
		String heading = "\"decimal\", \"smallest base in which the number is a palindrome\"";
		
		 File file = new File("src/test/resources/outputTest.csv");
         FileWriter fw;
		try {
			fw = new FileWriter(file, false);
			 BufferedWriter bw = new BufferedWriter(fw);
	         PrintWriter pw = new PrintWriter(bw);
	         pw.println(heading);
	         pw.flush();
	         pw.close();
	         
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	}
	
	@SuppressWarnings("resource")
	@org.junit.Test
	public void saveRecordTest() throws IOException{
		
		PalindromeMain pal = new PalindromeMain();
		int x = 5;
		int y = 6;
		String path = "src/test/resources/outputTest.csv";
		System.out.println("Save the record into a csv file");
		pal.saveRecord(x, y, path);
		
		System.out.println("Read first line of csv");
		//flTest = First Line Test
		BufferedReader flTest = new BufferedReader(new FileReader(path));
	    String header = flTest .readLine();
	    String heading = "\"decimal\", \"smallest base in which the number is a palindrome\"";
	   System.out.println("Firstline is : " + header);

		   assertEquals(header, heading);
	}
}
