package com.bridgeit.DataStructure;

import java.util.ArrayList;

import com.bridgeit.utility.Utility;

public class Prime2DArray {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		ArrayList<Integer> al=Utility.primeNumber();
        String strArray[]=new String[al.size()];
        strArray=al.toArray(strArray);
        Integer[] intarray=new Integer[strArray.length];
        int i=0;
        for(String str:strArray){
            intarray[i]=Integer.parseInt(str);
            i++;
        } 
       
		int array[][]=new int[10][30];
		int r,c = 0,j;
		
		for(r=0;r<10;r++)
		{
			for(c=0;c<30;c++)
			{System.out.print("ghk");
				for(j=0;j<array.length;j++)
				{
					System.out.print("...........");
					array[r][c]=intarray[j];
				}
			}
		}System.out.println(array[r][c]);
	}

}
