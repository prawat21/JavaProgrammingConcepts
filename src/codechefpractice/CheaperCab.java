package codechefpractice;

import java.util.Scanner;

public class CheaperCab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Test Cases: ");
		int testcase = sc.nextInt();
		for (int i = 0; i < testcase; i++) {
			System.out.print("Enter the Amount for First Cab Service: ");
			int Service1 = sc.nextInt();
			System.out.print("Enter the Amount for Second Cab Service: ");
			int Service2 = sc.nextInt();

			if (Service1 > Service2)
				System.out.println("Second Cab Service is Cheaper: " + Service2);

			else if (Service2 > Service1)
				System.out.println("First Cab Service is Cheaper: " + Service1);

			else
				System.out.println("Both Cab Service Amount is same");
		}
	}

}
