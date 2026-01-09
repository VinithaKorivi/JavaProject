package Basics;

public class StringConcat {
     public static String getdate() {
    	 return "java"; 
    	 }
	public static void main(String[] args) {
		String s='A'+10+"java";
      System.out.println(s);
      String d="java"+"World";
      String s2="java";
      String s3=s2+"world";
      System.out.println(d==s3);
      System.out.println("============");
      
      String a='A'+'B'+getdate()+"developer";
      System.out.println(a);
      
      System.out.println("=========");
      String s4 = 10 + 20 + "Java" + 30 + 40;
      System.out.println(s4);
	}

}
