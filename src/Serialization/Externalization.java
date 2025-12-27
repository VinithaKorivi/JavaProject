package Serialization;

import java.io.IOException;
import java.io.*;

public class Externalization implements Externalizable {
     String s;
     int i;
     int j;
     public Externalization() {
    	 System.out.println("no arg constructor");
     }
     public Externalization(String s, int i, int j) {
    	 this.s=s;
    	 this.i=i;
    	 this.j=j;
     }
     public void writeExternal(ObjectOutput out) throws IOException{
    	 out.writeObject(s);
    	 out.writeInt(i);
     }
     public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException{
    	s=(String)in.readObject();
    	i=in.readInt();
     }
	public static void main(String[] args) throws Exception {
		Externalization e=new Externalization("vinitha",10,20);
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Externalization e1=(Externalization)ois.readObject();
		System.out.println(e1.s+"  "+e1.i+"   "+e1.j);

	}

}
