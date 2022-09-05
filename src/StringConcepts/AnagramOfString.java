package StringConcepts;

public class AnagramOfString {
	public static void main(String[] args) {
		String str = "silent";
		String str1 = "listen";
		boolean isAnagram = false;
		boolean visited[] = new boolean[str1.length()];
		
		if(str.length()== str1.length()) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			isAnagram = false;
			for (int j = 0; j < str1.length(); j++) {
				if(str1.charAt(j) == c && !visited[j]) {
					visited[j]=true;
					isAnagram = true;
					break;
				}

			}
			if (!isAnagram)
				break;
		}
		}
		if (isAnagram) {
			System.out.println("String is Anagram");
		} else {
			System.out.println("String is not an Anagram");
		}

	}
}
