package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class largestNumber {
	
	
	private static Scanner scanner1;

	public static void main(String args[]) 	{
	
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i=1; i<4; i++){
			System.out.println("Enter a number ");
			scanner1 = new Scanner(System.in);
			String numbers = scanner1.nextLine();
			arrayList.add(Integer.parseInt(numbers));
		}
        
		Integer i = Collections.max(arrayList);
        System.out.println("the highest number entered is " + i);
		
}
}