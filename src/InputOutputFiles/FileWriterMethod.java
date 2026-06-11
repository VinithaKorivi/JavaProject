package InputOutputFiles;
import java.io.*;
public class FileWriterMethod {

	public static void main(String[] args) throws Exception{
    FileWriter fw=new FileWriter("input.txt");
    fw.write("vinitha is a good girl");  fw.close(); 
    FileReader fr=new FileReader("input.txt");
    int s;                  //=fr.read();
    while((s=fr.read())!=-1) {
    	System.out.print((char)s);
    }
    fr.close();
	}

}
