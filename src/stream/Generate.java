/**
 * 
 */
package stream;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Sachin.Rane
 * Nov 18, 2019
 */
public class Generate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stream.generate(Math::random)
				.limit(5)
				.forEach(System.out::println);
		
		
		System.out.println("Fibonnici Series***************");
		
		IntStream.generate(new IntSupplier() {
			
			int prev=0;
			int current=1;
			@Override
			public int getAsInt() {
				int oldPrev = this.prev;
				int nextVal = this.prev+this.current;
				this.prev= this.current;
				this.current=nextVal;
				return oldPrev;
			}
			
		}).limit(6).forEach(System.out::print);;

	}

}
