package general;

public class IncrementDecrement {
	
	static int a = 1111;
	
	static {
		a = a-- - --a;
		
		//(1111 - 1109) --> 2
	}
	
	{
		a = a++ + ++a;
	}

	public static void main(String[] args) {
		
		System.out.println(a);
	

	}

}
