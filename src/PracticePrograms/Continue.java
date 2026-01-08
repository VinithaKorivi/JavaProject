package PracticePrograms;

public class Continue {

	public static void main(String[] args) {
		int sum=0;
    for(int i=0;i<=25;i++) {
    	if(i%2==0) continue;
    	sum+=i;
    	System.out.print(i+" ");
    }
    System.out.println("sum of odd no is"+sum);
    System.out.println("***********");
    int[] a= {10,20,30,40,-2,50,-7,-678,45};
    for(int a1:a) {
    	if(a1<0) continue;
    	System.out.print(a1+" ");
    }
    System.out.println("++++++++++++++++");
    String s="Software developer";
    for(int i=0;i<s.length();i++) {
    	char ch=s.charAt(i);
    	if("aeiou".indexOf(ch)!=-1) continue;
    	System.out.print(ch);
    	
    }
//    ch = 'e';
//    "aeiou".indexOf('e')  → 1
//    1 != -1  → true  → continue (skip)
//
//    ch = 'x';
//    "aeiou".indexOf('x') → -1
//    -1 != -1 → false → process character
	}

}
