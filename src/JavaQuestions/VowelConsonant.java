package JavaQuestions;

//import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// a e i o u
		char ch = 'p'; 
		
		/*
		 * Scanner reader = new Scanner(System.in);
		 * System.out.println("Enter a Character: "); char ch = reader.next().charAt(0);
		 * 
		 * 
		 * if (ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' )
		 * System.out.println(ch + " is Vowel"); else System.out.println(ch +
		 * " is Consonent");
		 */
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(ch + " is Vowel");
				break;
				default:
				System.out.println(ch + " is consonant");
				
			}
	}
	

}
