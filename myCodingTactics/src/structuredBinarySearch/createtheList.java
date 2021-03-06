package structuredBinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class createtheList {
	private static Scanner scanner;
	static List<Integer> enteries = new ArrayList<Integer>();
	
	public static void createList (String[] args) 
	
		{
			
		// enter a row of numbers
		System.out.println("Enter your own amount of numbers to a list. Press 'enter' after every number. ");
		System.out.println("Letters will be ignored. Type 'ready' if you are ready. ");
		
		scanner = new Scanner(System.in);
		String number;	
		int inumber;
		

				do 
				{ 
					number = scanner.nextLine();
					// check if they are numbers instead of other values, add as numbers
					if (isStringInt(number)) 
						{ 
						inumber = Integer.parseInt(number);
						enteries.add(inumber);
						}
					else 
						{
						if (!number.equalsIgnoreCase("ready")) 
						{ System.out.println("Sorry only numbers allowed.");}
						}
				 	}
				while (!number.equalsIgnoreCase("ready"));
				
				System.out.println("thank you; numbers are added and row is made.");
				
				// sort the list
				Collections.sort(enteries);
					
				// show that its correct
				System.out.println("these are the enteries:" + enteries);
										
	}
		
	public static boolean isStringInt(String s)
	{
	    try
	    {
	        Integer.parseInt(s);
	        return true;
	    } catch (NumberFormatException ex)
	    {
	        return false;
	    }
	}
	
}
