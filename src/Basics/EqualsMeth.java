package Basics;

public class EqualsMeth {
		String name;
		int rollno;
		EqualsMeth(String name, int rollno){
			this.name=name;
			this.rollno=rollno;
		}
	 public boolean  equals(Object obj) {
//			try {
//				String name1=this.name;
//				int rollno1=this.rollno;
//				EqualsMeth s=(EqualsMeth)obj;
//				String name2=s.name;
//				int rollno2=s.rollno;
//				if(name1.equals(name2) && rollno1==rollno2) {
//					return true;
//				}
//				else return false;
//			}
		 //*****************************
//		 try {
//		 EqualsMeth s=(EqualsMeth)obj;
//		 if(name.equals(s.name) && rollno==s.rollno) {
//			 return true;
//			}else {
//				return false;
//			}
//		 }
//			catch(ClassCastException e) {
//				return false;
//			}catch(NullPointerException e) {
//				return false;
//			}
		 //*****************************
         if(obj instanceof EqualsMeth) {
        	 EqualsMeth s=(EqualsMeth)obj;
        	 if(name.equals(s.name) && rollno==s.rollno) {
    			 return true;
    			}else {
    				return false;
    			}
         }
         else return false;
		}

	public static void main(String[] args) {
		EqualsMeth s1=new EqualsMeth("Durga",101);
		EqualsMeth s2=new EqualsMeth("vini",102);
		EqualsMeth s3=new EqualsMeth("Ram",103);
		EqualsMeth s4=s1;
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s4));
	}

}
