package OOPS;


public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Hello\nWorld");    // New line
        System.out.println("Hello\tWorld");    // Tab
        
        System.out.println("She said: \"Hi\"");// Quotes inside string
        System.out.println("Path: C:\\Users\\Vinitha"); // Backslash
        // Backspace (removes previous character)
        System.out.println("Hello\bWorld");  

        // Carriage Return (moves cursor to start of line, overwrites text)
        System.out.println("Hello\rWorld");  

        // Form Feed (moves to new page in printers, may not be visible in console)
        System.out.println("Hello\fWorld");  

        // Single Quote
        System.out.println("It\'s a Java program");  

        // Double Quote
        System.out.println("She said: \"Java is fun\"");  

        // Backslash
        System.out.println("File path: C:\\Users\\Vinitha");  

        // Null Character (not visible, but occupies space in string)
        System.out.println("Null char: A\0B");  

        // Unicode Character (Euro sign)
        System.out.println("Unicode: \u20AC");       
    }
}

