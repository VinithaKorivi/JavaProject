package RECPrograms;

public class Numbers1 {
	public static void main(String[] args) {
		m1(1);

	}
	public static void m1(int i) {
		if(i>10) return;
		System.out.println(i);
		m1(i+1);
		
	}

}
