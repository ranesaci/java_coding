/**
 * 
 */
package java8.collector;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Sachin.Rane
 * Nov 26, 2019
 */
public class PartioningBy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int number =47;
		System.out.println("Check whether "+number+" prime or not?"+isPrime(number));
		System.out.println("\nmap of prime numbers and non prime numbers");
		
		Map<Boolean, List<Integer>> map = IntStream.range(2, number)
													.boxed()
													.collect(Collectors.partitioningBy(num-> isPrime(num)));
		System.out.println(map);
	}
	
	public static boolean isPrime(int number) {
		
		return IntStream.range(2, number)
					.noneMatch(num-> number%num == 0);
	}
	

}
