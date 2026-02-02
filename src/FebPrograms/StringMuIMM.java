package FebPrograms;

public class StringMuIMM {

	public static void main(String[] args) {
    String s=new String("Vinitha");
    s.concat("Korivi");
    System.out.println(s);
    System.out.println("String is immutable"+"***"+"String buffer is mutable");
    StringBuffer s1=new StringBuffer("Radha");
    s1.append("Krishna");
    System.out.println(s1);
	}

}
