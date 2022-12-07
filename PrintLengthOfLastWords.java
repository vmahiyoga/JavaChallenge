package DailyChallenge;

public class PrintLengthOfLastWords {

	public static void main(String[] args) {

		LengthOfLastWord("Hello World");
		LengthOfLastWord("  fly me   to   the moon  ");
		LengthOfLastWord("luffy is still joyboy");

	}

	public static void LengthOfLastWord(String s)
	{
		int leng;
		System.out.println("Input String: "+s);
		//Split the sentence into words by white space
		//Store the words of the sentence in the string array words
		String[] words = s.split(" ");
		//Get the length of the array ie. the number of words in the String array		
		//Get the length of the last word
		System.out.println("The last word in the input: "+words[words.length-1]);

		leng = words[words.length-1].length();
		System.out.println("The length of the last word: "+leng);
		System.out.println();

	}

}


