package ExceptionsHandlingConcepts;

public class ThrowsException {

	public static void main(String[] args) {
		//String str = null;
		//System.out.println(str.length()); // NullPointerException
		
		String str1 = "Puneet Rawat";
		String str2 = new String("Puneet Raw");
		System.out.println(str1==str2);//False
		System.out.println(str1.compareTo(str2));// 

	}

}
