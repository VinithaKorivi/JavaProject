package PracticePrograms;
class Printer {
    private static Printer printer = new Printer();
    
    private Printer() {
        System.out.println("Printer is ready");
    }

    public static Printer getPrinter() {
        return printer;
    }

    public void print(String msg) {
        System.out.println("Printing: " + msg);
    }
}

public class Singleton2 {
    public static void main(String[] args) {
        Printer p1 = Printer.getPrinter();
        Printer p2 = Printer.getPrinter();

        p1.print("Invoice");
        p2.print("Report");

        System.out.println(p1 == p2);
    }
}


