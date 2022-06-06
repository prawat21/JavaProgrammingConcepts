package JavaQuestions;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping Value of a and b are:");
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		// without using 3rd Variable
		//a = a+b;
		//b = a-b;
		//a = a-b;
		
		//System.out.println("After Swapping Value of a and b are:");
		//System.out.println("a=" +a);
		//System.out.println("b=" +b);
		
		// Using temp Variable
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping Value of a and b using temp variable are:");
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		
	}

}
