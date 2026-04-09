package Basics;

public class ConUpper {

	public static void main(String[] args) {
		        String str = "hello";
		        String res = "";

		        for(char ch : str.toCharArray()) {
		            res += (char)(ch - 32);
		        }

		        System.out.println(res);
	}

}
