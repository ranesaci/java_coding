/**
 * 
 */
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sachin.Rane
 * Nov 14, 2019
 */
public class PairCombinatonsofArrayElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> nums1 = Arrays.asList(1,2,3);
		List<Integer> nums2 = Arrays.asList(3,4);
		
		//return all pairs
		List<int[]> pairs = nums1.stream()
									.flatMap(i->nums2.stream()
														.map(j-> new int[] {i,j}))
									.collect(Collectors.toList());
		
		pairs.forEach(e-> System.out.println(Arrays.toString(e)));
		System.out.println("******return the pair if sum is divisible by 3");
		//return the pair if sum is divisible by 3
		List<int[]> divisibleBy3Pairs = nums1.stream()
				.flatMap(i->nums2.stream()
									.map(j-> new int[] {i,j}))
				.filter(e-> (e[0]+e[1])%3==0)
				.collect(Collectors.toList());

		divisibleBy3Pairs.forEach(e-> System.out.println(Arrays.toString(e)));
		

	}

}
