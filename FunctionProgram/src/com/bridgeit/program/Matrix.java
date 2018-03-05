package com.bridgeit.program;
/*

 *  Purpose: Read Different Datatypes Input And Print Matrix
 *  @author  Usha Balbhim Kale
 *  @version 1.0
 *  @since   05-03-2018

*/
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Matrix {
	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);
			System.out.println("\n1.Integer \n2.float \n3.boolean ");
			System.out.println("enter your choice");
			int ch = scanner.nextInt();
			System.out.println("Enter How Many Rows");
			int row = scanner.nextInt();
			System.out.println("Enter How Many colums");
			int colum = scanner.nextInt();
			Utility.matrix(ch,row,colum);
}
}
