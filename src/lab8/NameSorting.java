package lab8;

import java.io.*;

public class NameSorting {

public static void main(String[] args) {
		
		try {
			BufferedReader brstream = new BufferedReader(new FileReader("src/lab8/names.txt"));
			PrintWriter pwStreamSmall = new PrintWriter(new BufferedWriter (new FileWriter("src/lab8/small.txt")));
			PrintWriter pwStreamLarge = new PrintWriter(new BufferedWriter (new FileWriter("src/lab8/large.txt")));
			
			String fileInput = brstream.readLine();
			while(fileInput != null) {
				if (fileInput.length() <= 5) {
					pwStreamSmall.write(fileInput + "\n");
				}
				else {
					pwStreamLarge.write(fileInput + "\n");
				}
				fileInput = brstream.readLine();
			}
			brstream.close();
			pwStreamSmall.close();
			pwStreamLarge.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("Error opening the input file!" + e.getMessage());
			System.exit(0);
		} 
		catch (IOException e) {
			System.out.println("IO Error!" + e.getMessage());
			System.exit(0);
		}
		
		System.out.println("Program completed, exiting...");
		System.exit(0);
		
	}


}
