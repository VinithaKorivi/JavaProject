package Serialization;

import java.io.*;
import java.io.Serializable;
class Animal1  {
	int i = 10;
	Animal1(){
		System.out.println("animal constructor called");
	}
}

class Dog4 extends Animal1 implements Serializable {
	  int j = 20;
	  Dog4(){
		  System.out.println("dog constructor called ");
	  }
}
public class InheriSerialEx {

	public static void main(String[] args) throws Exception{
		Dog4 d1=new Dog4();
		d1.i=888;
		d1.j=999;
		System.out.println(d1.i+"   "+d1.j);
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);
        
        System.out.println("deserialization started");
        
        FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog4 d2=(Dog4)ois.readObject();
		System.out.println(d2.i+"   "+d2.j);
	}

}





