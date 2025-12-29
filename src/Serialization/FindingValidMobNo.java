package Serialization;
import java.util.regex.*;
public class FindingValidMobNo {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher m=p.matcher(args[0]);
		System.out.println("Entered mobile number is"+args[0]);
		if(m.find()&&m.group().equals(args[0])) {
			
			System.out.println("It is a valid mobile number");
		}
		else {
			System.out.println("Invalid mobile number");
		}
	}

}
