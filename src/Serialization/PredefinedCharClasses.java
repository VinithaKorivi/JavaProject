package Serialization;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedCharClasses {
   public static void main(String[] args) {
	   Pattern p=Pattern.compile(".");
		Matcher m=p.matcher("asb #k@9z");
		while(m.find()) {
			System.out.println(m.start()+"......"+m.group());
		}
}
}
