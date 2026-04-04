package Basics;

public class Replaceandremovespace {

	public static void main(String[] args) {
		  String str = "hello world";
	        str = str.replaceAll("\\s", "");
	        System.out.println(str);
	        
	        
	        String str1 = "banana";
	        str1 = str1.replace('a', 'x');
	        System.out.println(str1);
	}

}
