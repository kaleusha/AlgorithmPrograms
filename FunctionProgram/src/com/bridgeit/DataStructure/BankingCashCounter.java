package com.bridgeit.DataStructure;

import com.bridgeit.utility.Utility;

public class BankingCashCounter
{
	public static void main(String[] args) 
	{
		int ch;
		QueueStructure queue=new QueueStructure();
		Utility utility=new Utility();
		do
		{
		System.out.println("\n1.Deposit \n2.Withdraw \n3.number of element in queue \n4.exit");
		System.out.println("Enter choice");
		 ch=utility.inputInteger();
		switch(ch)
		{
		
		case 1:
			System.out.println("Enter Deposit Amount:");
			int data=utility.inputInteger();
			queue.enqueue(data);
			System.out.println("Total Amount is: ");
			queue.display();
			break;
		
		case 2:
			System.out.println("Enter Withdraw Amount");
			queue.dequeue(utility.inputInteger());
			System.out.println("Remaining Amount Is: ");
			queue.display();
			break;
			
		case 3:
			int j=queue.getSize();
			System.out.println("The number of people in queue: "+j);
			
		case 4:
			System.exit(0);
			
			
		}
		
		}while(ch<4);
	}

}
