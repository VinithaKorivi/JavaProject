package PracticePrograms;

public class StatementReturn {
	static int agecheck(int age) {
		if(age<18) {
			return -1;
		}
		return age;}
	public static void main(String[] args) {
			int result1 = agecheck(17);
			int result2 = agecheck(25);
			if (result1 == -1) {
		        System.out.println(" Not eligible for marriage");
		    } else {
		        System.out.println(" not Eligible, age = " + result1);
		    }

		    if (result2 == -1) {
		        System.out.println(" Not eligible for marriage");
		    } else {
		        System.out.println(" Eligible for marriage, age = " + result2);
		    }
			}

		}
		
	


