package DailyChallenge;

import java.util.HashSet;
import java.util.Set;

public class FindFirstDuplicateChar11 {

	public static void main(String[] args) {
		//Inputs
		String s1 = "abccbaacz";
		String s2 = "abcdd";
		String s3 = "abcde";

		FindFirstDuplicateChar11 dupChar = new FindFirstDuplicateChar11();

		System.out.println("First letter that appears twice in "+s1+" is "+dupChar.duplicateChar(s1));
		System.out.println("First letter that appears twice in "+s2+" is "+dupChar.duplicateChar(s2));
		System.out.println("First letter that appears twice in "+s3+" is "+dupChar.duplicateChar(s3));

	}

	public char duplicateChar(String s)
	{
		char result = '0';
		
		//Create a new HashSet to add the chars in the input string
		Set<Character> setChars = new HashSet<Character>();
		//Insert the chars in the string to the set
		for(int i=0;i<s.length();i++)
		{
			//if the char is not inserted into the set (duplicate), then that is the first char appearing twice
			if(setChars.add(s.charAt(i))==false)
			{
				result = s.charAt(i);
				break;
			}
		}
		return result;

	}

}

