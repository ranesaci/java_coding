/**
 * 
 */
package designpattterns;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/**
 * @author Sachin.Rane
 * Sep 6, 2019
 */
public class StategyPattern {

	@Test
	public void test() throws IOException {
		Logging logging = new ConsoleLogging();
		LoggingClient loggingClient = new LoggingClient(logging);
		loggingClient.clientLogging("Helllo");
		
		logging = new FileLogging(File.createTempFile("testFile", "txt"));
		loggingClient = new LoggingClient(logging);
		loggingClient.clientLogging("Helllo");
		
		
	}
	
	@Test
	public void testMock() {
		
		Logging mockLogging = mock(Logging.class);
		LoggingClient loggingClient = new LoggingClient(mockLogging);
		
		loggingClient.clientLogging("hello1");
		loggingClient.clientLogging("hello2");
		
		verify(mockLogging, times(1)).write("hello2");
		
		
	}
	

}

interface Logging{
	public void write(String str);
}

class ConsoleLogging implements Logging{

	/* (non-Javadoc)
	 * @see designpattterns.Logging#write(java.lang.String)
	 */
	@Override
	public void write(String str) {
		System.out.println("Console Logging:"+str);
		
	}
	
	
}

class FileLogging implements Logging{
	
	File file = null;
	
	/**
	 * 
	 */
	public FileLogging(final File  file) {
		this.file=file;
	}

	/* (non-Javadoc)
	 * @see designpattterns.Logging#write(java.lang.String)
	 */
	@Override
	public void write(String str) {
		try {
			FileWriter fw = new FileWriter(file);
			System.out.println("writing to file:"+file.getAbsolutePath() +" : message="+str);
			fw.write("FileLogging:"+str);
			fw.flush();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}

class LoggingClient{
	
	Logging logging;
	/**
	 * 
	 */
	public LoggingClient(Logging logging) {
		this.logging=logging;
	}
	
	public void clientLogging(String message) {
		
		logging.write(message);
	}
}


