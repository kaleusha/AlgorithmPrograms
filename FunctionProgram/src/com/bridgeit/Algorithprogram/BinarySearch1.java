package com.bridgeit.Algorithprogram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class BinarySearch1 
{
	public static int binarysearchstring(String key, String [] words, int a, int b) 
	{
		if(b <= a)
			return -1;

		if(b - a == 1)
			return words[a].equals(key) ? a : 1;

		int pivot = (a + b)/2;
		if(key.compareTo(words[pivot]) < 0) 
		{
			return binarysearchstring(key, words, 0, pivot);
		} 
		else if(key.compareTo(words[pivot]) > 0) 
		{
			return binarysearchstring(key, words, pivot, b);
		}

		return pivot;
	}
	public static void bubblesortString(String input[]) 
	{
        for(int i=0;i<input.length;i++) 
        { 
        	for(int j=i+1; j<input.length;j++)
        	{
        		if(input[i].compareToIgnoreCase(input[j]) > 0) 
        		{ 
        			String temp = input[i]; 
        			input[i] = input[j];
        			input[j] = temp;
        			}
        		} 
        	System.out.println(input[i]);
        	} 
        } 
	
	public static String[] readFile(String filePath) {
		String words[] = {};
		ArrayList<String> lines = new ArrayList<String>();
		String line, temp[] = {};
		BufferedReader bufferedReader;
		FileReader file;
		
		try {
			file = new FileReader(filePath);
			bufferedReader = new BufferedReader(file);
			while ((line = bufferedReader.readLine()) != null) {
				temp = line.split(" ");
				for (int i = 0; i < temp.length; i++)
				{
					lines.add(temp[i]);

				}
			}
			words = lines.toArray(new String[lines.size()]);
			bufferedReader.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return words;
	}
	public static void main(String[] args)
	{
		BinarySearch1 bs=new BinarySearch1();
		String words[]={},search;
		Scanner scanner=new Scanner(System.in);;
		words =BinarySearch1.readFile("/home/bridgeit/Programs/files/FileForBinarySearch");
		System.out.println("Enter word to search");
		search=scanner.next();
		BinarySearch1.bubblesortString(words);
		int index = BinarySearch1.binarysearchstring(search, words, 0, words.length);
		   if(index <0)
		   {
			   System.out.println("Element not found");
		   }
		   else
		   {
			   System.out.println("found at index " + index);
		   }
		   scanner.close();
	}

}
