package ExceptionsHandlingConcepts;

public class ThrowsException {
	
	void display() {
		int a = 5, b= 0, c;
		c = a/b;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		//String str = null;
		//System.out.println(str.length()); // NullPointerException
		ThrowsException te = new ThrowsException();
		te.display();
		int a = 5, b= 0, c;
		c = a/b;
		System.out.println(c);
		

	}

}
