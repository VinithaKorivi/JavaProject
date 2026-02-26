package Features8Java;
interface Greeting {
    void sayHello();
}
public class LamdaFeat {
    public static void main(String[] args) {

        Greeting g = () -> System.out.println("Hello Java 8");

        g.sayHello();
    }
}