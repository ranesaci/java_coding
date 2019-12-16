/**
 * 
 */
package java8.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;

/**
 * @author Sachin.Rane
 * Dec 9, 2019
 */
@Authors(value = { @Author (name="Sachin"), @Author(name="rane")})
public class DateTimeFormatterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate d1 = LocalDate.of(2019, 12, 9);
		
		String formattedDate = d1.format(dateTimeFormatter);
		System.out.println(formattedDate);
		System.out.println(d1.parse(formattedDate,dateTimeFormatter));
		
		/*Child c1 = new Child();
		c1.setName("Sachin");
		Parent p = new Parent();
		
		
		
		Child c = (Child) p;
		System.out.println(c.getName());
*/
		
		DoubleUnaryOperator op = (x) -> x*9/5+32;
		double result = op.applyAsDouble(30);
		System.out.println(result);
		
		
		Author[] authors = DateTimeFormatterDemo.class.getAnnotationsByType(Author.class);
		Arrays.asList(authors).stream().forEach(a-> System.out.println(a.name()));
	}
	
	

}

class Parent{
	
}

class Child extends Parent{
	String name;

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
	
}

@interface Authors{
	Author[] value();
}
