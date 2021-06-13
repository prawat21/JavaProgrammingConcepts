package JavaQuestions;

import java.util.HashMap;

public class CharacterCount {

	private static void characterCount(String inputString)
	    {
	        //Creating a HashMap containing char as a key and occurrences as a value
	  
	        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	  
	        char[] strArray = inputString.toCharArray();//Converting given string to char array
	  
	        for (char c : strArray)  //checking each char of strArray
	        {
	            if(charCountMap.containsKey(c))
	            {
	                charCountMap.put(c, charCountMap.get(c)+1); //If char 'c' is present in charCountMap, incrementing it's count by 1
	            }
	            else
	            {    //If char 'c' is not present in charCountMap,
	                //putting 'c' into charCountMap with 1 as it's value
	                charCountMap.put(c, 1);
	            }
	        }
	         
	        //Printing inputString and charCountMap 
	  
	        System.out.println(inputString+" : "+charCountMap);
	    }
	  
	    public static void main(String[] args)
	    {
	       characterCount("Java J2EE Java JSP J2EE");
	  
	       characterCount("All Is Well");
	  
	       characterCount("Done And Gone");
	    }

	}

