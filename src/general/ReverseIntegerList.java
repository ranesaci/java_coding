/**
 * 
 */
package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sachin.Rane
 * Oct 4, 2019
 */
public class ReverseIntegerList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println(reverse(Arrays.asList(new Integer[] {2,3,4,5,6,7,8})));
		
		List<Integer> ints = Arrays.asList(new Integer[] {2,3,4,5,6,7,8});
		System.out.println(ints);
		List<Integer> ints1 = ints.subList(0, 2);
		System.out.println(ints1);
		ints1.add(10);
		System.out.println(ints1);
		
		
		
		

	}
	
	public static List<Integer> reverse(List<Integer> list) {
		if(null == list || list.isEmpty()) {
			throw new IllegalArgumentException("Wrong input");
		}
		if(list.size()<2) {
			return list;
		}
		
		 List<Integer> reversed = list.subList(list.size()-1, list.size());
		 reversed.addAll(reverse(new ArrayList<>(list.subList(0, list.size()-1))));
		 
		 
		 System.out.println("list reversed:"+reversed);
		 return reversed;
		
	}

}
