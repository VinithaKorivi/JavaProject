package WrapperClasses;

public class HASHCode {
  int i;
  HASHCode(int i){
	  this.i=i;
  }
  public String toString() {
	  return i+"";
  }
  public int hashCode() {
	  return i;
  }
	public static void main(String[] args) {
		HASHCode h=new HASHCode(10);
		HASHCode h1=new HASHCode(100);
		System.out.println(h);
		System.out.println(h1);
	}

}
