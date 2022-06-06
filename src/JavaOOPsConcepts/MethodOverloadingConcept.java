package JavaOOPsConcepts;

public class MethodOverloadingConcept {
// Functions can be overloaded by change in number of arguments or/and change in type of arguments.
	// Method with the same name but 2 integer parameter
	static int Multiply(int a, int b) {
		return a * b;
	}

	// Method with the same name but 2 double parameter
	static double Multiply(double a, double b) {
		return a * b;
	}
	
	// Method with the same name but 3 integer parameter
	static int Multiply(int a, int b, int c) {
		return a * b * c;
	}
}

class Test {

	public static void main(String[] args) {
		System.out.println(MethodOverloadingConcept.Multiply(4, 17));
		System.out.println(MethodOverloadingConcept.Multiply(4.5, 3.8));
		System.out.println(MethodOverloadingConcept.Multiply(11, 17, 10));
	}

}
