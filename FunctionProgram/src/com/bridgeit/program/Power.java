package com.bridgeit.program;
/*

 *  Purpose: Caluculate The Power Of two
 *  @author  Usha Balbhim Kale
 *  @version 1.0
 *  @since   05-03-2018

*/
import java.util.Scanner;
import com.bridgeit.utility.*;

public class Power {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of times you need power ");
		 int number=scanner.nextInt();
		 Utility.power(number);
		 
		 
     
	

}
}