package JavaOOPsConcepts;

class Parent1 {
	// 1. Private method cannot be override
	/*
	 * private void m1() { System.out.println("Private Method of Parent Class"); }
	 */
	
	// 2. Final method cannot be overriden
	final void show() {
		System.out.println("Final Method of Parent class");
	}

	protected void m2() {
		System.out.println("Protected Method of Parent Class");
	}
}

class Child1 extends Parent1 {

	/*
	 * private void m1() { System.out.println("Private Method of Child Class"); }
	 */
	
	/*
	 * void show() { System.out.println("Final Method of child class"); }
	 */

	protected void m2() {
		System.out.println("Protected Method of Child Class");
	}
}

public class OverridingConcept {
	public static void main(String[] args) {
		Parent1 obj1 = new Parent1();
		// obj1.m1(); compiler error private method cannot be override
		obj1.m2();

		Parent1 obj2 = new Child1();
		obj2.m2();
		
		
	}
}
