package Serialization;

import java.io.*;
import java.io.Serializable;

class Dog implements Serializable{
	public void m1() {
		System.out.println("This is dog class");
	}
}
class Cat implements Serializable{
	public void m1() {
		System.out.println("This is cat class");
	}
}
class Rat implements Serializable{
	public void m1() {
		System.out.println("This is rat class");
	}
}
public class SerializableOrder {

	public static void main(String[] args) throws Exception {
	Dog d=new Dog();
	Cat c=new Cat();
	Rat r=new Rat();
	FileOutputStream fos=new  FileOutputStream("abc.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(d);
	oos.writeObject(c);
	oos.writeObject(r);
	
	
	FileInputStream fis=new FileInputStream("abc.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Object o=ois.readObject();
	Object o1=ois.readObject();
	Object o2=ois.readObject();
	process(o);
	process(o1);
	process(o2);
	
//	Object o=ois.readObject();
//	Dog d1=(Dog)ois.readObject(); d1.m1();
//	Cat c1=(Cat)ois.readObject(); c1.m1();
//    Rat r1=(Rat)ois.readObject(); r1.m1();
	}


public static void process(Object o) {
	if(o instanceof Dog) {
		Dog d1=(Dog)o;
		d1.m1();
	}
	else if(o instanceof Cat) {
		Cat c1=(Cat)o;
		c1.m1();
	}
	else if(o instanceof Rat) {
		Rat r1=(Rat)o;
		r1.m1();
	}
	}}
