package Collections;

import java.util.*;

class Employee implements Comparable{
	String name;
	int eid;
	Employee(String name, int eid){
		this.name=name;
		this.eid=eid;
	}
	public String toString() {
		return name+"   "+eid;
	}
	public int compareTo(Object obj) {
		int eid1=this.eid;
		Employee e=(Employee)obj;
		int eid2=e.eid;
		if(eid1<eid2) {
			return -1;}
			else if(eid1>eid2){
				return 1;}
			else {return 0;}
		}
	}
public class ComptorExample {

	public static void main(String[] args) {
    Employee e1=new Employee("Vini",100);
    Employee e2=new Employee("Bala",101);
    Employee e3=new Employee("kavya",304);
    Employee e4=new Employee("Narayan",600);
    Employee e5=new Employee("Harshitha",30);
    TreeSet t=new TreeSet();
	t.add(e1);
	t.add(e2);
	t.add(e3);
	t.add(e4);
	t.add(e5);
	System.out.println(t);
	TreeSet t1=new TreeSet(new MyCompare());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);	
	}	
	}
class MyCompare implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Employee e= (Employee)obj1;
		Employee e1= (Employee)obj2;
		String s1=e.name;
		String s2=e1.name;
		return s1.compareTo(s2);
	}
}