package tests;

import java.util.Scanner;

public class switchNumbers {

	
	private static Scanner scanner2;
	private static Scanner scanner1;

	public static void main(String args[]) 	{
	String number1, number2, x;
	
	System.out.println("Enter a number ");
	scanner1 = new Scanner(System.in);
	number1 = scanner1.nextLine();
	System.out.println("Enter a second number ");
	scanner2 = new Scanner(System.in);
	number2 = scanner2.nextLine();
	
	x = number1; 
	number1 = number2;
	number2 = x;		
	
	System.out.println("the numbers will be switched");
	System.out.println("first input is now your last " + number1);
	System.out.println("last input is now is now your first " + number2);
	}
}
