package com.bridgeit.DataStructure;

import java.util.ArrayList;

import com.bridgeit.utility.Utility;

public class Prime2DArray {
	
		
	

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		ArrayList<Integer> al=Utility.primeNumber();
		 int intarray[]=new int[al.size()];
		 //strArray=al.toArray(strArray);
		 int array[][]=new int[10][30];
	
		int count=0;

	        for(int i=0;i<10;i++)
	        {
	            for(int j=0;j<30;j++)
	            {
	            	//if((array[i][j]>='0' && array[i][j]<=))
	            	{
	            		
	            	
	                //if(count==intarray.length) break;
	                array[i][j]=intarray[count];
	            System.out.printf("a[%d][%d]= %d\n",i,j,array[i][j]);
	            count++;

	            	}}
	        }
	   
	    System.out.println("Count is "+count);
		 
			}
	    
	}


