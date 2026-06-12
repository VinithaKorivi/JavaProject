package InputOutputFiles;
import java.io.*;
class Data implements Serializable{
	String name="Vinitha";
	String password="username";
	int age=25;
}
public class SerializaDemo {

	public static void main(String[] args) throws Exception{
		Data d=new Data();
		FileOutputStream fos=new FileOutputStream("output.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		FileInputStream fis=new FileInputStream("output.txt");
		ObjectInputStream ois=new  ObjectInputStream(fis);
		Data d1= (Data)ois.readObject();
		System.out.println("name of the person is = "+d1.name+" with age= "+d1.age+"and with password is = "+d1.password);
	}
}
