package PracticePrograms;

public class Break {

	public static void main(String[] args) {
    int[] a= {1,2,3,4,5,6,7,8,9};
    for(int i=0;i<a.length;i++) {
    	if(a[i]%2==0) {
    		System.out.println("this is the first even number "+a[i]);
    		break;
    	}
    }
    System.out.println("============");
    int[] marks= {12,852,-5,854};
    for(int m:marks) {
    	if(m<0) {
    		System.out.println(m);
    		System.out.println("this is an invalid marks");
    		break;
    	}
    }
	}

}
