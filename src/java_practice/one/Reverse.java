package java_practice.one;

public class Reverse {
	public static void main(String[] args) {
		int a[] = { 1, 5, 4, 7, 3, 5, 8};
		int tem[]= {};
		for(int i=a.length-1;i>=0;i--) {
			 tem[i]=a[i];
			System.out.println(tem[i]);
		}
	}
//not clear
}
