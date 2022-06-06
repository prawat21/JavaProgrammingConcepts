package JavaOOPsConcepts;

public class DefaultConstructorExample {
	int age;
	String name;

	public DefaultConstructorExample() {
		// this = null;
		System.out.println("Test class constructor called");
	}
}

class Abc {

	public static void main(String args[]) {
		DefaultConstructorExample t = new DefaultConstructorExample();
		System.out.println(t);
		// default/No parameterised Constructor used for initialise the class
		System.out.println(t.age); // 0
		System.out.println(t.name); // null

	}

}
