package PracticePrograms;
class Parent4{
	int x=10;
}
class Child4 extends  Parent4{
	int x=20;
	void show() {
		System.out.println("Child value="+x);
		System.out.println("Parent value="+super.x);
	}
}
public class SuperandThis {

	public static void main(String[] args) {
     new Child4().show();
	}

}
