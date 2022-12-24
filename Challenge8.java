package DailyChallenge;

public class Challenge8 {

	public static void main(String[] args) {
		// input arrays

		int[] nums1 = {1,2,3,1};
		int[] nums2 = {1,0,1,1};
		int[] nums3 = {1,2,3,1,2,3};

		Challenge8 checkK = new Challenge8();

		System.out.println("i-j <= k: "+checkK.checkIndices(nums1, 3));
		System.out.println("i-j <= k: "+checkK.checkIndices(nums2, 1));
		System.out.println("i-j <= k: "+checkK.checkIndices(nums3, 2));

	}

	public boolean checkIndices(int[] nums, int k)
	{
		boolean result = false;
		
		//Iterate through the array using for loop

		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				//Compare the numbers in i and i+1 position
				if(nums[i]==nums[j])
				{
					//if the numbers in both the indices are same, then check abs(i-j) <= K, if the condition matches, return true
					int diff = Math.abs(i-j);
					//System.out.println(diff);
					if(diff<=k)
					{
						result = true;
						break;
					}
				}
			}
		}
		return result;
	}
}



