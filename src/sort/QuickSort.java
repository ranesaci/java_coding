package sort;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class QuickSort {
	
	@Test
	public void testSort() {
		//List<Integer> list = Arrays.asList(new Integer[]{6,3,5,8,9});
		List<Integer> list = Arrays.asList(new Integer[]{8,4,7,6,10,2,3});
		List<Integer> sorted_list = quickSort(new ArrayList<>(list));
		
		System.out.println("list:"+list);
		System.out.println("sorted_list:"+sorted_list);
		//assertEquals(Arrays.asList(new Integer[]{3,5,6,8,9}), sorted_list);
		
		
		
	}

	private List<Integer> quickSort(List<Integer> arrayList) {
		System.out.println("list for quicksort:"+arrayList);
		//if provided list is less than 2 elements , return same list
		if(arrayList.size()<2) {
			return arrayList;
		}
		
		//take pivot as a first element
		int pivot = arrayList.get(0);
		
		//add lower and higher list based on pivot
		List<Integer> lower = new ArrayList<>();
		List<Integer> higher = new ArrayList<>();
		for (int i = 1; i < arrayList.size(); i++) {
			
			if(arrayList.get(i)<pivot) {
				lower.add(arrayList.get(i));
				
			}else {
				higher.add(arrayList.get(i));
			}
		}
		
		
		List<Integer> sorted = quickSort(lower);
		System.out.println("lower sorted"+sorted);
		sorted.add(pivot);
		System.out.println("adding pivot"+sorted);
		sorted.addAll(quickSort(higher));
		System.out.println("higher sorted"+sorted);
		
		return sorted;
	}


}
