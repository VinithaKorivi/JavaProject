package PracticePrograms;
class Course{
	private String coursename;
	public Course(String coursename) {
		this.coursename=coursename;
	}
	public void show() {
		System.out.println("coursename="+coursename);
	}
}
class Student{
	private Course course;
	public Student(Course course) {
		this.course=course;
	}
	public void show() {
		System.out.println("Student enrolled in");
		course.show();
	}
}
public class Aggregation {

	public static void main(String[] args) {
		Course c=new Course("Java programming");
		Student s=new Student(c);
		s.show();
	}

}
