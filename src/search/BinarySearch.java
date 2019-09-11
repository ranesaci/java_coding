/**
 * 
 */
package search;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author Sachin.Rane
 * Sep 4, 2019
 */
public class BinarySearch {
	
	@Test
	public void testBinarySearch() {
		List<Integer> list = Arrays.asList(new Integer[]{1,3,5,7,9} );
		assertTrue(binarySearch(list, 5));
		assertFalse(binarySearch(list,33));
	}

	/**
	 * @param list
	 * @param i
	 * @return
	 */
	private boolean binarySearch(List<Integer> list, int search) {
		//terminate recursive
		if(null == list || list.size()<2) {
			return false;
		}
		
		//divide sorted list in 2 parts
		int middle = list.get(list.size()/2);
		if(middle == search) {
			return true;
		}
		
		if(search < middle ) {
			return binarySearch(list.subList(0, list.size()/2), search);
		}else {
			return binarySearch(list.subList((list.size()/2)+1, list.size()), search);
		}

	}

}
