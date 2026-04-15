package ACollections;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckingvalidMobNo {

	public static void main(String[] args) {
		 String PN="917013565007";
		    Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
		    Matcher m=p.matcher(PN);
		    if(m.find() && m.group().equals(PN)) {
		    	System.out.println("Valid mobile no");
		    }else {
		    	System.out.println("Invalid mobile no");
		    }
	}

}
