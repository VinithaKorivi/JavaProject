package PracticePrograms;
class Parent2{
	Parent2(){
		System.out.println("parent constructor");
	}
}
class Child extends Parent2{
	Child(){
		super();
		System.out.println("child constructor");
	}
}
public class CalltoSuper {

	public static void main(String[] args) {
    new Child();
	}

}
