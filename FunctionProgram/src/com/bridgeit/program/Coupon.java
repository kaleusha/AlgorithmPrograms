package com.bridgeit.program;
/*

 *  Purpose: Given N distinct Coupon Numbers, how many random numbers do you need to generate that distinct coupon number?
 *  @author  Usha Balbhim Kale
 *  @version 1.0
 *  @since   05-03-2018

*/

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Coupon
{	
	
	public static void main(String[] args)
	{
		
	     Scanner scanner=new Scanner(System.in);
	     System.out.println("Enter number of element");
	     int number=scanner.nextInt();
	     Utility.couponRandom(number);
	     scanner.close();
	     
	}
 }

	
