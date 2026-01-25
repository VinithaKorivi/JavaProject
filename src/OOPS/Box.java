package OOPS;

class Box {
    int length, width, height;

    Box() {
        length = width = height = 0;
    }

    Box(int s) {
        length = width = height = s;
    }

    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    int volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(2, 3, 4);
        System.out.println(b1.volume());
        System.out.println(b2.volume());
        System.out.println(b3.volume());
    }
}

