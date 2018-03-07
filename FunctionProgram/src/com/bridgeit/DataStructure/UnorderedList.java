package com.bridgeit.DataStructure;

import java.util.LinkedList;
import java.util.Scanner;

import javax.xml.soap.Node;

import com.bridgeit.utility.Utility;

public class UnorderedList{
	
	public static void main(String[] args)
	{
		//String words[]={};
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		String ReadPath ="/home/bridgeit/Programs/files/FileForBinarySearch";
		String words[]=utility.readFile(ReadPath);
		LinkedList<String> list = new LinkedList<String>();
		String tempArray[]= {};
		for(int i=0;i<words.length;i++)
		{
			list.add(tempArray[i]);
			
		}System.out.println(tempArray);
		System.out.println("Enter Word To Search");
		String search=scanner.nextLine();
		/*if(list.search(search))
		{
			System.out.println("Word is present in the linked list");
			list.remove(search);
		}
		else
		{
			Utility.insert(words, ReadPath);
			System.out.println("Word added");
			
		}
		list.printlist();
		}*/

	}

}
