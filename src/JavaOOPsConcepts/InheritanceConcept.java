package JavaOOPsConcepts;

// Base or Parent Class
class Parent {
	String name = "Puneet";

	public void show() {

		System.out.println("InheritanceConcept: Parent Class Method: show Method");
	}
}

// Child Class
class Child extends Parent {
	int age = 32;

	public void show() {

		System.out.println("InheritanceConcept: Child Class Method: show Method");

	}

	public void display() {
		System.out.println("Child Class Method: Display Method");

	}
}

// Driver Class
public class InheritanceConcept {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.name);
		System.out.println(c.age);
		c.show();
		c.display();

		// 1. Trying to Downcasting Implicitly
		// Child c1 = new Parent(); //compile error

		// Upcasting--P(Parent reference) can only access parent class fields and
		// methods child specific methods are not accessible
		// Run-Time polymorphism, If we don't know exact runtime type of object then we
		// should use this approach(polymorhism).
		Parent p = new Child();
		System.out.println(p.name);
		// System.out.println(p.age); //compile error
		p.show();
		// p.display(); // The method display() is undefined for the type Parent

		// 2. Downcasting Explicitly
		Child c2 = (Child) p;
		System.out.println(c2.name);
		System.out.println(c2.age);

		Parent p1 = new Parent();
		System.out.println(p1.name);
		// System.out.println(p1.age); //compile error
		p1.show();
		// p1.display(); // The method display() is undefined for the type Parent

	}
}
