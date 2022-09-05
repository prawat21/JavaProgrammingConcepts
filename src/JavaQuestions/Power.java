package JavaQuestions;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Integer Number: ");
		int a = sc.nextInt();
		int x = sc.nextInt();
		int result=1;
		
		for (int i=0; i<x; i++) {
			result *= a;
		}
		System.out.println("Power of " + a + " is: " + result);

	}

}
