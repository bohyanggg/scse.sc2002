package lab8;

import java.io.*;

public class WritingTextFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter     fwStream = new FileWriter(    "data.txt" );
		    BufferedWriter bwStream = new BufferedWriter( fwStream  );
		    PrintWriter    pwStream = new PrintWriter(    bwStream  );
		    int num ;
		    for ( num = 0 ; num < 5 ; num++ )
		        pwStream.println( "Number = " + num * 5 );
		      	pwStream.close();
		}
	    catch ( IOException e ) {
	        System.out.println( "IO Error!" + e.getMessage() );
	        e.printStackTrace();
	        System.exit( 0 );
	    }
	}
}
