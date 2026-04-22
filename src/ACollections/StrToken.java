package ACollections;

import java.util.StringTokenizer;
import java.util.regex.*;

public class StrToken {

	public static void main(String[] args) {
    StringTokenizer z=new StringTokenizer("Durga Software solutions");
    while(z.hasMoreTokens()) {
    	System.out.println(z.nextToken());
    }
  
    System.out.println("**************");
	}

}
