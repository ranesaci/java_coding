package sort;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BubbleSort {
	@Test
	public void testSort() {
		List<Integer> list = Arrays.asList(new Integer[]{5,2,6,4});
		List<Integer> sorted_list = sort(new ArrayList<>(list));
		
		System.out.println("list:"+list);
		System.out.println("sorted_list:"+sorted_list);
		
		assertEquals(Arrays.asList(new Integer[]{2,4,5,6}), sorted_list);
		
		
	}
	
	public static List<Integer> sort(List<Integer> list){
		
		boolean moved;
		do {
			moved = false;
			for (int i = 0; i < list.size()-1; i++) {
				if(list.get(i+1) < list.get(i)) {
					//swap
					int temp = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, temp);
					moved = true;
				}//end of if
				
			}//end of for loop
			
		} while (moved);
		
		
		return list;
		
	}

}
