package Serialization;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {

	public static void main(String[] args) {
		   Pattern p=Pattern.compile("a?");         //"a" "a+" "a*"
			Matcher m=p.matcher("abaabaaab");
			while(m.find()) {
				System.out.println(m.start()+"......"+m.group());
			}

	}

}
