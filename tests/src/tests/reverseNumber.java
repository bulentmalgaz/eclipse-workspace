package tests;

import java.util.Scanner;

public class reverseNumber {
	
	
	private static Scanner scanner1;
	
	// check if the String entered is a Number
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

	public static void main(String[] args) {

		String n;
		String reverse;

		// enter string
		
		while (true) {
			System.out.print("Enter a large number to get the reverse of that number: ");
			scanner1 = new Scanner(System.in);
			n = scanner1.nextLine();
			if (isStringInt(n)) {

				/*
				 * // string to array String[] chr = n.charAt(index)split(""); // [ , a, b, c]
				 */
				// reverse is empty and added with arry
				reverse = "";
				for (int l = n.length() - 1; l >= 0; --l) {
					reverse = reverse.concat(String.valueOf(n.charAt(l)));
				}
				;
				// make it integer
				int getal = Integer.parseInt(reverse);

				System.out.println(getal);
				//break;
			} else
				System.out.println("Please enter valide number.");
		}
	}
	
}
