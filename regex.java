package pincode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailTest {
	public static boolean isValidEmail(String email) {
		
	      // String regex = "^[a-z]{3}[.][a-z]{3}+[@][a-z]{5,10}[.][a-z]{2}[.][a-z]{2}$" ; 
	       String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
	       Pattern p = Pattern.compile(regex); 
	        if (email == null) {
	            return false;
	        }
	  
	        Matcher m = p.matcher(email);
	        return true;
	        
	    } public static void main(String args[]) {
	        // Start Test Case 1:
	        String email1 = "abc@yahoo.com,";
	        System.out.println( email1 + " : " + isValidEmail(email1));
	        
	     // Start Test Case 2:
	        String email2 = "abc-100@yahoo.com,";
	        System.out.println( email2 + " : " + isValidEmail(email2));
	    
	        // Start Test Case 3:
	        String email3 = "abc.100@yahoo.com";
	        System.out.println( email3 + " : " + isValidEmail(email3));
	     
	        // Start Test Case 4:
	        String email4 = "abc-100@yahoo.com,";
	        System.out.println( email4 + " : " + isValidEmail(email4));
	     
	        // Start Test Case 5:
	        String email5 = "abc-100@abc.net,";
	        System.out.println( email5 + " : " + isValidEmail(email5));
	     
	        // Start Test Case 6:
	        String email6 = "abc.100@abc.com.au";
	        System.out.println( email6 + " : " + isValidEmail(email6));
	     
	        // Start Test Case 7:
	        String email7 = "abc@1.com";
	        System.out.println( email7 + " : " + isValidEmail(email7));
	     
	        // Start Test Case 8:
	        String email8 = "abc@gmail.com.com";
	        System.out.println( email8 + " : " + isValidEmail(email8));
	    
	        // Start Test Case 9:
	        String email9 = "abc+100@gmail.com";
	        System.out.println( email9 + " : " + isValidEmail(email9));
	     
	       
//	        // Start Test Case 10:
//	        String email10 = "abc@.com.my";
//	        System.out.println( email10 + " : " + isValidEmail(email10));
//	     
//	        // Start Test Case 11:
//	        String email11 = "abc123@gmail.a";
//	        System.out.println( email11 + " : " + isValidEmail(email11));
//	        
	    
	    }
}
