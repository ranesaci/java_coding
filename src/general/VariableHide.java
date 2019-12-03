/**
 * 
 */
package general;

/**
 * @author Sachin.Rane
 * Sep 20, 2019
 */
public class VariableHide {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A aref = new A();
		A bref = new B();
		
		System.out.println("aref:"+aref.value);
		System.out.println("bref:"+bref.value);
		System.out.println("aref from method:"+aref.getValue());
		System.out.println("bref from method:"+bref.getValue());

	}
	
	

}

class A{
	Integer value = 10;
	
	public Integer getValue() {
		return value;
	}
	
	
}

class B extends A{
	Integer value = 20;
	
	public Integer getValue() {
		return value;
	}
}
