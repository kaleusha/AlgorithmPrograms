package com.bridgeit.program;
/*

 *  Purpose: Read Input And Print Factors Of That Number
 *  @author  Usha Balbhim Kale
 *  @version 1.0
 *  @since   05-03-2018

*/
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class PrimeFactors {
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any Number to find Prime Factors "); 
		int number=scanner.nextInt();
		
		Utility.primeFactor(number);
		 
		       // if (number < 1) System.out.println(number);
    }
		 
	

}
