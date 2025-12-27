package Serialization;

import java.io.*;

class Dog1 implements Serializable{
	Cat1 c=new Cat1();
}
class Cat1 implements Serializable{
	Rat1 r=new Rat1();
}
class Rat1 implements Serializable{
	int j=30;
}
public class SerObjectGraph {

	public static void main(String[] args) throws Exception{
		Dog1 d=new Dog1();
		FileOutputStream fos=new  FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog1 d2=(Dog1)ois.readObject();
       System.out.println(d2.c.r.j);
	}

}
