package StringConcepts;

import java.util.HashSet;
import java.util.Scanner;

public class RepeatingChar {
	
	// This function prints the first repeated
    // character in str[]
    static char firstRepeating(String str)
    {
    	
    	// Creates an empty hashset
        HashSet<Character> h = new HashSet<>();
 
        // Traverse the input array from left to right
        for (int i=0; i<=str.length()-1; i++)
        {
            char c = str.charAt(i);
 
            // If element is already in hash set, update x
            // and then break
            if (h.contains(c))
                return c;
 
            else // Else add element to hash set
                h.add(c);
        }
 
        return '\0';
    }
 
    // Driver method to test above method
    public static void main (String[] args)
    {
       Scanner sc = new Scanner(System.in);
      String str = sc.next();
        //char[] arr = str.toCharArray();
        char a = firstRepeating(str);
        if (a== '\0')
        System.out.println(0);
        else System.out.println(a);
    }

}
