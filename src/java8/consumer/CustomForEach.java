/**
 * 
 */
package java8.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java8.predicate.CustomPredicate;

/**
 * @author Sachin.Rane
 * Oct 16, 2019
 */
public class CustomForEach<T> {
	
	//first create method to iterate elements in the list using foreach method
	public static <T> void customForEach(List<T> list, CustomConsumer<T> c){
		for (T t : list) {
			c.accept(t);
		}
		
	}
	// create method to change elements in the list using foreach method
		public static <T> List<T> customForEach(List<T> list, CustomAddInterface<T> c){
			
			List<T> newList = new ArrayList<>();
			for (T t : list) {
				T t1 = c.accept(t);
				newList.add(t1);
			}
			return newList;
		}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		List<Integer> intList = Arrays.asList(new Integer[] {1,2,3,4,5,6});
		System.out.println("list before:"+intList);
		customForEach(intList, (Integer i) ->System.out.println(i));
		System.out.println("******************");
		//integer list and add 2 in each element
		System.out.println("list before for customForEach :"+intList);
		List<Integer> newIntList = customForEach(intList, (Integer i)-> i+2);
		System.out.println("list after for customForEach :"+newIntList);
		
		

	}
	
	
	

}

@FunctionalInterface
interface CustomAddInterface<T>{
	T accept(T t);
	
}
