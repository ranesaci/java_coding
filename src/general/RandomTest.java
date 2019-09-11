/**
 * 
 */
package general;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

/**
 * @author Sachin.Rane
 * Sep 4, 2019
 */
public class RandomTest {
	
	@Test
	public void test() {
		for (int i = 0; i < 10; i++) {
			System.out.println(random());
			
		}
		
		final String name = "pqrs";
		final String[] array = new String[] {"sachin", "rane", name};
		array[2] = "abcd";
		System.out.println(Arrays.toString(array));
	}
	
	public static int random() {
		
		final Random r = new Random();
		final String[] randomArrayLength = new String[r.nextInt(100)];
		return randomArrayLength.length;
	}

}
