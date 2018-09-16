package structuredBinarySearch;

import java.util.Scanner;

public class realBinearysearch {

	private static Scanner scanner;
	static int sNumber;
	static int midvalue;
	static int midindex;
	static int beginindex;
	static int lastindex;
	static boolean found;

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
		lastindex = (createtheList.enteries.size()-1);
		midindex = Math.round(((lastindex+beginindex)/2));
		midvalue = createtheList.enteries.get(midindex);
		
		System.out.println ("last index is: " + lastindex);
		System.out.println ("middle index is: " + midindex);
		System.out.println ("mid value is: " + midvalue);
		
	}
	
	public static void higherlowersearch()
	{
		//check equal
		 System.out.println (midvalue);
		 System.out.println (sNumber);
		 if( midvalue == sNumber ) 
		 { 
		 found = true;
		 // test
		 System.out.println ("mid value found is: " + found);
		 }
		 
		 // check higher or lower and change begin, middle and end
		 else 
		 {
			// found = false;
			// check lower / higher and set values
			if ( sNumber > midvalue ) 
			{
				System.out.println (found);
				System.out.println ("entered number is higher");
				beginindex=midindex;
				midindex = Math.round(((lastindex + beginindex))/2);
				midvalue = createtheList.enteries.get(midindex);
				
				//test
				System.out.println ("last index is: " + lastindex);
				System.out.println ("middle index is: " + midindex);
				System.out.println ("mid value is: " + midvalue);
				// return;
			}  
			else  
			{
				System.out.println ("midvalue is lower");
				// beginindex=0;
				// lastindex = midindex; 
				midindex = Math.round((midindex)/2);
				
				//test
				// System.out.println ("last index is: " + lastindex);
				System.out.println ("middle index is: " + midindex);
				System.out.println ("mid value is: " + midvalue);
				// return;	
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
		do 	higherlowersearch(); while (midvalue != sNumber);
		
		// true not set due to while statement
		 if( midvalue == sNumber ) 		 
		 {  found = true;  		 
		System.out.println ("Equal number " + sNumber + " found in position "  + midindex); }
			
		else  {System.out.println ("Number " + sNumber + " not found in List ");	}
	}
}