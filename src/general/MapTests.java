/**
 * 
 */
package general;

import static org.mockito.Matchers.intThat;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

/**
 * @author Sachin.Rane
 * Sep 5, 2019
 */
public class MapTests {
	
	@Test
	public void testConcurrentHashmap() throws InterruptedException {
		Integer integer   = Integer.valueOf(12);
		System.out.println(integer);
		
		
	
	Map<String, String> map = new ConcurrentHashMap<>();
	
	map.put("sachin", "rane");
	map.put("sachin1", "rane1");
	map.put("sachin1", "rane1");
	
	Thread t1 = new Thread(new MyThread(map),"t1");
	Thread t2 = new Thread(new MyThread2(map),"t2");
	
	t1.start();
	t2.start();
	
	Thread.sleep(20000);
	
	
	}
	
}

class MyThread implements Runnable{
	
	/**
	 * 
	 */
	Map<String, String> map = null;
	
	public MyThread(Map<String, String> map) {
		this.map=map;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Thread: "+Thread.currentThread().getName()+":"+map.toString());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
}

class MyThread2 implements Runnable{
	
	/**
	 * 
	 */
	Map<String, String> map = null;
	
	public MyThread2(Map<String, String> map) {
		this.map=map;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(500);
				
				map.put("sachin1"+i, "rane"+i);
				System.out.println("Thread: "+Thread.currentThread().getName()+" Write:"+map.toString());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}


