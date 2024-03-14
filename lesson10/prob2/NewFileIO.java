package lesson10.prob2;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;



public class NewFileIO {
	private static final Logger LOG = Logger.getLogger(NewFileIO.class.getName());
	public final static String FILE_LOCATION = "/Users/daja/dev/backend/java/miu-mpp-track/lesson10/prob2";
	public final static String FILE_NAME = "output.txt";
	public final static String TO_PRINT = "This is the string to print to file.";

	void writeText(String filename, String text) {
		File file = new File(FILE_LOCATION, filename);

		try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
			writer.print(text);
		} catch(IOException e) {
			LOG.warning("IOException attempting to write a file: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		NewFileIO old = new NewFileIO();
	    old.writeText(FILE_NAME, TO_PRINT);
		
	}

}
