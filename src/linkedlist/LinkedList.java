/**
 * 
 */
package linkedlist;

import org.junit.Test;

/**
 * @author Sachin.Rane
 * Sep 10, 2019
 */
public class LinkedList<T> {
	
	T value;
	LinkedList<T> next;

	/**
	 * 
	 */
	public LinkedList(T value, LinkedList<T> next) {
		this.value = value;
		this.next=next;
		
	}
	
	
	public static<T> LinkedList<T> reverse(LinkedList<T> list){
		
		if(list == null) {
			throw new  NullPointerException("list can not be empty");
		}
		if(list.next==null) {
			return list;
		}
		//take backup for first node's next
		LinkedList<T> next = list.next;
		//add null to next of first node only
		list.next=null;
		
		//use recursion to traverse list till end 
		LinkedList<T> reversed = reverse(next);
		//add last element of list to its previous element till first node in reverse direction
		next.next=list;
		
		//return node reversed
		return reversed;
		
	}
	
	
}
