package PracticePrograms;
class Parent3{
	Parent3(){
		this(10);
		System.out.println("Default constructor");
	}
	 Parent3(int i){
		System.out.println("parameterised constructor Id="+i);
	}
}

public class CalltoThis {

	public static void main(String[] args) {
     new Parent3();
	}

}
