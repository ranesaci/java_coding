package sort;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class InesrtSort {
	
	@Test
	public void testSort() {
		List<Integer> list = Arrays.asList(new Integer[]{5,2,6,4});
		List<Integer> sorted_list = inserSort(new ArrayList<>(list));
		
		System.out.println("list:"+list);
		System.out.println("sorted_list:"+sorted_list);
		assertEquals(Arrays.asList(new Integer[]{2,4,5,6}), sorted_list);
		
		
	}

	private List<Integer> inserSort(List<Integer> arrayList) {
		List<Integer> sorted = new LinkedList<>();
		
		OUTER: for (Integer integer : arrayList) {
			for (int i = 0; i < sorted.size(); i++) {
				if(integer < sorted.get(i)) {
					//add it before 
					sorted.add(i, integer); //add smaller element before 
					continue OUTER; //go out of looping for next number insert
					
				}
				
			}//end of inner for
			sorted.add(sorted.size(),integer);
			
		}//end of outer for 
		
		return sorted;
	}

}
