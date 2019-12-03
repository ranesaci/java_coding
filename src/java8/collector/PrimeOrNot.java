/**
 * 
 */
package java8.collector;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Sachin.Rane
 * Dec 3, 2019
 */
public class PrimeOrNot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7, 25, 29, 33, 55);
		stream.forEach(a-> System.out.println(a+" is "+PrimeOrNot.isPrime(a)));

	}
	public static boolean isPrime(int number) {
		
		int numberRoot = (int) Math.sqrt(number);
		return IntStream.rangeClosed(2, numberRoot).noneMatch(i->number%i==0);
	}

}
