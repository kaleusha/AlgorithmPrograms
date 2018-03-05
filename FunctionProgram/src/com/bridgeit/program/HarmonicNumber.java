package com.bridgeit.program;
/*

 *  Purpose: Read N Harmonic Number And  Print the Nth Harmonic Value.
 *  @author  Usha Balbhim Kale
 *  @version 1.0
 *  @since   05-03-2018

*/
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter How Many Times Print");
		int number=scanner.nextInt();
		Utility.harmonic(number);
		scanner.close();
	}	
}
