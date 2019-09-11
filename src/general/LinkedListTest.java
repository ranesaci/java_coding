/**
 * 
 */
package general;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

/**
 * @author Sachin.Rane
 * Sep 5, 2019
 */
public class LinkedListTest {
	
	@Test
	public  void test() {
		LinkedList<Integer> linkedList = new LinkedList<>();
		addData(linkedList ,123);
		System.out.println(linkedList);
		addData(linkedList ,124);
		System.out.println(linkedList);
		
		Queue<Integer> queue = new LinkedList<>();
		addData(queue ,123);
		System.out.println(queue);
		addData(queue ,124);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		
		
	}
	
	/**
	 * @param queue
	 * @param data
	 */
	private void addData(Queue<Integer> queue, int data) {
		
		queue.add(data);
	}

	/*public  void addData(LinkedList list,int data) {
		list.add(data);
		
	}*/

}
