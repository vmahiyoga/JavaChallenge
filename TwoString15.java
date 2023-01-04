package DailyChallenge;

public class TwoString15 {

	public static void main(String[] args) {

		String[] word1 = {"ab", "c"};
		String[] word2 = {"a", "bc"};
		String[] word3 = {"a", "cb"};
		String[] word4 = {"ab", "c"};
		String[] word5 = {"abcddefg"};
		String[] word6 = {"abc", "d", "defg"};


		TwoString15 twoStr = new TwoString15();
		System.out.println(twoStr.findTwoString(word1, word2));
		System.out.println(twoStr.findTwoString(word3, word4));
		System.out.println(twoStr.findTwoString(word5, word6));
	}

	public boolean findTwoString(String[] word1, String[] word2)
	{
		boolean output = false;

		String str1 ="", str2="";

		//Get each word in word1 and concatenate;
		for(int i=0;i<word1.length;i++)
		{
			str1 = str1+word1[i];
		}

		//Get each word in word2 and concatenate;
		for(int i=0;i<word2.length;i++)
		{
			str2 = str2+word2[i];
		}

		//System.out.println(str1);
		//System.out.println(str2);

		//Check the two strings are equal
		if(str1.equals(str2))
		{
			System.out.print(str1+" and "+str2+" are equal: ");
			output = true;
		}
		else
		{
			System.out.print(str1+" and "+str2+" are equal: ");
			output = false;
		}


		return output;

	}

}
