package GITjava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TrywithResou {

	public static void main(String[] args) throws FileNotFoundException, IOException {
    try(BufferedReader br=new BufferedReader(new FileReader("input.txt"))) {
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
	}
    }
}
}