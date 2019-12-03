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
public class FindFirstSquareDivisbleby3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,8,4,5,6);
		
		nums.stream()
				.filter(e-> (e*e)%3==0)
				.findAny()
				.ifPresent(System.out::println);
		

	}

}
