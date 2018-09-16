package structuredBinarySearch;

import java.util.Scanner;

public class realBinearysearch {
	
	
	/* from Wikipedia https://en.wikipedia.org/wiki/Binary_search_algorithm
	
	 */

	private static Scanner scanner;
	static int sNumber;
	static int midvalue;
	static int midindex;
	static int beginindex;
	static int beginvalue;
	static int lastindex;
	static int lastvalue;
	static boolean found;
	static boolean end;

	public static void enterSearch()
	{
	// enter your number and convert to int.
		System.out.println("Enter the number you want to find in the list.");
		scanner = new Scanner(System.in);
		String esNumber = scanner.nextLine();
		sNumber = Integer.parseInt(esNumber);
	}
	
	public static void initfindMiddle()
	{
		// initial setup
		beginindex = 0;
		beginvalue = createtheList.enteries.get(0);
		lastindex = (createtheList.enteries.size()-1);
		lastvalue = createtheList.enteries.get(lastindex);
			
		// check boundaries
		if( sNumber > lastvalue) 
		 { found = false; end = true;}
		else if ( sNumber < beginvalue) 
		 { found = false; end = true;}
			// within boundaries
			else { found = false; end = false;}
	}
	
	public static void higherlowersearch()
	{
		
		midindex = midindex/2;
		midvalue = createtheList.enteries.get(midindex);
		
		//test
		System.out.println ("middle index is: " + midindex);
		System.out.println ("mid value is: " + midvalue);
		System.out.println ("searched value is: " + sNumber);
		 
		 
		 if( midvalue == sNumber ) 
		 { 
		 found = true;
		 end = true;
		 // test
		 System.out.println ("mid value found is: " + found);
		 }
		 
		 // check higher or lower and change begin, middle and end
		 else 
		 {
			// found = false; end = false
			// check lower / higher and set values
			if ( sNumber > midvalue ) 
			{
				System.out.println (found);
				System.out.println ("entered number is higher");
				midindex = (midindex * 2);
				// midvalue = createtheList.enteries.get(midindex);
				
				//test
				System.out.println ("middle index after split is: " + midindex);
				System.out.println ("mid value after split is: " + midvalue);
			}  
			else  
			{
				System.out.println ("midvalue is lower");
				// beginindex=0;
				// lastindex = midindex; 
				// midindex = Math.round((midindex)/2);
				midindex = (midindex/2);
				midvalue = createtheList.enteries.get(midindex);
				
				//test
				System.out.println ("middle index after split is: " + midindex);
				System.out.println ("mid value after split is: " + midvalue);
			}
			}
	}
	
	public static void main(String[] args) 
	{	
		createtheList.createList(args); 
		enterSearch();
		searchNumber();
		}
	
	
	public static void searchNumber () 
	{
		// initial setup
		
		
		initfindMiddle();
		do higherlowersearch(); 
		while (end == false); 
	
		// true not set due to while statement
		 if( midvalue == sNumber ) 		 
		 {  found = true;  		 
		System.out.println ("Equal number " + sNumber + " found in position "  + midindex); }
			
		else  {System.out.println ("Number " + sNumber + " not found in List ");	}
	}
}