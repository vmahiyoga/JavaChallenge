package DailyChallenge;

import java.util.*;

public class LuckyNumber {

	public static void main(String[] args) {
		int[] arr1 = {2,2,3,4};
		int[] arr2 = {1,2,2,3,3,3};
		int[] arr3 = {2,2,2,3,3};

		LuckyNumber lucky = new LuckyNumber();

		System.out.println(lucky.findLuckyNumber(arr1));
		System.out.println(lucky.findLuckyNumber(arr2));
		System.out.println(lucky.findLuckyNumber(arr3));
	}

	public int findLuckyNumber(int[] arr)
	{
		int output = -1;

		//Get the Input Array and put it in a Map
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for(int i=0;i<arr.length;i++)
		{
			//Check whether the key is available in the map
			//If the key is available in the map, then increase the count by 1
			if(map.containsKey(arr[i]))
			{
				int value = map.get(arr[i]);
				map.put(arr[i], value+1);
			}

			//If the key is not available in the map, insert the key and value as 1
			else
			{
				map.put(arr[i], 1);
			}			
		}

		System.out.println(map);

		//check whether the number is lucky number by comparing key and value

		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getKey()==entry.getValue())
			{
				output = entry.getValue();

			}
		}
		System.out.println(output);
		return output;
	}

}
