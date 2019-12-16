/**
 * 
 */
package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Sachin.Rane
 * Dec 4, 2019
 */
public class MapToObject {
	
	static String str = "Sachin nina rane, pune";
	final public static void main(String[] args) throws CloneNotSupportedException {
		/*Stream<Character> chars = IntStream.range(0, str.length()).mapToObj(str::charAt);
		chars.forEach(System.out::print);
		*/
		
		/*HashMap<String, String> map = new HashMap<String,String>();
		String key1 = "key1";
		map.put(key1, "value1");
		String key2 = key1.clone();
		map.put(key2, "value2");
		System.out.println(map);
		*/
		/*
		Employee e = new Employee();
		
		Employee e2 = e.clone();
		System.out.println(e);
		System.out.println(e2);*/
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		addAnoter(list,"Sachin");
		
	}
	/**
	 * @param list
	 * @param string
	 */
	private static void addAnoter(List list, String string) {
		list.add(string);
		for (Object object : list) {
			System.out.println(object);
			
		}
		
	}

}

class Employee implements Cloneable {
	String name;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Employee clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Employee) super.clone();
	}
	
}
