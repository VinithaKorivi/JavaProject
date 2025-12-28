package Serialization;
import java.util.regex.*;
public class FindingValidMailID {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[0-9a-zA-Z][0-9a-zA-Z_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m=p.matcher(args[0]);
		System.out.println("Entered Email ID number is"+args[0]);
		if(m.find()&&m.group().equals(args[0])) {
			
			System.out.println("It is a valid  Email ID  ");
		}
		else {
			System.out.println("Invalid  Email ID ");
		}

	}

}
