package PatternPrograms;

public class Pattern15 {

	public static void main(String[] args) {
  int n=5;
  for(int i=1;i<=5;i++) {
	  int x=i;
	  int y=n-i+1;
	  for(int j=1;j<=5;j++) {
		  if(j%2==0) {
			  System.out.printf("%2d ",x);
		  }
		  else {
			  System.out.printf("%2d ",y);
		  }
		  x=x+n;
		  y=y+n;
	  }
	  System.out.println();
	  
  }
	}

}
