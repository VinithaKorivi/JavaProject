package Serialization;
import java.util.regex.*;
public class CharacterClasses {

	public static void main(String[] args) {
	Pattern p=Pattern.compile("[^0-9a-zA-Z]");
//	Pattern p=Pattern.compile("[0-9a-zA-Z]");
//	Pattern p=Pattern.compile("[a-z]");
//	Pattern p=Pattern.compile("[^0-9]");
	Matcher m=p.matcher("asb#k@9z");
	while(m.find()) {
		System.out.println(m.start()+"  "+m.group());
	}
	}

}
