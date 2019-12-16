/**
 * 
 */
package java8.collector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Sachin.Rane
 * Dec 3, 2019
 */
public class CustomCollectorVegNonVegDishes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Dish> dishes = Arrays.asList(new Dish("Paneer", true, 100),
										  new Dish("Chicken", false, 200),
										  new Dish("Shevbhaji", true, 120),
										  new Dish("Fish", false, 150));
		//create map of list of dishes whether veg or nonveg using inbuilt collector
		System.out.println("\n create map of list of dishes whether veg or nonveg using inbuilt collector");
		long start = System.currentTimeMillis();
		Map<Boolean, List<Dish>> vegNonVeggies = dishes.stream().collect(Collectors.partitioningBy(Dish::isVeg));
		System.out.println(vegNonVeggies);
		long end = System.currentTimeMillis();
		long timeForInbuiltCollector = end-start;
		
		//create map of list of dishes whether veg or nonveg using custom collector
		System.out.println("\n create map of list of dishes whether veg or nonveg using custom collector");
		/*Map<Boolean, List<Dish>> vegNonVegDishes = dishes
														.stream()
														.collect(
																()-> new HashMap<Boolean, List<Dish>>(){
																	{
																		put(true, new ArrayList<Dish>());
																		put(false, new ArrayList<Dish>());
																	}
																},
																return  (Map<Boolean, List<Dish>> map,  Dish dish)->  map.get(dish.isVeg).add(dish);,
																
																return (Map<Boolean, List<Dish>> map1, Map<Boolean, List<Dish>> map2) -> {
																	map1.get(true).addAll(map2.get(true));
																	map1.get(false).addAll(map2.get(false));
																	return map1;
																};
																);*/
		start = System.currentTimeMillis();
		Map<Boolean, List<Dish>> vegNonVegDishes = dishes.stream().collect(new VegNonVegCustomCollector());
		System.out.println(vegNonVegDishes);
		end = System.currentTimeMillis();
		long timeForCutomCollector = end-start;
		
		System.out.println("\ntimeForInbuiltCollector:"+timeForInbuiltCollector +"\ntimeForCutomCollector:"+timeForCutomCollector);
		
		
		

	}

}

class VegNonVegCustomCollector implements Collector<Dish, Map<Boolean, List<Dish>>, Map<Boolean, List<Dish>>>{

	/* (non-Javadoc)
	 * @see java.util.stream.Collector#supplier()
	 */
	@Override
	public Supplier<Map<Boolean, List<Dish>>> supplier() {
		System.out.println("in supplier");
		return ()-> new HashMap<Boolean, List<Dish>>(){
			{
				put(true, new ArrayList<Dish>());
				put(false, new ArrayList<Dish>());
			}
		};
	}

	/* (non-Javadoc)
	 * @see java.util.stream.Collector#accumulator()
	 */
	@Override
	public BiConsumer<Map<Boolean, List<Dish>>, Dish> accumulator() {
		System.out.println("in accumulator");
		return (Map<Boolean, List<Dish>> map,  Dish dish)-> map.get(dish.isVeg).add(dish);
	}

	/* (non-Javadoc)
	 * @see java.util.stream.Collector#combiner()
	 */
	@Override
	public BinaryOperator<Map<Boolean, List<Dish>>> combiner() {
		System.out.println("in combiner##");
		return (Map<Boolean, List<Dish>> map1, Map<Boolean, List<Dish>> map2) -> {
			map1.get(true).addAll(map2.get(true));
			map1.get(false).addAll(map2.get(false));
			return map1;
		};
	}

	/* (non-Javadoc)
	 * @see java.util.stream.Collector#finisher()
	 */
	@Override
	public Function<Map<Boolean, List<Dish>>, Map<Boolean, List<Dish>>> finisher() {
		// TODO Auto-generated method stub
		System.out.println("in finisher $$$$$$$$$$$$");
		return Function.identity();
	}

	/* (non-Javadoc)
	 * @see java.util.stream.Collector#characteristics()
	 */
	@Override
	public Set<Characteristics> characteristics() {
		// TODO Auto-generated method stub
		System.out.println("in characteristics");
		return Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH));
	}
	
}

class Dish{
	String name;
	boolean isVeg;
	int price;
	
	/**
	 * 
	 */
	public Dish(String name,boolean isVeg,int price) {
		this.name=name;
		this.isVeg=isVeg;
		this.price=price;
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
	 * @return the isVeg
	 */
	public boolean isVeg() {
		return isVeg;
	}

	/**
	 * @param isVeg the isVeg to set
	 */
	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name;
	}
	
	
}
