package Serialization;
import java.io.*;
import java.io.Serializable;

class Animal implements Serializable {
	int i = 10;
	
}

class Dog3 extends Animal {
	  int j = 20;
	
}

public class SerwrtInheritence {

	public static void main(String[] args) throws Exception {
		Dog3 d1=new Dog3();
		System.out.println(d1.i+"   "+d1.j);
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);
        
        FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog3 d2=(Dog3)ois.readObject();
		System.out.println(d2.i+"   "+d2.j);
	}

}
