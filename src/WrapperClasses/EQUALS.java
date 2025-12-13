package WrapperClasses;

public class EQUALS
{
	String name;
	int rollno;
	EQUALS(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public boolean equals(Object obj) {
		if(obj==this) {
			return true;
		}
		try {
//			String name1=this.name;
//			int rollno1=this.rollno;(name1.equals(name2)&& (rollno1==rollno2))
//			EQUALS e=(EQUALS)obj;
//			String name2=e.name;
//			int rollno2=e.rollno;
			EQUALS e=(EQUALS)obj;
			if(name.equals(e.name)&& (rollno==e.rollno)) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(ClassCastException e) { return false;}
		catch(NullPointerException e) { return false;}
		
	}

	public static void main(String[] args) {
		EQUALS s1=new EQUALS("durga",101);
		EQUALS s2=new EQUALS("Ravi",102);
		EQUALS s3=new EQUALS("durga",101);
		EQUALS s4=s1;
	    System.out.println(s1.equals(s2));
	    System.out.println(s2.equals(s3));
	    System.out.println(s3.equals(s4));
	    System.out.println(s1.equals(s4));
	    System.out.println(s1.equals("Durga"));
	    System.out.println(s1.equals(null));
	}

}
