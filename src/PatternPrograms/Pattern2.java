package PatternPrograms;

public class Pattern2 {

	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("%4d", k);
				k++;
			}
			System.out.println();
		}
	}

}
