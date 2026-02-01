package FebPrograms;

//import java.util.concurrent.*;

public class CloneCrea implements Cloneable {
	 int i=10;
	 int j=20;
	public static void main(String[] args) throws CloneNotSupportedException{
   
    CloneCrea c=new CloneCrea();
    CloneCrea c1= (CloneCrea)c.clone();
    int h=40;
    int g=80;
    System.out.println("The value iof i is "+c.i+" The value of j is "+c.j);
    System.out.println("The value iof i is "+h+" The value of j is "+g);
    System.out.println(c1.i+"  "+c1.j);
	}

}
