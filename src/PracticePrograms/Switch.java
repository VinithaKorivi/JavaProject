package PracticePrograms;

public class Switch {

	public static void main(String[] args) {
     int a=10, b=5;
     char op='/';
     String type="int";
     switch(type) {
     case "int":
    	 switch(op) {
    	 case '+':System.out.println(a+b); break;
    	 case '-':System.out.println(a-b);  break;
    	 case '*':System.out.println(a*b); break;
    	 case '/':System.out.println(a/b); break;
    	 default:System.out.println("Invalid operator");
    	 }
    	 break;
    	 default:
    		 System.out.println("Unsupported type");
     }
     System.out.println("==================");
     int level=4;
     switch(level) {
     case 1:System.out.println("Basic");break;
     case 2:System.out.println("Intermediate");break;
     case 3:System.out.println("Advanced"); break;
     default: System.out.println("unknown");
     }
     System.out.println("==================");
     char grade='D';
     switch(grade) {
     case 'A','B','C'->System.out.println("pass");
     case 'D'->System.out.println("conditional pass");
     case 'E' -> System.out.println("Fail");
     default->System.out.println("invalid grade");
     }
     System.out.println("==================");
     String day="SUNDAY";
     switch(day.toLowerCase()) {
     case "monday","tuesday","wednesday","thursday","friday"->System.out.println("working day");
     case "saturday","sunday"->System.out.println("weekend");
     default->System.out.println("invalid input");
     }
     System.out.println("==================");
     enum payment{
    	 CASH,CARD,UPI
     }
     payment p=payment.CASH;
     switch(p) {
     case CASH->System.out.println("cash payment");
     case CARD->System.out.println("card payment");
     case UPI->System.out.println("upi payment");
     default->System.out.println("invalid mode");
     }
	
  System.out.println("*********************");
	     int x=5;
	     int y=3;
	     char sm='(';
	     int result=switch(sm) {
	     case'+'->x+y;
	     case'-'->x+y;
	     case'*'->x+y;
	     case'/'->x+y; 
	     default->12;
//	     default->throw new IllegalArgumentException("Invalid operator");
	     };
	     System.out.println(result);
	    
	     int marks=70;
	     switch(marks/10) {
	     case 10,9->System.out.println("Grade A");
	     case 8,7->System.out.println("Grade B");
	     case 6->System.out.println("Grade C");
	      default->System.out.println("Fail");
	     }
	     System.out.println("*********************");
	     char ch='e';
	     switch(ch) {
	     case'a','e','i','o','u'->System.out.println("vowel letter");
	     default->System.out.println("consonant letter");
	     }
	     System.out.println("*********************");
	     int code=404;
	     switch(code) {
	     case 200->System.out.println("OK");
	     case 301->System.out.println("Moved permanently");
	     case 403->System.out.println("Forbidden");
	     case 404->System.out.println("Not Found");
	     case 500->System.out.println("Server Error");
	     default->System.out.println("Unknown Status");
	     }
}
	
	}


