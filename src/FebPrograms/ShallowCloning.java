package FebPrograms;
class Sum{
	 int i;
	 Sum(int i){
		 this.i=i;
	 }
}
class Mul implements Cloneable{
	 Sum s1;
	 int j;
	 Mul(int j,Sum s1){
		 this.j=j;
		 this.s1=s1;
	 }
	 public Object clone() throws CloneNotSupportedException{
		return super.clone();
	 }
}
public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException{
		Sum s1=new Sum(10);
		Mul m=new Mul(20,s1);
		System.out.println(m.j+"   "+m.s1.i);
		Mul m2=(Mul)m.clone();
		System.out.println(m2.s1.i+"  "+m2.j);
		m2.j=100;
		m2.s1.i=521;
		System.out.println(m2.s1.i+"  "+m2.j);
		System.out.println(m.j+"   "+m.s1.i);
	}

}
