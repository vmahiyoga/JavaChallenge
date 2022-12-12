package DailyChallenge;

public class PrintHappyNumber {

	public static void main(String[] args) {
		int num1 = 19;
		int num2 = 82;
		int num3 = 2;
		int num4 = 7;
		System.out.println(num1+" is a happy number: "+HappyNumber(num1));
		System.out.println(num2+" is a happy number: "+HappyNumber(num2));
		System.out.println(num3+" is a happy number: "+HappyNumber(num3));
		System.out.println(num4+" is a happy number: "+HappyNumber(num4));
	}
	public static boolean HappyNumber(int num)
	{
		int rem;
		boolean result = false;
		int total = 0;

		//Check whether the number is greater than 9, else it is not a Happy Number
		while(num >9)
		{
			//Repeat the process until the number becomes zero
			while(num>0)
			{
				rem = num%10;
				num = num/10;
				total = total+(rem*rem);
			}
			//System.out.println(total);
			//Replace the num value as total, to repeat the process
			num = total;
			total = 0;
		}
						
		//When the result is 1, then it is a Happy number hence return true
		if (num==1)
		{
			result =  true;		
		}
			
		else if(num == 7)
		{
			result =  true;			
		}
		else
		{
			result = false;
		}
	
		return result;
	}

}
