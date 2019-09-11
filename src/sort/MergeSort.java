package sort;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author Sachin.Rane
 * Sep 4, 2019
 * Mergesort = divide sort and merge
 */
public class MergeSort {
	
	@Test
	public void testSort() {
		List<Integer> list = Arrays.asList(new Integer[]{6,3,5,8,9});
		//List<Integer> list = Arrays.asList(new Integer[]{8,4,7,6,10,2,3});
		List<Integer> sorted_list = mergeSort(new ArrayList<>(list));
		
		System.out.println("list:"+list);
		System.out.println("sorted_list:"+sorted_list);
		assertEquals(Arrays.asList(new Integer[]{3,5,6,8,9}), sorted_list);
	}

	/**
	 * @param arrayList
	 * @return
	 */
	private List<Integer> mergeSort(List<Integer> arrayList) {
		System.out.println("mergeSort arrayList:"+arrayList);
		//terminate recursion 
		if(arrayList.size()<2) {
			return arrayList;
		}
		
		//divide list into 2 parts
		List<Integer> first = arrayList.subList(0, arrayList.size()/2);
		List<Integer> second = arrayList.subList(arrayList.size()/2, arrayList.size());
		
		System.out.println("mergeSort divided first list:"+first);
		System.out.println("mergeSort divided second list:"+second);
		
		return sortAndMerge(mergeSort(first),mergeSort(second));
	}

	/**
	 * @param mergeSort
	 * @param mergeSort2
	 * @return
	 */
	private List<Integer> sortAndMerge(List<Integer> first, List<Integer> second) {
		System.out.println("sortAndMerge first list:"+first);
		System.out.println("sortAndMerge second list:"+second);
		//merge 2 lists in sorted order
		int first_pointer = 0;
		int second_pointer = 0;
		List<Integer> mergedList = new ArrayList<>(first.size()+second.size());
		
		//repeat till pointers are less than respective list sizes
		while (first_pointer < first.size() && second_pointer <second.size()) {
			//take first list iteration
			if(first.get(first_pointer)<second.get(second_pointer)) {
				mergedList.add(first.get(first_pointer));
				first_pointer++;
			}else {
				mergedList.add(second.get(second_pointer));
				second_pointer++;
			}
			
		}
		
		//add remained first list element if any
		while ( first_pointer < first.size()) {
			mergedList.add(first.get(first_pointer));
			first_pointer++;
			
		}
		// add remained first list element if any
		while (second_pointer < second.size()) {
			mergedList.add(second.get(second_pointer));
			second_pointer++;

		}
		
		System.out.println("mergedList:"+mergedList);
		return mergedList;
	}
	
	

}
