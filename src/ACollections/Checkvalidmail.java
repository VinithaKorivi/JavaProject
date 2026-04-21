package ACollections;

import java.util.regex.*;

public class Checkvalidmail {

	public static void main(String[] args) {
    String mail="kvineetha135_@gmail.com.in";
    Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
    Matcher m=p.matcher(mail);
    if(m.find()) {
    	System.out.println("Valid email");
    }else {
    	System.out.println("invalid email");
    }
	}

}
