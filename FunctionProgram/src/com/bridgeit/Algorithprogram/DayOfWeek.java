/******************************************************************************
 *  Purpose: Read Three Inputs And Print Day
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   06-03-2018
 ******************************************************************************/
package com.bridgeit.Algorithprogram;

import com.bridgeit.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter Month");
		int m=utility.inputInteger();
		System.out.println("Enter date");
		int d=utility.inputInteger();
		System.out.println("Enter Year");
		int y =utility.inputInteger();
		Utility.dayOfWeek(m,d,y);

	}

}
