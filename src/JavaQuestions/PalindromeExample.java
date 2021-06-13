package JavaQuestions;

public class PalindromeExample {

	public static void main(String[] args) {
		String str = "abcba";
		char[] chr = str.toCharArray();
		String rev ="";
		for (int i = chr.length - 1 ; i >= 0; i--)
		{
			rev = rev + chr[i];
		}
		
		System.out.println("String is:" + str);
		System.out.println("Reverse String is:" +rev );
	
	if (str.equals(rev))
		System.out.println("String is Palindrome");
	else 
		System.out.println("String is not Palindrome");
	}
}
