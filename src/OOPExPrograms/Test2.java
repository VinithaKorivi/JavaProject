package OOPExPrograms;

class Area {
    double findArea(double r) {
        return 3.14 * r * r;
    }

    int findArea(int side) {
        return side * side;
    }

    int findArea(int l, int b) {
        return l * b;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Area a = new Area();

        System.out.println("Circle: " + a.findArea(5.0));
        System.out.println("Square: " + a.findArea(6));
        System.out.println("Rectangle: " + a.findArea(4, 7));
    }
}
