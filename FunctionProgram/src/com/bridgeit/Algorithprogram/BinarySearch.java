package com.bridgeit.Algorithprogram;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch
{
	public static void bubblesortString(String Array[]) 
	{
		for(int i=0;i<Array.length;i++) 
		{ 
			for(int j=i+1; j<Array.length;j++)
			{ 
				if(Array[i].compareToIgnoreCase(Array[j]) > 0) 
				{ 
					String temp = Array[i];
					Array[i] = Array[j];
					Array[j] = temp;
					} 
				}
			System.out.println(Array[i]);
			} 
		} 
	public static void main(String[] args) throws IOException 
	{
		BinarySearch bs=new BinarySearch();
		     Scanner scanner=new Scanner(System.in);
			  File f;
			  
			  f=new File("myfile.txt");
			  if(!f.exists()){
			  f.createNewFile();
			  System.out.println("New file \"myfile.txt\" has been created to the current directory");
			  }
			  System.out.println(new File(".").getAbsoluteFile());
			  FileInputStream fstream = new FileInputStream("myfile.txt");
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  String line=br.readLine();
			  String Array[] = {};
			  bs.bubblesortString(Array);
			  System.out.println(line);
			 String temp[] = {};
			
			  ArrayList<String> list=new ArrayList<String>();
			 
			 
			  while ((line = br.readLine()) != null) {
					temp = line.split(" ");
					for (int i = 0; i < temp.length; i++)
					{
						list.add(temp[i]);

					}
				}
			  Array= list.toArray(new String[list.size()]);
			  
			  br.close();
			
	}
			  
			 
	
}
