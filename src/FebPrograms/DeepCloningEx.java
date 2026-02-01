package FebPrograms;
class Berry{
	int i;
	Berry(int i){
		this.i=i;
	}
}
class Cherry implements Cloneable{
	Berry b;
	int j;
	Cherry(Berry b,int j){
		this.b=b;
		this.j=j;
	}
	public Object clone() throws CloneNotSupportedException{
		Berry b1=new Berry(b.i);
		Cherry  c=new Cherry(b1,j);
		return c;
	}
}
public class DeepCloningEx {

	public static void main(String[] args) throws CloneNotSupportedException{
		Berry b=new Berry(10);
		Cherry c=new Cherry(b,52);
		System.out.println(c.b.i+"  "+c.j);
		Cherry c2=(Cherry)c.clone();
		c2.b.i=45698745;
		c2.j=968;
		System.out.println(c2.b.i+"  "+c2.j);
		System.out.println(c.b.i+"  "+c.j);
	}

}
