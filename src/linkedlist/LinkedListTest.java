/**
 * 
 */
package linkedlist;

import org.junit.Test;

/**
 * @author Sachin.Rane
 * Sep 10, 2019
 */
public class LinkedListTest {
	
	@Test
	public void testReverse() {
		LinkedList<Integer> list3 = new LinkedList<Integer>(4, null);
		LinkedList<Integer> list2 = new LinkedList<Integer>(3, list3);
		LinkedList<Integer> list1 = new LinkedList<Integer>(2, list2);
		LinkedList<Integer> list = new LinkedList<Integer>(0, list1); 
		
		System.out.println("list before reverse:");
		/*while (list != null) {
			System.out.println(list.value);
			list=list.next;
			
		}
		*/
		System.out.println("list after reverse:");
		LinkedList<Integer> reversed = LinkedList.reverse(list);
		while (reversed != null) {
			System.out.println(reversed.value);
			reversed=reversed.next;
			
		}
		
	}

}
