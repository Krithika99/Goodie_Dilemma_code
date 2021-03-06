package goodie_dilemma;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hr {
	
	
	
	public static HashMap<String, Integer> sortByValue(HashMap<String,Integer> map){ //sortByValue method to sort the values.
		
		List<Map.Entry<String, Integer> > list = 
	               new LinkedList<Map.Entry<String, Integer> >(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
		
		
		
		
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
		
	}
	
	
	
	
	
	
	public static void process(Map<String,Integer> map2,int emp_num){ // method used to process the given input i.e., sorted map and number of employees.
		

	List<Map.Entry<String, Integer> > list1 = 
               new LinkedList<Map.Entry<String, Integer> >(map2.entrySet());
	
//	for(int i=0;i<list1.size();i++) {
//		System.out.println(list1.get(i));
//	}
//	
	
	

	Collection<Integer> values = map2.values();
	Integer[] targetArray = values.toArray(new Integer[0]); //conversion of map values to Integer array.
	
	
	int min = targetArray[emp_num] - targetArray[0];
	int diff = 0;
	for(int i=0;i<emp_num;i++) {
		
		int j=0,k=0;
		for(k=emp_num-1;k<targetArray.length;k++) {
			
			diff= targetArray[k]-targetArray[j];
			j++;
			
			
			if(diff<min) {
				
				min =diff;
				
			
			}
			
			
			
			
			
		}
		
		
	}
	
	
	
	
	
	System.out.println("And the difference between the chosen goodie with highest price and the lowest price is"+" "+min);
	
	}
	
	public static void main(String[] args) {                                   // main method
		
		Map<String, Integer> map2 = new HashMap<String, Integer>(); //used to store the sorted input i.e., goodie : price
		
		
		
		
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<>(); // map storing the actual input i.e., goodie : price
		map.put("Fitbit plus", 7980);
		map.put("IPods", 22349);
		map.put("MI Band", 999);
		map.put("Cult Pass", 2799);
		map.put("Macbook Pro", 229900);
		map.put("Digital Camera", 11101);
		map.put("Alexa", 9999);
		map.put("Sandwich Toaster", 2195);
		map.put("Microwave Oven", 9800);
		map.put("Scale", 4999);
		
		System.out.println("Number of Employees:");
		int emp_number = sc.nextInt(); // collects input as number of employees
		
		
		 map2 =sortByValue(map); //sorting the values of the map, calling sortByValue method.
		 							// map2 has sorted values.
		 
		process(map2,emp_number); // method to process the provided input and choose the goodie.
		
//		
//	 for (Map.Entry<String, Integer> en : map2.entrySet()) { 
//            System.out.println("Key = " + en.getKey() +  
//	                          ", Value = " + en.getValue()); 
//	}

	

}
}
