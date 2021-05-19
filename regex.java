package pincode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	public static boolean isValidPinCode(String email) {
		
       String regex = "^[a-z]{3}[.][a-z]{3}+[@][a-z]{5,10}[.][a-z]{2}[.][a-z]{2}$" ; 
      
       Pattern p = Pattern.compile(regex); 
        if (email == null) {
            return false;
        }
  
        Matcher m = p.matcher(email);
        return true;
        
    } public static void main(String args[]) {
        // Start Test Case 1:
        String email = "abc.xyz@bridgelabz.co.in";
        System.out.println( email + " : " + isValidPinCode(email));
    
    }
}
