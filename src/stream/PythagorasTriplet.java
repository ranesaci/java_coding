/**
 * 
 */
package stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Sachin.Rane
 * Nov 18, 2019
 */
public class PythagorasTriplet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Stream<int[]> pythaTroplets = IntStream.rangeClosed(1, 100)
												.boxed()
												.flatMap(a-> IntStream.range(a+1, 100)
														.filter(b-> Math.sqrt(a*a + b*b) %1 ==0)
														.mapToObj(b-> new int[] {a,b, (int) Math.sqrt((a*a + b*b))})
														
														);
		
		/*Stream<int[]> pythagoreanTriples =IntStream.rangeClosed(1, 100).boxed()
		.flatMap(a ->IntStream.rangeClosed(a, 100)
								.filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
								.mapToObj(b ->new int[]{a, b, (int)Math.sqrt(a * a + b * b)})
		);
				*/		
		
		pythaTroplets.forEach(a-> System.out.println(a[0] + "-"+a[1] + "-"+a[2]));
											
	}

}
