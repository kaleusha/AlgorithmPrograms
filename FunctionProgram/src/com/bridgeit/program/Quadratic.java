package com.bridgeit.program;
/*

 *  Purpose: Find Out Roots Of Non-negative Numbers 
 *  @author  Usha Balbhim Kale
 *  @version 1.0
 *  @since   05-03-2018

*/
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Quadratic {
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Given Quadratic Equation is:ax^2+bx+c");
		System.out.println("Enter Value of a");
		a=scanner.nextInt();
		System.out.println("Enter Value of b");
		b=scanner.nextInt();
		System.out.println("Enter Value of c");
		c=scanner.nextInt();
		Utility.quadratic(a,b,c);
        scanner.close();
	}
	
	
	
}
