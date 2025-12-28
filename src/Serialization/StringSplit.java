package Serialization;

import java.util.StringTokenizer;

public class StringSplit {

	public static void main(String[] args) {
		String s="This is the split method related to String";
		String[] s1=s.split("\\s");
       for(String s2:s1) {
    	   System.out.println(s2);
       }
       System.out.println("===========================");
       StringTokenizer st=new StringTokenizer("This is the string tokenizer concept from regular expressions");
       while(st.hasMoreTokens()) {
    	   System.out.println(st.nextToken());
       }
       System.out.println("========================");
       StringTokenizer st1=new StringTokenizer("19-9-2020-2022-2023", "-");
       while(st1.hasMoreTokens()) {
    	   System.out.println(st1.nextToken());
       }
	}

}
