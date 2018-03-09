package com.bridgeit.program;

import com.bridgeit.utility.Utility;

public class Permutation 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter the String: ");
		String str = utility.inputString();
		int n = str.length();
		Utility.permute(str, 0, n-1);
	}


}
