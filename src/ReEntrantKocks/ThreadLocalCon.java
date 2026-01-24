package ReEntrantKocks;

public class ThreadLocalCon {

	public static void main(String[] args) {
    ThreadLocal l=new ThreadLocal();
    System.out.println(l.get());
    l.set("Vinitha");
    System.out.println(l.get());
    l.remove();
    System.out.println(l.get());
	}

}
