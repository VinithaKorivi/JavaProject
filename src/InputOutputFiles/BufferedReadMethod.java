package InputOutputFiles;
import java.io.*;
public class BufferedReadMethod {

	public static void main(String[] args) throws Exception{
		FileWriter fw=new FileWriter("file.txt");
        BufferedWriter br=new BufferedWriter(fw);
        br.write("vinitha");
        br.newLine();
        br.write("is a MCA Graduate");
        br.flush();
        FileReader fr=new FileReader("file.txt");
        BufferedReader read=new BufferedReader(fr);
        String line=read.readLine();
        while(line!=null) {
        	System.out.println(line);
        	line=read.readLine();
        }
	}

}
