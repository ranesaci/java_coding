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
public class Optional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//print element if any element is divissible by 7
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,14,12,15,16,18,21);
		
		java.util.Optional<Integer> element  = nums.stream()
											.filter(e-> e%7==0)
											.findAny();
		
		element.ifPresent(System.out::println);

	}

}
