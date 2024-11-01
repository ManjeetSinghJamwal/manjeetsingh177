package java_practice.one;

import java.util.Scanner;

public class Condition {

	public void ifelse() {

	 Scanner input = new Scanner(System.in);System.out.println("Enter value of i:");
	int i = input.nextInt();

	if(i<10)
	{
		System.out.println("10 is greater than i");
	}else
	{
		System.out.println("i is greater than or equal to 10");
	}
	}

public void elif() {

	 Scanner sc = new Scanner(System.in);System.out.println("Enter value of i:");
	int a = sc.nextInt();

	if(a<10)
	{
		System.out.println("Less than 10");
	}

	else
	{
		System.out.println("Greater then 10");
	}

}

	public static void main(String[] args) {

		Condition c = new Condition();
		c.ifelse();
		c.ifelse();
		c.ifelse();
		c.ifelse();

	}

}


