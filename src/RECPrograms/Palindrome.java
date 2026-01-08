package RECPrograms;

public class Palindrome {

	public static void main(String[] args) {
		int pal=121;
		int num=pal;
		int rev=0;
      while(pal!=0) {
    	 rev=rev*10+pal%10;
    	 pal/=10;
      }
      System.out.println(num==rev? "Palindrome":"not Palindrome");
	}

}
