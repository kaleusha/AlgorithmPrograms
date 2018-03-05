package com.bridgeit.Algorithprogram;

import java.util.Scanner;

public class FindYourNumber {

	static Scanner s = new Scanner(System.in);
	static int range,count,low,high,middle;
	static String input;
	public void binarySearch(int low, int high, int middle, int count, String input, int num) 
	{
		System.out.println("Is your number:"+middle);
		
		System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
		input=s.next();
       	do
        {
            if (input.equals("high"))
            {
				low= middle;
				count++;
            }
			else if (input.equals("yes"))
            {
				System.out.println("The number you thought was: "+middle);
				int no=count+1;
				System.out.println("It takes "+no+" times to find your exact number");
				break;
            }
			else if(input.equals("low"))
            {
				high=middle;
				count++;
			}
            if(count<num)
            {
				middle=(low+ high+1)/2;
				System.out.println("Is your number "+middle+":");
				input=s.next();
			}
		}
		while(low<=high);
			if (count>num)
			{
				System.out.println("Number not found");
			}
			else
			{
				System.exit(0);
			}
		
	}
	public static void main(String[] args) 
	{
		FindYourNumber number=new FindYourNumber();
		System.out.println("Enter any number: ");
		int num = s.nextInt();
		range = (int) Math.pow(2, num-1);
		System.out.println("Take number between '0' to "+range);
		count=0;
		input=null;
		low=0;
		high=range;
		middle=(low+high/2);
		number.binarySearch(low,high,middle,count,input,num);
		
		
		
	}
	
		

	
}
