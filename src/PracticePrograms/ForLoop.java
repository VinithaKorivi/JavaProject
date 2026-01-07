package PracticePrograms;

public class ForLoop {

	public static void main(String[] args) {
		int num=1212334; 
		int rev=0;
		int count=0;
		for(;num>0;num/=10) {
//			rev=rev*10+num%10;
//			rev+=num%10;
			count++;
		}
//        System.out.println(rev);
		System.out.println(count); 
	}

}
