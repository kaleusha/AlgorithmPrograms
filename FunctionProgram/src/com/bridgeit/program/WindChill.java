package com.bridgeit.program;
/*

 *  Purpose: Find Out Roots Of Non-negative Numbers 
 *  @author  Usha Balbhim Kale
 *  @version 1.0
 *  @since   05-03-2018

*/
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class WindChill {
	public static void main(String[] args)
	{
		double t,v;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Temprature");
		t=scanner.nextDouble();
		System.out.println("Enter wind speed");
		v=scanner.nextDouble();
		Utility.windChill(t,v);
		scanner.close();
		
	}

}
