package ArraysConcepts;

public class ArrayIntro {

	public static void main(String[] args) {
		//int[] marks = new int[5];
		int marks1[] = new int[5];
		int[] age = {2, 5,8,9,11,72};
		double[] marks = {4.5,6.1,2.0,54.8};
		
		for(int i =0; i<age.length; i++) {
			System.out.println(age[i]);
		}
		
		System.out.println(marks1.length); //5
		System.out.println(marks1[3]); //0
		System.out.println(age.length); //6
		System.out.println(age[3]); //9
		System.out.println(marks[2]); //2.0
		

	}

}
