package tests;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class printTimeDate {

		
	public static void main(String args[]) 	{
		
		
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat currentDateTime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("current time and date is " + currentDateTime.format(cal.getTime()));
         
  	}
}
