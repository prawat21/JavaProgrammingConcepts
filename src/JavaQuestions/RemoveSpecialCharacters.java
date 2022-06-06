package JavaQuestions;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String str = "This#$@!is^%&*Company";
		str = str.replaceAll("[^a-zA-Z0-9]", " ");
		
		System.out.println(str);
		
		
		

	}

}





