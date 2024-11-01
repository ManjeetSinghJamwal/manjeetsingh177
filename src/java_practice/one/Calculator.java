package java_practice.one;

public class Calculator {
	
	int a = 10, b = 20, c;
	
	
	public void add() {
		
		System.out.println(c = a + b);
	}
	public void multi() {
		
		System.out.println(c = a * b);
	}
	public void sub() {
		
		System.out.println(c = a - b);
	}
	public void div() {
		
		System.out.println(c = a / b);
	}
	public void mod() {
		
		System.out.println(c = a % b);
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add();
		c.multi();
		c.sub();
		c.div();
		c.mod();

	}
}
