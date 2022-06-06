package JavaQuestions;

public class DuplicateCharacter {

	public static void main(String[] args) {
		      String str = "Puneet";
		      char[] ch = str.toCharArray();
		      System.out.println("The string is:" + str);
		      System.out.println("Duplicate Characters in above string are: ");
		      for (int i = 0; i < str.length(); i++) {
		         for (int j = i + 1; j < str.length(); j++) {
		            if (ch[i] == ch[j]) {
		               System.out.print(ch[j] + " ");
		               break;
		            }
		         }
		      }
		   }

	}


