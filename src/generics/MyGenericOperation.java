/**
 * 
 */
package generics;

/**
 * @author Sachin.Rane Sep 11, 2019
 */
public class MyGenericOperation implements GenericOperation<String, Integer> {
	@Override
	public Integer performOperation(String value) {
		return value.length();
	}
}