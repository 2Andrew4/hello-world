/** 
* used for one sign input
* ascii-table from highest 255 to 032 whitespace with gaust-summary for the numbervalue
* computed also unicode-cases for character
* by me Andreas Bahr
* website@luna-net,org
**/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class GaustTaker extends Object {
	public static double n, used;


		public static void main (String [] args)
	{  
		try {
		BufferedReader infile = new BufferedReader (new InputStreamReader (System.in));
          System.out.println ("One character from ascii-table for computing please");
	
					used = infile.read(); // a single character = 16 bits
		n = used;			
		}
		 //  catch(Exception e){
	     //  e.printStackTrace(); }
	         catch(IOException ioe) {
		  System.out.println ("since "+ioe);}			
		
		double ergebnis = 0;
		double op = 1;		
		for (ergebnis=ergebnis+op; ergebnis>=n; ergebnis++) // increment integer 16 b case converted for double
	{
	ergebnis++;	// to 1
	}

	 do ergebnis=((n+ergebnis)*(n/2));
	 while (ergebnis==1);
	
		if ( n <= 256) {
	System.out.println(" ascii table.nr. " +n+ " computed " + ergebnis);
	}
	if ( n >= 255 && n <= 260) {
	System.out.println(" one of four to complete " +n+ " computed " + ergebnis);
	}
	if ( n >= 260) {
	System.out.println("Out of range from ascii-table");
	System.out.println("integer with double-worthy "+n+" computed " + ergebnis+ " ascii-table worthy with gaust-loop in higher comming for your input");	
	}
	// synchronized void dialogQuest
	 while (ergebnis==2);
	
	System.out.println("Hello World! e.g. incremented or decremented anythink");
		
	} 
}
