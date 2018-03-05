package com.bridgeit.program;
/*

 *  Purpose: Read Two Integers x and y and prints the Euclidean distance
 *  @author  Usha Balbhim Kale
 *  @version 1.0
 *  @since   05-03-2018

*/

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) 
	{
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter Value of x "); 
		 int x=scanner.nextInt();
		 System.out.println("Enter Value of y "); 
		 int y=scanner.nextInt();
		 double distance;
		 distance=Math.sqrt((x*x)+(y*y));
		 System.out.println(distance);
		 
		 
	}

}
