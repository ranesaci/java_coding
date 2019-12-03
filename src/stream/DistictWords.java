/**
 * 
 */
package stream;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Sachin.Rane
 * Nov 18, 2019
 */
public class DistictWords {

	/**
	 * @param args
	 * @throws URISyntaxException 
	 */
	public static void main(String[] args) throws URISyntaxException {
		
		try {
			Stream<String> lines = Files.lines(Paths.get(ClassLoader.getSystemResource("stream/distinct.txt").toURI()));
			
			long uniqueWords = lines.flatMap(s -> Arrays.stream(s.split(" "))).distinct().count();
			
			
			System.out.println(uniqueWords);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
