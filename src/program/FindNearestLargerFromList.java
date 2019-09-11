/**
 * 
 */
package program;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author Sachin.Rane
 * Sep 4, 2019
 */
public class FindNearestLargerFromList {
	
	@Test
	public void test() {
		List<Integer> list = Arrays.asList(new Integer[] {11,33,55,77,434,767,222,354,-33,-15});
		assertEquals(-15,findNearestLargerFromList(list,-17));
	}

	/**
	 * @param list
	 * @return
	 */
	private int findNearestLargerFromList(List<Integer> list, int number) {
		
		if(null == list || list.size()<1) {
			return -1;
		}
		int less_diff = Integer.MAX_VALUE;
		int result = -1;
		for (Integer integer : list) {
			
			if(integer>number) {
				int diff  = integer-number;
				if(diff<less_diff) {
					less_diff = diff;
					result=integer;
				}
			}
			
			
		}
		
		return result;
	}

}
