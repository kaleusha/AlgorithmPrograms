package com.bridgeit.program;

import java.util.Scanner;
public class StringReplace {
		public static void main(String[] args) {

			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter user Name");
			String input=scanner.nextLine();
			String str="Hello <<UserName>>, How are you? ";
			if(input.length()>3)
			{
				System.out.println("valid string");
				String replaceString=str.replace("<<UserName>>",input);
				System.out.println(replaceString);
			}
			
			else
				System.out.println("enter greter than 3 char in string");
			
			scanner.close();
		}
		
}
