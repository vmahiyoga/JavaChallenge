package DailyChallenge;

import java.util.Arrays;

public class FindSingleNum {

	public static void main(String[] args) {

		int[] nums = {2,2,4,1,1,6,6,5,5};
		System.out.println(findSingle(nums)); 
		int[] nums1 = {2,3,2};
		System.out.println(findSingle(nums1));
		int[] nums2 = {1};
		System.out.println(findSingle(nums2));
	}

	public static int findSingle(int[] nums)
	{
		int result = 0;
		int i = 0;
		//find the arrayLength
		int arrayLength = nums.length;

		//Sort the array in ascending order
		Arrays.sort(nums);

		//Pass through the array to check the adjacent numbers
		for(i = 0;i<arrayLength-1;i++)
		{
			//if the adjacent numbers are same, then increase the count by 1 to continue the process
			if(nums[i]==nums[i+1])
			{
				i++;

			}
			//else, if the adjacent numbers are different, then story the array value in result
			else
			{
				result = nums[i];
				break;
			}
		}
		//if the i value exceeds the maximum length of the for condition, then the last value of the array is the single number
		if(i==arrayLength-1)
		{
			result = nums[i];
		}
		return result;
	}
}
