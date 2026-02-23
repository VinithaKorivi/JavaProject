package PatternPrograms;

public class Pattern14 {

	public static void main(String[] args) {
		int n=5;
		   for(int i=1;i<=n;i++) {
			   int x=n-i+1;
			  
			   for(int j=1;j<=n;j++) {
				 System.out.printf("%2d ",x);
				 x=x+n;
			   }
			   System.out.println();
		   }
	}

}
