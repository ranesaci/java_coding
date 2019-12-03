/**
 * 
 */

/**
 * @author Sachin.Rane
 * Nov 12, 2019
 */
public class RecursiveStringRotate {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		String str = "Sachin Nina Rane, Pune ";
		
		/*while(true){
			continueRotate(str);
			Thread.sleep(200);
		}
		*/
		
		while(true) {
			str = recurse(str);
		}
		
		

	}

	/**
	 * @param str
	 */
	private static void continueRotate(String str) {
		for (int i = 0; i < str.length(); i++) {
			if(str.length()-1==i) {
				System.out.println();
			}
			System.out.print(str.charAt(i));
			
		}
	}
	
	public static  String recurse(String str) throws InterruptedException {
		for (int i = 0; i < str.length(); i++) {
			Thread.sleep(50);
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		return new String(str.substring(1)+str.charAt(0));
		
	}

}
