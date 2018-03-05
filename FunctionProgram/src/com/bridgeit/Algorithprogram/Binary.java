package com.bridgeit.Algorithprogram;

import java.util.Scanner;


public class Binary {
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Decimal number");
		int number=scanner.nextInt();
		System.out.println("Binary Number of "+number+ " is: ");
		int[] binary=new int[8];
		int index=0;
		int i;
		while(number>0)
		{
			binary[index++]=number%2;
			number=number/2;
		}
		for( i=index-1;i>=1;i--)
		{
			System.out.print(binary[i]);
		}
       //int sizeOfArray=binary.length;
       //System.out.println(+sizeOfArray);
       //if(sizeOfArray>8)
      // {
    	  // binary[0]='0';
      // }
      // System.out.println("8 bit number is:"+binary);
      
       scanner.close();
	}

}
