/**
 * 
 */
package general;

/**
 * @author Sachin.Rane
 * Dec 16, 2019
 */
public class ThreadDemo {
	public  int X=0;
	
	public  void main1() {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<10;i++){
					X++;
					System.out.println("add:"+X);
					
				}
				
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<10;i++){
					System.out.println("print:"+X);
				}
				
			}
			
		});
		
		t1.start();
		t2.start();
	}
	
	public static void main(String[] args) {
		ThreadDemo demo = new ThreadDemo();
		demo.main1();
	}

}
