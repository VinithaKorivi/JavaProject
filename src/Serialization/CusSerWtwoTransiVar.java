package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	String username="charri";
	transient String pwd="navya";
	transient int pin=1234;
	private void writeObject(ObjectOutputStream os) throws Exception{
		os.defaultWriteObject();
		String epwd="123"+pwd;
		os.writeObject(epwd);
		int epin=4444+pin;
		os.writeInt(epin);
	}
	private void readObject(ObjectInputStream is) throws Exception{
		is.defaultReadObject();
		String epwd=(String)is.readObject();
		 pwd=epwd.substring(3);
		int epin=is.readInt();
		pin=epin-4444;
	}
}
public class CusSerWtwoTransiVar {

	public static void main(String[] args) throws Exception {
		Account c=new Account();
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(c);
        
        FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account c1=(Account)ois.readObject();
        System.out.println(c1.username+"  "+c1.pwd+" "+c1.pin);

	}

}
