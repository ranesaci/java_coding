/**
 * 
 */
package java8.functional;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Sachin.Rane
 * Oct 15, 2019
 */
public class FunctionalInterfaces {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		String str = processFile((BufferedReader br) -> br.readLine() + ">>>"+ br.readLine()+ ">>>"+ br.readLine() );
		System.out.println(str);

	}
	
	//read file using lambada with multiple lines without open close bufferedreader
	
	public static String processFile(BufferedReaderProcessorForMultipleCall brp) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(new File(ClassLoader.getSystemResource("java8/functional/file.txt").getFile())))){
			return brp.process(br);
		}
		
	}

}

@FunctionalInterface
interface BufferedReaderProcessorForMultipleCall{
	String process(BufferedReader br) throws IOException;
}

/*@FunctionalInterface
interface BufferedReaderProcessorForSingleCall{
	String process(BufferedReader br) throws IOException;
}*/
