package generics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Sachin.Rane Sep 11, 2019
 */
public class Generics {

	public static <A, B> List<B> mapList(final List<A> values, final GenericOperation<A, B> op) {
		final ArrayList<B> toReturn = new ArrayList<>(values.size());
		for (final A a : values) {
			toReturn.add(op.performOperation(a));
		}
		return toReturn;
	}
	
	@Test
	public void test() {
		List<String> list = Arrays.asList("Sachin", "Rane", "Pune");
		List<Integer> ints = Generics.mapList(list ,new MyGenericOperation() );
		for (Integer integer : ints) {
			System.out.println(integer);
			
		}
	}

}
