package OOPS;

class ConsOver1 {
    int id;
    String name;

    ConsOver1() {
        id = 0;
        name = "Unknown";
    }

    ConsOver1(int i) {
        id = i;
        name = "Unknown";
    }

    ConsOver1(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        ConsOver1 s1 = new ConsOver1();
        ConsOver1 s2 = new ConsOver1(101);
        ConsOver1 s3 = new ConsOver1(102, "Vini");
        s1.display();
        s2.display();
        s3.display();
    }
}
