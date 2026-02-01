package FebPrograms;

public class OverriToString {

	public static void main(String[] args) {
     String t=new String("durga");
     String t1=new String("durga");
     System.out.println(t.equals(t1));
     System.out.println(t==t1);
     System.out.println("*************");
     StringBuffer f=new StringBuffer("Durga");
     StringBuffer f1=new StringBuffer("durga");
     System.out.println(f.equals(f1));
     System.out.println(f==f1);
	}

}
