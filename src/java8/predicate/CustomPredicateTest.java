/**
 * 
 */
package java8.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author Sachin.Rane
 * Oct 16, 2019
 */
public class CustomPredicateTest<T> {
	
	//filter list if string comntains more than 3 characters using predicate
	
	//first create static method which will filter the list and create new list
	
	public static <T> List<T> filter(List<T> list, CustomPredicate<T> p) {
		List<T> newlist = new ArrayList<>();
		for (T t : list) {
			if (p.test(t)) {
				newlist.add(t);
			}
		}
		return newlist;
	}
	
	//now use this method to filter using lambada expression
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[] {"sachin", "rane", "pune", "ab", "a"});
		System.out.println("list before : "+list);
		List<String> filteredList = filter(list, (String s)-> {
			if(s.length()>3) {
				return true;
			}
			return false;
		});
		System.out.println("list after : "+filteredList);
		
		//using shortcut check in lambada
		List<String> filteredList1 = filter(list, (String s)-> s.length()>3);
		System.out.println("filteredList1  : "+filteredList1);
	}
	

}
