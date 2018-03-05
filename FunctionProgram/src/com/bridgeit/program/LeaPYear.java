package com.bridgeit.program;
/*

 *  Purpose: Check Entered Year is Leap or Not
 *  @author  Usha Balbhim Kale
 *  @version 1.0
 *  @since   05-03-2018

*/
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class LeaPYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year");

		int year = scanner.nextInt();
		Utility.leapYear(year);
		scanner.close();

	}

}
