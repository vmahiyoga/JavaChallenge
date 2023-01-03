package DailyChallenge;

import java.util.*;

public class UniqueOccurrence12 {

	public static void main(String[] args) {
		//Inputs
		int[] n1= {1,2,2,1,1,3};
		int[] n2= {1,2};
		int[] n3= {-3,0,1,-3,1,1,1,-3,10,0};

		UniqueOccurrence12 ind = new UniqueOccurrence12();

		System.out.println("Numeber of occurrence of values in input array is unique: "+ind.uniqueOccurrence(n1));
		System.out.println("Numeber of occurrence of values in input array is unique: "+ind.uniqueOccurrence(n2));
		System.out.println("Numeber of occurrence of values in input array is unique: "+ind.uniqueOccurrence(n3));

	}
	
	public boolean uniqueOccurrence(int[] n)
	{
		boolean result = false;
		
		//Create a Map
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<n.length;i++)
		{
			//Before adding a Integer to a Map, check whether Integer is available in the Map or not
			if(map.containsKey(n[i]))
			{
				//if the key value already present, get the value and increase it by 1
				Integer count = map.get(n[i]);
				map.put(n[i], count+1);
			}
			else
			{
				//else if the key value is not present in the map already, add the key(int) and value as 1 to the map
				map.put(n[i], 1);
			}
		}
		
		System.out.println(map);
		
		//Get the values in the map and store the values in a set
		Collection<Integer> values = map.values();
		Set<Integer> valueSet = new HashSet<Integer>(values);
		//System.out.println(values);
		//System.out.println(valueSet);
		
		//Check the size of valueSet and values, if the size is equal, then the occurrence is unique
		if(values.size()==valueSet.size())
			result = true;		
			
		return result;
	}

}
