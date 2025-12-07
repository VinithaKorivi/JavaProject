package RECPrograms;

public class Recursion {

	public static void main(String[] args) {
		m1(1);

	}
	public static void m1(int i) {
		if(i==3) return;
		m1(i+1);
		System.out.println(i);
		
	}

}
