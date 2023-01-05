package DailyChallenge;

import java.util.*;

public class DistinctString18 {

	public static void main(String[] args) {
		//Input String and k value
		
		String[] arr1 = {"d","b","c","b","c","a"};
		int k1=2;
		
		String[] arr2 = {"aaa","aa","a"};
		int k2 = 1;
		
		String[] arr3 = {"a","b","a"};
		int k3 = 3;
		
		DistinctString18 dist = new DistinctString18();
		
		System.out.println(k1+"nd distinct String in the given array is: "+dist.findDistinctString(arr1, k1));
		System.out.println(k2+"st distinct String in the given array is: "+dist.findDistinctString(arr2, k2));
		System.out.println(k3+"rd distinct String in the given array is: "+dist.findDistinctString(arr3, k3));

	}
	
	public String findDistinctString(String[] arr, int k)
	{
		
		String output ="";
		//To store the distinct strings in the array
		List<String> stringList = new ArrayList<String>();
		
		//Get the Strings in the input array and place it in a Map
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		//Iterate through the input array and put the entry as key in map
		for(int i=0;i<arr.length;i++)
		{
			//If the key value is already present in the map, increase the count by 1
			if(map.containsKey(arr[i]))
			{
				int count = map.get(arr[i]);
				map.put(arr[i], count+1);
			}
			
			//If the key value is not present in the map, add the key and value as 1
			else
			{
				map.put(arr[i], 1);
			}
		}
		System.out.println("Count of each string in the input array is: ");
		System.out.println(map);	
		
		//Distinct sentence is the sentence which is available only once in the array
		//Filter the items in the map, where value = 1
		
		for(Map.Entry<String, Integer> entry : map.entrySet() )
		{
			if(entry.getValue() == 1)
			{
				//Add the distinct strings in the array to the List
				stringList.add(entry.getKey());
			}
		}
		System.out.println("Distinct String in the input array is: ");
		System.out.println(stringList);
	
		//if the size of the list is less than k or if there is no elements in the list then return NA
		if(stringList.size()<k)
		{
			output = "NA";
		}
		
		else
		{
			//Get the element in the kth position in the list
			output = stringList.get(k-1);
		}
		
		
		
		
		return output;
		
	}

}
