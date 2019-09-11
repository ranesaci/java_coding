/**
 * 
 */
package generics;

/**
 * @author Sachin.Rane
 * Sep 11, 2019
 */
public interface GenericOperation<T1, T2> {

	/**
	 * @param value
	 * @return
	 */
	T2 performOperation(T1 value);

}
