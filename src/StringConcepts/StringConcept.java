package StringConcepts;

public class StringConcept {

	public static void main(String[] args) {
		String s1 = "Puneet"; // s1 is pointing to the String in string pool
		String s2 = "Puneet"; // s2 is pointing to the String in string pool
		String s3 = new String("Puneet"); // s3 is pointing to the String in heap(non pool area)
		System.out.println(s1 == s2); // true == operator compares reference or memory location of objects in a heap
		System.out.println(s1 == s3); // false, hence, when we compare s1 and s3, the answer is false.
		System.out.println(s1.equals(s3)); // true, compares values in Java objects
		
		
		String s4 = "Abhi";
    	String s5 = "Viraaj";
    	String s6 = "Abhi";
		int a = s4.compareTo(s5); // return -21 because s1 < s2
		System.out.println(a);
		a = s4.compareTo(s6); // return 0 because s1 == s3
		System.out.println(a);
		a = s5.compareTo(s4); // return 21 because s2 > s1
		System.out.println(a);
		
		String s7 = "This is a String";
		System.out.println(s7.replace("is", "was"));
		System.out.println(s7.replaceFirst("is", "was"));
		System.out.println(s7.replaceAll("is", "was"));
		System.out.println(s7.replaceAll("is(.)", "was"));
		System.out.println(s7.replaceAll("is(.*)", "was"));
	}

}
