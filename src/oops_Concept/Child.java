package oops_Concept;

public class Child extends Parents {
	public static void main(String[] args) {
		Child c = new Child();
		c.home();
		c.flat();
		c.gold();
		
	}

}

class Parents {
	public void home() {
		System.out.println("Home");
}
	public void flat() {
		System.out.println("flat");
	}
	public void gold() {
		System.out.println("Gold");
	}
}
