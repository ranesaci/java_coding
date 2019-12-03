/**
 * 
 */
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Sachin.Rane
 * Nov 14, 2019
 */
public class MaxMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,28);
		System.out.print("find max:");
		//find max
		nums.stream()
				.reduce((x,y)-> x>y?x:y)
				.ifPresent(System.out::println);
		//find min
		System.out.print("find min:");
		nums.stream()
				.reduce((x,y)-> x<y?x:y).ifPresent(System.out::print);
		
		//other way using  static method
		System.out.print("\n other way using  static method for max:");
		nums.stream()
				.reduce(Integer::max).ifPresent(System.out::print);
		

	}

}
