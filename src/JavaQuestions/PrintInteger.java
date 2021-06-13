package JavaQuestions;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = reader.nextInt();
		System.out.println("You Entered: "+ num);
		reader.close();
		
		
		String s ="abc";
		String s1 = new String("abc");
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		String s2= new String("abczasdqwwwwww").intern();
		System.out.println(s2);
		
		

	}

}
