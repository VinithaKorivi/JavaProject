package PracticePrograms;
class Overr{
	public int adda(int a,int b) {
		return a+b;
	}
	public double add(double a ,double b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
         return a+b+c;
    }
}
public class Overloading {

	public static void main(String[] args) {
		Overr v=new Overr();
		System.out.println(v.add(10,20));
		System.out.println(v.add(12.00, 45456789625.00));
		System.out.println(v.add(1,2,4));
	}

}
