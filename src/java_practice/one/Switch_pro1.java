package java_practice.one;

import java.util.Scanner;

public class Switch_pro1 {
	public void s_method() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the variable value:");
		int day=sc.nextInt();
		
		 switch(day) {
		 case 1:
			 System.out.println("Monday");
		 break;
		 case 2:
			 System.out.println("Tuesday");
		 break;
		 case 3:
			 System.out.println("Thursday");
		 break;
		 case 4:
			 System.out.println("Friday");
		 break;
		 case 5:
			 System.out.println("Saturday");
		 break;
		 case 6:
			 System.out.println("Sunday");
		 break;
		 case 7:
			 System.out.println("case_Seven");
		 break;
		 }
		
		
	}
	public static void main(String[] args) {
		Switch_pro1 sp=new Switch_pro1();
		sp.s_method();
		
		
	}

}
