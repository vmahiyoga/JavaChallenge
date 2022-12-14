package DailyChallenge;

public class DuplicateElement7 {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,1};
		int[] nums2 = {1,2,3,4};
		int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
		
		System.out.println("Any element appears atleast twice in the array: "+isDuplicate(nums1));
		System.out.println("Any element appears atleast twice in the array: "+isDuplicate(nums2));
		System.out.println("Any element appears atleast twice in the array: "+isDuplicate(nums3));
		

	}

	public static boolean isDuplicate(int[] nums)
	{
		boolean result = false;
		
		//Traverse through the array of numbers
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				//check if any value is available atleast twice
				if(nums[i]==nums[j])
				{
					result = true;
					break;
				}
			}
		}
		
		
		return result;
	}
}
