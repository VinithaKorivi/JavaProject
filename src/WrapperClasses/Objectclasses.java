package WrapperClasses;

public class Objectclasses {
  int i;
  Objectclasses(int i){
	  this.i=i;
  }
  public int hashCode() {
	  return i;
//	  return 100;
  }
	public static void main(String[] args) {
		Objectclasses r=new Objectclasses(10);
		Objectclasses r2=new Objectclasses(100);
		System.out.println(r);
		System.out.println(r2);
		}

}
