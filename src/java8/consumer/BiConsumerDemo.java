/**
 * 
 */
package java8.consumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author Sachin.Rane
 * Dec 2, 2019
 */
public class BiConsumerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> ints = new ArrayList<>();
		ints.add(11);
		ints.add(22);
		ints.add(33);
		ints.add(44);
		ints.add(55);
		
		Map<Integer, Integer> map = ints.stream().collect(Collectors.toMap(a->a, a->a*2));
		
		System.out.println(map);
		
		Map<String, String> m = new HashMap<String, String>() {
			{
			put("dd", "dd");
			put("ss", "ss");
			}
		};
		System.out.println(m);
		

	}

}
