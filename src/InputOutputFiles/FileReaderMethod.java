package InputOutputFiles;
import java.io.*;
public class FileReaderMethod{

	public static void main(String[] args) throws Exception{
	    FileWriter fw=new FileWriter("input.txt");
	    fw.write("This entire line will be printed in output");
	    char[] a= {'a','b','c'};
	    fw.write(a);
	    fw.close(); 
	    FileReader fr=new FileReader("input.txt");
	    int s;                  //=fr.read();
	    while((s=fr.read())!=-1) {
	    	System.out.print((char)s);
	    }
	    fr.close();
		}

	}
