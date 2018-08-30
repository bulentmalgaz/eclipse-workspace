package tests;

import java.util.Scanner;

public class factoralCalculation {

	private static Scanner scanner1;

	public static void main(String[] args) {
		
		System.out.println("Enter a number to get the factoralnumber");
		scanner1 = new Scanner(System.in);
		String number = scanner1.nextLine();
		int basenumber = Integer.parseInt(number);		
		
		if (basenumber < 0 ) {  
			System.out.println("not negative please");
		}
		
		else
		{
		int factoralNumber = basenumber * basenumber;
		System.out.println(factoralNumber);
	}
	}

}
