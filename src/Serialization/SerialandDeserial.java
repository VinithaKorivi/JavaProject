package Serialization;
import java.io.*;
class Serial implements Serializable
{
	//transient int i=10;
	transient final int i=10;
//	int i=10;
     int j=20;
}
public class SerialandDeserial  {
    
	public static void main(String[] args) throws Exception
	{
		Serial s=new Serial();
		FileOutputStream fos=new  FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Serial ser=(Serial)ois.readObject();
		System.out.println(ser.i+"     "+ser.j);

	}

}
