package ZJDBC;

import java.util.Scanner;

public class DynamicInputQuery {

	public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter employee id");
     int id=scn.nextInt();
     System.out.println("Enter employee name");
     String name=scn.next();
     System.out.println("Enter employee dept");
     String dept=scn.next();
     System.out.println("Enter employee salary");
     double sal=scn.nextDouble();
     String sqlQuery=String.format("insert into emp values(%d,%s,%s,%f)",id,name,dept,sal);
     System.out.println("Query with your dynamic output is: ");
     System.out.println(sqlQuery);
	}

}
