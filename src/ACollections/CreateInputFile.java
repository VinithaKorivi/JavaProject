package ACollections;

import java.io.*;

public class CreateInputFile {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("input.txt");

        pw.println("Call me at 919876543210");
        pw.println("My number is 9876543210");
        pw.println("Random text 9123456780");
        pw.println("917013565007");
        pw.println("Another: 917013565007");

        pw.close();

        System.out.println("input.txt created successfully");
    }
}