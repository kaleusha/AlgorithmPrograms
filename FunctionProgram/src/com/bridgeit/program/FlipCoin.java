package com.bridgeit.program;
/*
 *  Purpose: Flip Coin and prints percentage of Heads and Tails.
 *
 *  @author  Usha Balbhim Kale
 *  @version 1.0
 *  @since   05-03-2018

**/
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class FlipCoin {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter How Many Times Flip Coin");
		int number= scanner.nextInt();
		Utility.flipCoin(number);
		scanner.close();
	}
		
	

}
