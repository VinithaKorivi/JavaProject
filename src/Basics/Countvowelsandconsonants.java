package Basics;

public class Countvowelsandconsonants {

	public static void main(String[] args) {
		        String str = "hello";
		        int v = 0, c = 0;

		        for(char ch : str.toCharArray()) {
		            if("aeiou".contains(String.valueOf(ch)))
		                v++;
		            else
		                c++;
		        }

		        System.out.println("Vowels: " + v);
		        System.out.println("Consonants: " + c);
	}

}
