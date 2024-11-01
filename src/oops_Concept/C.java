package oops_Concept;

class A {
	public void room() {
		System.out.println("flat from A");
	}

	public void money() {
		System.out.println("money from A");
	}
}

class B extends A {
	public void shop() {
		System.out.println("shop from B");
	}
}

public class C extends B {
	public void work() {
		System.out.println("Work from C");
	}

	public static void main(String[] args) {

		C m = new C();
		m.room();
		m.money();
		m.shop();
		m.work();

	}

}
