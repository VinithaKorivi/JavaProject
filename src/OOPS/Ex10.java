package OOPS;

public class Ex10 {
    public static void main(String[] args) {
        int[] src = {10, 20, 30, 40};
        int[] dest = new int[src.length];

        for(int i = 0; i < src.length; i++) {
            dest[i] = src[i];
        }

        System.out.println("Copied Array:");
        for(int x : dest) {
            System.out.println(x);
        }
    }
}
