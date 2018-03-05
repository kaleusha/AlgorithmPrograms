package com.bridgeit.Algorithprogram;
import java.util.Scanner;

public class StaticMethods {
	public static void BinarySearchforInteger(int array[], int scanner)
	{
		System.out.println("Enter Search Element");
		//int search=scanner.nextInt();
		int size=array.length;
		int first=0,last=size-1;
		int middle=0;
		middle=(first+last)/2;
		while(first<last)
		{
			//if(array[middle]<=search)
			{
				
			}
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StaticMethods sm=new StaticMethods();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter How many Elements in Array");
		int number=scanner.nextInt();
		System.out.println("\n1.BS for int \n2.BS for string \n.3.IS for int \n4.IS for string \n5.BubbleSort for int \n6.BubbleSort for string");
		System.out.println("Enter Your Choice");
		int ch=scanner.nextInt();
		int array[]=new int[number];
		System.out.println("Enter Array Elements");
		for(int i=0;i<number;i++)
		{
			array[i]=scanner.nextInt();
		}
		
	//	sm.BinarySearchforInteger(array,scanner);
		scanner.close();

	}

}
