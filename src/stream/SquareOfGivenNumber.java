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
public class SquareOfGivenNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> squaresOfGivenNumbers = numbers.stream()
													 .map(n-> n*n)
													 .collect(Collectors.toList());
		
		squaresOfGivenNumbers.forEach(System.out::println);
				

	}

}
