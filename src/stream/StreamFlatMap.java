/**
 * 
 */
package stream;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author Sachin.Rane
 * Nov 14, 2019
 */
public class StreamFlatMap {

	public static void main(String[] args) {
		//find unique characters from given words array
		System.out.println("jfej");
		List<String> uniqueChars = Arrays.asList("Hello", "World")
				.stream()
				.map(w->w.split(""))
				.flatMap(Arrays::stream)
				.distinct()
				.collect(toList());
		uniqueChars.forEach(System.out::println);

	}

}
