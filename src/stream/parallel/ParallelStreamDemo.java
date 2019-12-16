/**
 * 
 */
package stream.parallel;

import java.util.concurrent.RecursiveTask;
import java.util.stream.Stream;

/**
 * @author Sachin.Rane
 * Dec 3, 2019
 */
public class ParallelStreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sumForNumbers = 5000;
		
		long start = System.currentTimeMillis();
		int sum = Stream.iterate(1, i->i+1).limit(sumForNumbers).reduce(0, Integer::sum);
		long end = System.currentTimeMillis();
		System.out.println(sum + "|| in time for sequential : "+(end-start));
		
		start = System.currentTimeMillis();
		sum = Stream.iterate(1, i->i+1).limit(sumForNumbers).parallel().reduce(0, Integer::sum);
		end = System.currentTimeMillis();
		System.out.println(sum + "|| in time for parallel : "+(end-start));
		
		
		System.out.println("available processors for parallel core:"+Runtime.getRuntime().availableProcessors());
		
	}

}
