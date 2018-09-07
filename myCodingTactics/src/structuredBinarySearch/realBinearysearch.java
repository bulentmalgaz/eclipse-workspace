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
		
	// test
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
		// initial setup - ok
		beginindex = 0;
		lastindex = (createtheList.enteries.size()-1);
		midindex = Math.round(((lastindex+beginindex))/2);
		midvalue = createtheList.enteries.get(midindex);
		
		System.out.println ("last index is: " + lastindex);
		System.out.println ("middle index is: " + midindex);
		System.out.println ("mid value is: " + midvalue);
		
	}
	
	public static void higherlowersearch()
	{
		//check equal
		 if( midvalue == sNumber ) 
		 { 
		 found = true;
		 // test
		 System.out.println ("mid value found is: " + midvalue);
		 }
		 
		 else 
		 {
			// found = false;
			// check lower / higher and set values
			if ( midvalue > sNumber ) 
			{
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
				beginindex=0;
				lastindex = midindex; 
				midindex = Math.round(((lastindex-beginindex))/2);
				
				//test
				System.out.println ("last index is: " + lastindex);
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
					
		if (found) { System.out.println ("Equal number " + sNumber + " found in position "  + midindex); }
			
		else  {System.out.println ("Number " + sNumber + " not found in List ");	}
	}
}