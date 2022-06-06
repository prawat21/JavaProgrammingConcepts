package JavaQuestions;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Ananya";
		char[] chr = str.toCharArray();
		String rev = "";

		// 1. Without using Any function
		for (int i = chr.length - 1; i >= 0; i--) {
			rev = rev + chr[i];
		}
		System.out.println("String is: " + str);
		System.out.println("Reverse of String is: " + rev);

		// 2. To check String is Palindrome or not

		if (str.equals(rev)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}

	}

}
