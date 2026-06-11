package InputOutputFiles;

import java.io.*;

public class Filecreation {

	public static void main(String[] args) throws Exception{
     File f=new File("abc.txt");
     System.out.println(f.exists());
     f.createNewFile();
     System.out.println(f.exists());
     File v=new File("AllFiles.txt");
     System.out.println(v.exists());
     System.out.println(v.getAbsolutePath());
     File dir=new File("FileDirectory");
     System.out.println(dir.exists());
     dir.mkdir();
     System.out.println(dir.exists());
     File subfile=new File("FileDirectory","vini.txt");
     System.out.println(subfile.exists());
     subfile.createNewFile();
     System.out.println(subfile.exists());
     int count=0;
     File sum=new File("C:\\Users\\kvine\\eclipse-workspace");
     String[] s=sum.list();
     for(String s1:s) {
    	 count++;
    	 System.out.println(s1);
     }
	}
}