package JavaOOPsConcepts;

public class ConstructorExample {
	
	public ConstructorExample(String name) {
		
		System.out.println("Hello " + name);
		}
	

	public static void main(String[] args) {
		
		Test1 t = new Test1("Puneet");
		System.out.println(t);
		
		
	}

}

class Test1 extends ConstructorExample{

	public Test1(String value) {
		// super(); The constructor ConstructorExample() is undefined
		super(value);
		
	}
	
	
}
