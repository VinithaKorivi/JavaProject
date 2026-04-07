package Basics;

public class CountFrequency {

	public static void main(String[] args) {
		        String str = "aabbcc";

		        for(int i = 0; i < str.length(); i++) {
		            int count = 1;
		            for(int j = i + 1; j < str.length(); j++) {
		                if(str.charAt(i) == str.charAt(j)) {
		                    count++;
		                }
		            }
		            System.out.println(str.charAt(i) + " : " + count);
		        }
	}

}
