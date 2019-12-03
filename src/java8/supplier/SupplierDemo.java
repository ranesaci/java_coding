/**
 * 
 */
package java8.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author Sachin.Rane
 * Nov 28, 2019
 */
public class SupplierDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int val = getValue(ArrayList<Integer>::new);
		System.out.println(val);
		
		System.out.println("using old syntax");
		
		Supplier<List<Integer>> sup = ArrayList::new;
		int val1 = getValue(sup);
		System.out.println(val1);
		
		System.out.println("\n Random value supplier");
		double randVal = getRandValue(Math::random);
		System.out.println(randVal);
		
		Function<String, Integer> fun = (String s)-> s.length();
		Sqaure sq = (int s)-> s*s;
		
		
		System.out.println(fun.apply("Sachin"));
		System.out.println("calling square  inteface");
		System.out.println(sq.calculate(7));
	}

	/**
	 * @param object
	 * @return
	 */
	private static double getRandValue(Supplier<Double> randomSupplier) {
		return randomSupplier.get();
	}

	/**
	 * @param object
	 * @return
	 */
	private static int getValue(Supplier<List<Integer>> supplier) {
		List<Integer> list = supplier.get();
		System.out.println(list.size());
		list.add(123);
		return list.size();
	}
	
	

}

@FunctionalInterface
interface Sqaure{
	int calculate(int val);
}
