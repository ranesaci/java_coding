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
public class PipelineShortCircuit {

	public static void main(String[] args) {

		List<Employee> emps = Arrays.asList(new Employee("Sachin", "Pune"),
				new Employee("Sachin1", "Mumbai1"),
				new Employee("Sachin2", "Pune1"),
				new Employee("Sachin3", "MalkaPur"),
				new Employee("Sachin4", "Jalgaon"));
		
		emps.forEach(e -> {System.out.println(e.getName());});//iterate using foreach
		
		List<String> cities =  emps.stream()
					.filter(e -> { System.out.println("Filter Processing :"+e.getName());
						return e.getCity().contains("Pu"); })
					.limit(2) //this value shortcircuit and stop procesing furher records if value mtches
					.map(Employee::getCity)
					.collect(toList());
		cities.forEach(System.out::println);//iterate using foreach
		
		
	}

}

class Employee{
	String name, city;
	
	public Employee(String name, String city) {
		this.name=name;
		this.city=city;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
}
