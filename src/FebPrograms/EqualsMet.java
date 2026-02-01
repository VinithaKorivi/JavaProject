package FebPrograms;

public class EqualsMet {
	String name;
	int id;
	EqualsMet(String name,int id){
		this.name=name;
		this.id=id;
	}
//	public boolean equals(Object obj) {
//		try {
//			String s1=this.name;
//			int id=this.id;
//			EqualsMet t=(EqualsMet)obj;
//			String s2=t.name;
//			int id2=t.id;
//			if(s1.equals(s2)&& id==id2) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		}
//			catch(ClassCastException e) {
//				return false;
//			}catch(NullPointerException n) {
//				return false;
//			}
//		
//	}	
	//*********************************************
//	public boolean equals(Object obj) {
//		try {
//			EqualsMet n=(EqualsMet)obj;
//			if(name.equals(n.name) && id==n.id) {
//				return true;
//			}else {
//				return false;
//			}
//		}catch(ClassCastException e) {
//			return false;
//		}catch(NullPointerException e1) {
//			return false;
//		}
//	}
	public boolean equals(Object obj) {
		if(obj==this ) return true;
		if(obj instanceof EqualsMet) {
			EqualsMet n=(EqualsMet)obj;
			if(name.equals(n.name) && id==n.id) {
				return true;
		}else {
				return false;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		EqualsMet t=new EqualsMet("Vinitha",23);
		EqualsMet t1=new EqualsMet("Nandu",23);
		EqualsMet t2=new EqualsMet("Vinitha",23);
		EqualsMet t3=new EqualsMet("Vinitha",23);
		EqualsMet t4=new EqualsMet("Vinitha",23);
		
		System.out.println(t.equals(t1));
		System.out.println(t1.equals(t2));
		System.out.println(t2.equals(t3));
		System.out.println(t3.equals(t4));
	}

}
