
// prevent interference
// package structuredBinarySearch;


import java.util.Scanner;

public class findUserInput {

	private static Scanner scanner;
	static int sNumber;
	static int midvalue;
	static int midindex;
	static int lastindex;
	// static int currentNumber;
	
	
	public static void enterSearch()
	{
	// enter your number and convert to int.
		System.out.println("Enter the number you want to find in the list.");
		scanner = new Scanner(System.in);
		String esNumber = scanner.nextLine();
		sNumber = Integer.parseInt(esNumber);
	}
	
	public static void findMiddle()
	{
	// midvalue is the middle of an total index rounded upwards
	lastindex = (createtheList.enteries.size()-1);
	midindex = Math.round(lastindex/2);
	midvalue = createtheList.enteries.get(midindex);
	
	// test
	System.out.println ("last index is: " + lastindex);
	System.out.println ("middle index is: " + midindex);
	System.out.println ("mid value is: " + midvalue);
	}

	
	public static boolean higher()
	//check if midvalue is higher/equal (true) or lower (false) than the number to search
	{
		
	if ( sNumber >= midvalue ) 
	{
		System.out.println ("entered number is equal or higher");
		return true;
	}  
	else 
	{
		System.out.println ("midvalue is lower");
		return false;	
	}
	}
	
	
	
	public static void main(String[] args) 
	{	
		createtheList.createList(args); 
		enterSearch();
		findMiddle();
		searchNumber();
		}
	
	
	public static void searchNumber () 
	{
		boolean found = false;
		int i;
		int currentNumber; 
		
		//check higher from middle
						
		if (higher()) 
		{
		for (i = (midindex); i <= (lastindex) ; i++)
			{
			currentNumber = createtheList.enteries.get(i);
			if (currentNumber == sNumber)
		 	{
			found = true;
			break;
		 	}	
			}

		}
		
		//check lower from middle
		else  
		{
			for (i = (midindex); i > -1 ; i--)
			{
			currentNumber = createtheList.enteries.get(i);
			 if (currentNumber == sNumber)
			 {
				// found
				 found = true;
				 break;
			 }		
			}
		}
		
		if (found) 
			{ System.out.println ("Equal number " + sNumber + " found in position "  + i);
			}
			
		else  System.out.println ("Number " + sNumber + " not found in List ");
				}
}



