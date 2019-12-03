/**
 * 
 */
package stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sachin.Rane
 * Nov 14, 2019
 */
public class FindSumOfElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		
		
		int sum = nums.stream().reduce(0, (a,b)-> a+b);
		System.out.println(sum);
		
		//find product
		int product = nums.stream().reduce(1, (a,b)-> a*b);
		System.out.println(product);

	}

}
