package JavaOOPsConcepts;

public class SingletonExample {

	static SingletonExample instance = null;
	public int x = 10;

	// private constructor can't be accessed outside the class
	private SingletonExample() {
	}

	// Factory method to provide the users with instances
	static public SingletonExample getInstance() {
		if (instance == null)
			instance = new SingletonExample();

		return instance;
	}
}

// Driver Class
class Driver {
	public static void main(String args[]) {
		SingletonExample a = SingletonExample.getInstance();
		SingletonExample b = SingletonExample.getInstance();
		a.x = a.x + 10;
		System.out.println("Value of a.x = " + a.x);
		System.out.println("Value of b.x = " + b.x);
	}
}
