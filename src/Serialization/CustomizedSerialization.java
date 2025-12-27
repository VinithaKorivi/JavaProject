package Serialization;
import java.io.*;
class Cust implements Serializable{
	String username="durga";
	transient String pwd="anushka";
	private void writeObject(ObjectOutputStream os) throws Exception{
		os.defaultWriteObject();      
		String epwd="123"+pwd;
		os.writeObject(epwd);
	}
	private void readObject(ObjectInputStream is) throws Exception{
		is.defaultReadObject();
		String epwd=(String)is.readObject();
		pwd=epwd.substring(3);
	}
	
}
public class CustomizedSerialization {
 
	public static void main(String[] args) throws Exception{
		Cust c=new Cust();
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(c);
        
        FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
        Cust c1=(Cust)ois.readObject();
        System.out.println(c1.username+"  "+c1.pwd);
	}

}
