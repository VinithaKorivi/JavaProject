package OOPS;

public class Ex2 {
    public static void main(String[] args) {
        String[] brands = {"Nike", "Puma", "Addidas", "Reebok"};

        System.out.println("Brand Names:");

        for(String b : brands) {
            System.out.println(b);
        }

        System.out.println("Reverse Order:");
        for(int i = brands.length-1; i >= 0; i--) {
            System.out.println(brands[i]);
        }
    }
}
