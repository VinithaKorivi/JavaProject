package RECPrograms;

public class CountwithoutStringConver {

	public static void main(String[] args) {
		int num=1236504586;
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
   System.out.println("the no of digits in input is  "+count);
	}

}
