package DailyChallenge;

public class PalindromeString {

	public static void main(String[] args) {

		isPalindrome("A man, a plan, a canal: Panama");
		isPalindrome(" race a Car");
		isPalindrome(" ");
	}

	public static void isPalindrome(String s)
	{
		String input = s;
		String output = "";
		//Convert all the chars in the input string into lowercase
		s = s.toLowerCase();

		//Remove all the alpha-numeric chars from the input string
		s=s.replaceAll("[^a-zA-Z0-9]+", "");
		//System.out.println(s);

		//convert the input string to char array
		char[] charArray = s.toCharArray();

		//Reverse the input String and store it in a output variable
		for(int i=charArray.length-1;i>=0;i--)
		{
			output = output+charArray[i];
		}

		//Compare input & output Strings

		if(s.equals(output))
			System.out.println("The given input \""+input+"\""+" is Palindrome String");
		else
			System.out.println("The given input \""+input+"\""+" is not Palindrome String");

	}

}
