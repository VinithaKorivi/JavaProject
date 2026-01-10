package PracticePrograms;
class Person{
	protected String name;
	protected int age;
	protected String gender;
	public Person(String name, int age, String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void displayinfo(){
		System.out.println("name="+name+"age= "+age+ "gender= "+gender);
	}
}
class Doctor extends Person{
	private String specialization;
	private double salary;
	public Doctor(String name, int age, String gender,String specialization,double salary){
		super(name, age, gender);
		this.specialization=specialization;
		this.salary=salary;
	}
	public void treatpatient() {
		System.out.println(name+"is treating patient");
	}
	@Override
	public void displayinfo(){
		super.displayinfo();
		System.out.println("specialization="+specialization+"name="+name+"age= "+age+ "gender= "+gender);
	}
}
class Nurse extends Person{
	private String shift;
	public Nurse(String shift,String name, int age, String gender) {
		super(name,age,gender);
		this.shift=shift;
	}
	 public void assistDoctor() {
	        System.out.println(name + " assisting doctor...");
	    }
	 @Override
	    public void displayinfo() {
	        super.displayinfo();
	        System.out.println("Shift: " + shift);
	    }
}
class Patient1 extends Person{
	String disease;
	Patient1(String disease,String name, int age, String gender){
		super(name,age,gender);
		this.disease=disease;
	}
	public void gettreatment() {
		System.out.println(name+"is getting the treatment"+disease);
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("disease= "+disease);
	}
}
class Cardiologist extends Doctor{
	public Cardiologist(String name,int age, String gender,double salary) {
		super(name,age,gender,"cardiology",salary);
	}
	public void performsurgery() {
		System.out.println(name+"is performing heart surgery");
	}
}
public class Inheritence1 {

	public static void main(String[] args) {
    Doctor d=new Doctor("Bharathi",45,"Female","Dermotology",12345.00);
    Nurse n = new Nurse("Lakshmi", "Female", 32, "Night");
    Patient1 p = new Patient1("Vinitha", "Female",21,"Headache");
    Cardiologist c = new Cardiologist("Ravi", 50, "Male", 250000);
    d.treatpatient();
    d.displayinfo();
    
    n.assistDoctor();
    n.displayinfo();
    
    p.gettreatment();
    p.displayinfo();
    c.performsurgery();
	}

}
