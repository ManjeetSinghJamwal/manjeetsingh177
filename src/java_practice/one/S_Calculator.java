package java_practice.one;

import java.util.Scanner;

public class S_Calculator {
	public static void main(String[] args) {
		char operator;
		int num1,num2,result;
	Scanner sc=new Scanner(System.in);
	System.out.println("characteras operator +,-,*,/");
	operator=sc.next().charAt(0);
	System.out.println("Enter value of A");
	num1=sc.nextInt();
	System.out.println("Enter value of B");
	num2=sc.nextInt();
	switch(operator){
	case '+':
		result=num1+num2;
		System.out.println("A+B:"+result);
	break;
	case '-':
		result=num1-num2;
		System.out.println("A-B:"+result);
	break;
	case '*':
		result=num1*num2;
		System.out.println("A*B:"+result);
	break;
	case '/':
		result=num1/num2;
		System.out.println("A/B:"+result);
	break;
	default:
		System.out.println("invalid statement");
	}

}
}