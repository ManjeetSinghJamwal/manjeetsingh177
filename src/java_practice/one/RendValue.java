package java_practice.one;

import java.util.Scanner;

public class RendValue {
	public static void main(String[] args) {
	System.out.println("Enter any value");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int l[]= {1,2,3,4,5,6};
	for(int i=0;i<l.length;i++) {
		if(l[i]!=n) {
			n=-1;
		}
		
	if(l[i]==n) {
		System.out.println(l[i]);
	}
	}

}
}