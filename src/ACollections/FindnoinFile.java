package ACollections;

import java.io.*;
import java.util.regex.*;

public class FindnoinFile {

	public static void main(String[] args) throws IOException {
		
    PrintWriter out=new PrintWriter("output.txt");
    Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
    BufferedReader br=new BufferedReader(new FileReader("input.txt"));
    String line=br.readLine();
    while(line!=null) {
    	Matcher m=p.matcher(line);
    	 while (m.find()) {
             out.println(m.group());
         }

         line = br.readLine();
     }
     br.close();
     out.close();
	}

}
