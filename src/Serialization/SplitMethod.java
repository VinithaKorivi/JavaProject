package Serialization;

import java.util.regex.*;

public class SplitMethod {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\s");
        String[] s=p.split("Durga Software Solutions");
        for(String s1:s) {
        	System.out.println(s1);
        }
        Pattern p1=Pattern.compile("\\.");
        String[] s2=p1.split("This.is.vinitha");
        for(String s3:s2) {
        	System.out.println(s3);
        }
	}

}
