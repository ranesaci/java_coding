/**
 * 
 */
package java8.collector;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.summarizingInt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Sachin.Rane
 * Nov 19, 2019
 */
public class Collects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Transaction> list = Arrays.asList(new Transaction("RS","Rupees", 10),
												new Transaction("DL","Dollar", 20),
												new Transaction("EU","Euro", 30),
												new Transaction("PO","Pound", 80),
												new Transaction("RS","Rupees", 60),
												new Transaction("PO","Pound", 70),
												new Transaction("PO","Pound", 100)
												);
		
		
		IntSummaryStatistics intSummaryStatistics = list.stream().collect(summarizingInt(Transaction::getValue));
		System.out.println(intSummaryStatistics);
		
		System.out.println("Joining *******************");
		String joining = list.stream().map(Transaction::getName).collect(joining(","));
		System.out.println(joining);
		System.out.println("\n collect maxBy***********");
		Map<String, Optional<Transaction>> map = list.stream()
				.collect(groupingBy(Transaction::getCurrency,maxBy(Comparator.comparingInt(Transaction::getValue))));
		
		System.out.println(map);
		
		System.out.println("\n collect maxBy for collect and then***********");
		Map<String, Transaction> map1= list.stream()
				.collect(groupingBy(Transaction::getCurrency,Collectors.collectingAndThen(maxBy(Comparator.comparingInt(Transaction::getValue)), Optional::get)));
		
		System.out.println(map1);
		
	}

}

class Transaction{
	String currency;
	String name;
	int value;
	
	/**
	 * 
	 */
	public Transaction(String currency,String name, int value) {
		this.currency=currency;
		this.name=name;
		this.value= value;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
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
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.name;
	}
}
