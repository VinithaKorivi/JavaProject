package PracticePrograms;

public class DoWhileLoop {

	public static void main(String[] args) {
     int num=12589632; int rev=0;
     do {
    	 rev=rev*10+num%10;
    	 num/=10;
     }
     while(num>0);
     System.out.println(rev);
     System.out.println("===========");
     int numb=12345;
     int sum=0;
     do {
    	 sum=sum+numb%10;
    	 numb/=10;
     }
     while(numb>0);
     System.out.println("the sum of given no is  "+sum);
     System.out.println("===========");
     int i = 2;
     do {
         System.out.print(i + " ");
         i += 2;
     } while (i <= 20);

	}

}
