/**
 * 
 */
package stream;

import java.util.stream.Stream;

/**
 * @author Sachin.Rane
 * Nov 18, 2019
 */
public class Iterate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Stream.iterate(0, n->n+2)
				.limit(10)
				.forEach(System.out::println);
		
		System.out.println("Fibbonici#****************");
		
		Stream.iterate(new int[] {0,1}, f-> new int[] {f[1], f[0]+f[1]})
				.limit(8)
				.mapToInt(t-> t[0])
				.boxed()
				.forEach(System.out::print);
		
		
		
		

	}

}
