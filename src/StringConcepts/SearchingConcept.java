package StringConcepts;

public class SearchingConcept {

	public static void main(String[] args) {
		String str = "Puneet";
		// indexOf method returns the position of the first occurence character, returns -1 if character does not occur
		System.out.println(str.indexOf('e')); //3
		System.out.println(str.indexOf("un")); // 1
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		// lastIndexOf method returns the position of the first occurence character, returns -1 if character does not occur
		System.out.println(str.lastIndexOf('e'));// 4
		
		// charAT() returns the character at the specified index. The index value should lie between 0 and lenght()-1
		System.out.println(str.charAt(2)); // n
		
		// contains() method searches the sequence of characters in the given string, and returns true if found otherwise false
		System.out.println(str.contains("et")); //t
		
		// startsWith() check if the string starts with the specified prefix beginning from 1st index.
		// If yes it will return true, otherwise false
		System.out.println(str.startsWith("pu")); //f
	}

}
