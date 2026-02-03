package Packages;

import java.util.ArrayList;

public class OverrToString {
	public String toString() {
		return "overrtostring";
	}
	public static void main(String[] args) {
      String s=new String("durga");
      System.out.println(s);
      Integer i=new Integer(100);
      System.out.println(i);
      ArrayList l=new ArrayList();
      l.add(45);
      l.add(87);
      System.out.println(l);
      OverrToString t=new OverrToString();
      System.out.println(t);
      
	}

}
