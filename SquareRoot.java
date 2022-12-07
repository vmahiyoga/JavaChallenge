package DailyChallenge;

public class SquareRoot{

	public static void main(String[] args) {
		//Call the function to compute the square root of x
		ComputeSqRt(75);
		ComputeSqRt(64);
		ComputeSqRt(9);
		ComputeSqRt(121);
		ComputeSqRt(1534);
		//System.out.println(Math.sqrt(1534));
	}

	public static void ComputeSqRt(int x)
	{
		//Divide the number by 2
		int y = x/2;
		
		//Repeat the iteration for x/2 times
		for(int i=0;i<x/2;i++)
		{
			//When multiplying half of the number by itself resulted in x, then x/2 is the square root of the number
			//else repeat the operation, by reducing the value of y by 1
			
			if(y*y == x)
			{
				System.out.println("Square root of "+x+" is "+y);
				break;
			}
			else if(y*y > x)
			{
				y=y-1;
			}
			//To print the nearest integer value of square root of x
			else
			{
				System.out.println("Square root of "+x+" is "+y);
				break;
			}
		}
	}

}
