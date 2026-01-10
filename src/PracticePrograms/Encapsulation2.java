package PracticePrograms;
class Patient{
	private String name;
	private int age;
	private String medicalhistory;
	private double billingamount;
	private String doctorassigned;
	public Patient(String name, int age) {
		setName(name);
		setage(age);
		this.medicalhistory="no Records";
		this.billingamount=0.0;
		this.doctorassigned="Not assigned";
	}
	public void setName(String name) {
		if(name==null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Nmae can't be empty");
		}
		this.name=name;
	}
	public void setage(int age) {
		if(age<=0 ||age>120) {
			throw new IllegalArgumentException("Invalid age");
		}
		this.age=age;
	}
	public void addbilling(double amount) {
		if(amount<=0) {
			System.out.println("Invalid bill entry");
			return;
		}
		billingamount+=amount;
		System.out.println("abbded bill "+amount+ ",Total bill:"+billingamount);
	}
	public void assigndoctor(String doctor) {
		if(doctor==null ||doctor.isEmpty()) {
			System.out.println("Doctor name invalid");
			return;
		}
		this.doctorassigned=doctor;
	}
	public String getmedicalhistory() {
		return medicalhistory;
	}
	public double getbillingamount() {
		return billingamount;
	}
	public String getdoctorassigned() {
		return doctorassigned;
	}
	public void updatemedicalhistory(String history) {
		if(history==null ||history.isEmpty()) {
			System.out.println("Empty medical history update rejected");
			return;
		}
		medicalhistory=history;
	}	
}
public class Encapsulation2 {

	public static void main(String[] args) {
		Patient p=new Patient("Vinitha",110);
		p.assigndoctor("Dr.Bharathi");
		p.updatemedicalhistory("Asthma Patient | Allergy to Penicillin");
		p.addbilling(1500);
		
		System.out.println("Doctor"+p.getdoctorassigned());
		System.out.println("Billing amount"+p.getbillingamount());
		System.out.println("get history"+p.getmedicalhistory());
	}

}
