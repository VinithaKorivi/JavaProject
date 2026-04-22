package ACollections;
import java.util.regex.*;
public class PatternRE {

	public static void main(String[] args) {
    Pattern p=Pattern.compile("\\s");
    String[] s=p.split("Durga Software solutions");
    for(String s1:s) {
    	System.out.println(s1);
    }
    Pattern p1=Pattern.compile("\\.");
    String[] s2=p1.split("www.gmail.com");
    for(String s3:s2) {
    	System.out.println(s3);
    }
    String x= "Durga Software solutions";
    String[] x1=x.split("\\s");
    for(String x2:x1) {
    	System.out.println(x2);
    }
	}

}
