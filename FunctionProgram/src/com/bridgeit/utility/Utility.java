package com.bridgeit.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Utility {

	Scanner scanner;
	public Utility()
	{
		scanner=new Scanner(System.in);
	}

	// INPUT STRING
	public String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}
	// INPUT Integer
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * Purpose:Print Leap Year or Not
	 * 
	 * @param year
	 */
	public static void leapYear(int year) {

		if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.println(+year+" Is Leap Year");
			}else
			{
				System.out.println(+year+" Is Not Leap Year");
			}
		}else
		{
			if(year%4==0)
			{
				System.out.println(+year+" Is Leap Year");
			}else
			{
				System.out.println(+year+" Is Not Leap Year");
			}
		}
	}

	/**
	 * Purpose:Print Power Of 2
	 * 
	 * @param number
	 */
	public static void power(int number)
	{
		int mult=2;
		for(int i=0;i<number;i++)
		{
			if(i==0)
			{
				System.out.println("2^0=1");
			}
			else

			{
				int j=1;
				j=j*mult;
				System.out.println("2^"+i+ "="+j);
				mult=mult*2;
			}
		}

	}

	/**
	 * Purpose:Print Leap Year or Not
	 * @param stake
	 * @param goal
	 * @param trials
	 */
	public static void grambler(int stake,int goal,int trials)
	{
		int lbets = 0;
		int wins =0;
		for(int i=0; i<trials;i++)
		{
			int cash = stake;
			while(cash > 0 && cash < goal)
			{
				lbets++;
				if(Math.random() < 0.5)
				{
					cash++;
				}
				else
				{
					cash--;/*


					 */
				}
				if(cash == goal)
				{
					wins++;
				}
			}
		}
		System.out.println(wins + " Wins off " +trials);
		int won = 100*wins/trials;
		System.out.println("Percentage of won: " +won);
		System.out.println("Avg bets = " + 1.0 * lbets /trials);
	}


	/**
	 * Purpose:Print Distinct Coupon Number
	 * @param number
	 */
	public static void couponRandom(int number)
	{
		int array[]=new int[number];

		Random rand = new Random();
		//System.out.println("Random Elements are:");
		for(int i=0;i<array.length;i++)
		{
			// Generate Random Elements 
			int r=rand.nextInt(number);
			array[i]=r;

			for(int j=0;j<i;j++)
			{
				if(array[i]==array[j])
				{
					i--;
					break;
				}
			}
		}
		System.out.println("unique Elements Are:");
		//Print Unique Elements 
		for(int i=0;i<number;i++)
		{
			System.out.println(array[i]);
		}
	}


	/**
	 * Purpose:Print Last Harmonic Number
	 * @param number
	 */
	public static void harmonic(int number)
	{
		double result = 0.0;
		if(number==0){
			System.out.println("   ");

		}
		else
		{
			for(int i=1;i<=number;i++)
			{

				result = result + ( 1.0 / i);
			}
		}



		System.out.println("Harmonic Series is "+result);
	}



	/**
	 * Purpose:Print Percentage Of Head And Tail
	 * @param number
	 */
	public static void flipCoin(int number)
	{
		int tailcount=0;
		int headcount=0;
		float array[]=new float[number];
		for(int i=0;i<number;i++)
		{
			array[i]=(float) Math.random();//Generate Random Elements
			System.out.println(array[i]);

		}
		//Count Head and Tail
		for(int i=0;i<number;i++)	
		{
			if(array[i]<0.5)
			{
				tailcount++;
			}
			else
			{
				headcount++;

			}
		}
		System.out.println("The number of tails is"+tailcount);
		System.out.println("The number of head us"+headcount);
		//Calculate Percentage of Head And Tail 
		int tailper =tailcount*100/number ;
		int headper = headcount*100/number;
		System.out.println("The percentage of tail is"+tailper);
		System.out.println("The percentage of head is"+headper);
	}



	/**
	 * Purpose:Print Odd Prime Factors Of Any Number
	 * @param number
	 */
	public static void primeFactor(int number)
	{
		System.out.print("Prime Factors are : " );
		for (int i = 2; i <= number; i++)
		{

			while (number % i == 0)
			{
				System.out.print(i + " ");
				number = number / i;
			}
		}
	}


	/**
	 * Purpose:Print Number Of Triples Found
	 * @param array
	 * @param number
	 */
	public static void sumOf3Int(int[] array,int number)
	{
		int count=0;

		boolean found=false;
		System.out.print("Triple Elements is: ");
		for(int i=0;i<number-2;i++)
		{
			for(int j=i+1;j<number-1;j++)
			{
				for(int k=j+1;k<number;k++)
				{

					if(array[i]+array[j]+array[k]==0)
					{
						System.out.println(+array[i]);
						System.out.println(+array[j]);
						System.out.println(+array[k]);
						found=true;
						count++;
					}

				}

			}
		}
		{
			if(found==false)
				System.out.println("Triple not exist");
		}
		System.out.print("Triples Are: "+count);
		System.out.println(" ");
	}


	/**
	 * Purpose:Print Roots Of Given Equation
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void quadratic(int a,int b,int c)
	{
		int delta = b*b - 4*a*c;
		if(delta>0)
		{
			System.out.println("Roots Are Unequal");
			double root1=(-b + Math.sqrt(delta))/(2*a);
			double root2=(-b - Math.sqrt(delta))/(2*a);
			System.out.println("Roots are:"+root1);
			System.out.println("Roots are:"+root2);

		}else if(delta==0)
		{
			System.out.println("Roots Are Equal");
			double root1=(-b + Math.sqrt(delta))/(2*a);
			System.out.println("Roots are:"+root1);
		}else
		{
			System.out.println(" Roots Are Imaginary ");
		}
	}


	/**
	 * Purpose:Print Matrix 
	 * @param ch
	 * @param row
	 * @param colum
	 */
	public static void matrix(int ch,int row,int colum )
	{
		Scanner scanner = new Scanner(System.in);
		switch(ch)
		{
		case 1:

			int array[][]=new int[row][colum];
			System.out.println("Enter Array Element:");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<colum;j++)
				{
					array[i][j]=scanner.nextInt();
				}
			}
			System.out.println("Matrix Elements Are:");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<colum;j++)
				{
					System.out.print(array[i][j]);

				}System.out.println("  ");
			}break;

		case 2:
			float array1[][]=new float[row][colum];
			System.out.println("Enter Array Element:");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<colum;j++)
				{
					array1[i][j]=scanner.nextFloat();
				}
			}
			System.out.println("Matrix Elements Are:");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<colum;j++)
				{
					System.out.print(array1[i][j]);

				}System.out.println("  ");
			}break;

		case 3:
			boolean array2[][]=new boolean[row][colum];
			System.out.println("Enter Array Element:");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<colum;j++)
				{
					array2[i][j]=scanner.nextBoolean();
				}
			}
			System.out.println("Matrix Elements Are:");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<colum;j++)
				{
					System.out.print(array2[i][j]);

				}System.out.println("  ");
			}break;


		}scanner.close();

	}

	/**
	 * Purpose:prints the wind chill
	 * @param t
	 * @param v
	 * @param w
	 */
	public static void windChill(double t, double v) {
		// TODO Auto-generated method stub
		double w;
		if(t>50 && (v>3&&v<120))
		{
			w=35.74+0.6215*t+(0.4275*t-35.75)* Math.pow(v,0.16);
			System.out.println("Temprature: "+t);
			System.out.println("speed: "+v);
			System.out.println("windchill: "+w);
		}else
		{
			System.out.println("Invalid Temprature or Speed");
		}
	}



	/**
	 * Purpose:prints the Elapsed Time
	 * 
	 */
	public static long START_TIMER;
	public static long STOP_TIMER;
	// used to start the stopwatch 
	public static void start()
	{
		long START_TIMER=System.currentTimeMillis();
		System.out.println("Start Time is: "+START_TIMER);
	}


	// used to stop the stopwatch 
	public static void stop()
	{
		long STOP_TIMER = System.currentTimeMillis();
		System.out.println("Stop Time is: " +STOP_TIMER);
	}


	//return time between stoptimer and starttimer
	public static long getElapsedTime()
	{
		long ELAPSED = STOP_TIMER - START_TIMER;
		return ELAPSED;
	}

	/**
	 * Purpose:print Prime Numbers Between 0 To 1000
	 * @return 
	 * 
	 */
	public static ArrayList primeNumber() {

		ArrayList list=new ArrayList();
		for(int i=2; i<=1000; i++)
		{
			int flag=0;
			for(int j=2; j<=i/2; j++)
			{
				if(i%j== 0)
				{
					flag= 1;
					break;
				}


			}

			if(flag== 0)
			{
				System.out.print(i+ " ");
				list.add(Integer.toString(i));
			}
			
	}
		return list;

		
	}

	/**
	 * Purpose: Print the String with User Name 
	 * @param input
	 */
	public static void stringReplace(String input) {
		// TODO Auto-generated method stub
		String str="Hello <<UserName>>, How are you? ";
		if(input.length()>3)
		{
			System.out.println("valid string");
			String replaceString=str.replace("<<UserName>>",input);
			System.out.println(replaceString);
		}

		else
			System.out.println("enter greter than 3 char in string");


	}

	/**
	 * Purpose: Print Two Strings Are Anagram Or Not
	 * @param string1
	 * @param string2
	 * @return 
	 */
	public static boolean anagram(String string1, String string2)
	{
		boolean status=true;
		char ch[]=string1.toCharArray();
		Arrays.sort(ch);
		if(string1.length()!=string2.length())
		{
			status=false;
		}
		else
		{
			char ArrayS1[]=string1.toCharArray();
			Arrays.sort(ArrayS1);
			char ArrayS2[]=string2.toCharArray();
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);  

		}
		if (status) 
		{  
			
			return true;
		} else 
		{  
			  
			return false;
		}
		 

	}


	/**
	 * Purpose:Print Sorted Array
	 * @param arr
	 * @param number
	 */
	public void bubbleSort(int arr[],int number)
	{
		int temp;
		int n = arr.length;
		for (int i=0; i<n-1; ++i)
		{
			for(int j=i+1;j<n-2;j++)
			{
				if (arr[i] > arr[j])
				{

					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}

		}
	}
	public void printArray(int arr[],int number)
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	/**
	 * Purpose:Print Day
	 * @param m
	 * @param d
	 * @param y
	 */
	public static void dayOfWeek(int m, int d, int y) {
		// TODO Auto-generated method stub
		int y0,x,m0,d0;
		y0=y-(14-m)/12;
		x=y0+y0/4-y0/100+y0/400;
		m0=m+12*((14-m)/12)-2;

		d0 =  Math.floorMod((d + x + 31*m0 / 12), 7);
		String weekDay;

		switch(d0) 
		{  

		case 0 :
			weekDay = " Sunday ";
			System.out.println(weekDay);
			break;


		case 1:  
			weekDay = " Monday ";
			System.out.println(weekDay);
			break;


		case 2:  
			weekDay = " Tuesday ";
			System.out.println(weekDay);
			break;


		case 3:  
			weekDay = " Wednesday ";
			System.out.println(weekDay);
			break;


		case 4:  
			weekDay = " Thursday ";
			System.out.println(weekDay);
			break;


		case 5:  
			weekDay = " Friday ";
			System.out.println(weekDay);
			break;


		case 6:  
			weekDay = " Saturday "; 
			System.out.println(weekDay);
			break;




		}
	}


	/**
	 * Purpose: Find number
	 * @param low
	 * @param high
	 * @param middle
	 * @param count
	 * @param num
	 */
	public static void binarySearch(int low, int high, int middle, int count, int num) 
	{
		Utility utility=new Utility();
		String input=null;;
		System.out.println("Is your number:"+middle);

		System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
		input=utility.inputString();
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
				input=utility.inputString();
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


	/**
	 * Purpose:Print Sorted order
	 * @param arr
	 * @param number
	 */
	public static void insertionSort(int arr[],int number)
	{
		int n = arr.length;
		for (int i=1; i<n; ++i)
		{
			int key = arr[i];
			int j = i-1;

			while (j>=0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}


	/**
	 * Purpose:Print Sorted order
	 * @param array
	 * @param low
	 * @param high
	 */
	public static void mergesort(int array[],int low,int high)
	{
		int n = high - low;		
		if(n<=1)
			return;
		int mid = low + n/2;
		mergesort(array,low,mid);
		mergesort(array, mid, high);
		int temp[] = new int[n];
		int i=low,j=mid;	
		for(int k=0;k<n;k++)
		{
			if(i==mid)
			{
				temp[k] = array[j++];
			}
			else if(j == high)
			{
				temp[k] = array[i++];
			}
			else if(array[j] < array[i])
			{
				temp[k] = array[j++];
			}
			else
			{
				temp[k] = array[i++];
			}
		}
		for (int k = 0; k < n; k++) 
			array[low + k] = temp[k];   

	}

	public static void monthlyPayment(int P, double R, int Y) {
		// TODO Auto-generated method stub
		int n=12*Y;
		double r=R/(12*100);
		double payment=(P*r)/(1-Math.pow((1+r), (-1)));
		System.out.println("Monthly Payment Is: "+payment );

	}

	/**
	 * Purpose:
	 * @param strArray
	 */
	public static void extendPrime(String[] strArray) {
		// TODO Auto-generated method stub
		System.out.println("Check prime number That Are Anagarm");
        for(int i=0;i<strArray.length;i++)
        {
      	  for(int j=i+1;j<strArray.length;j++)
      	  {
      		  
      		  if(Utility.anagram(strArray[i], strArray[j]))
      		  {
      			 System.out.println(strArray[i]+ " -> " +strArray[j]);
      		  }
      	  }
        }
        System.out.println("Check Prime Number That Are pallindrom");
        for(int i=0;i<strArray.length;i++)
        {
      	  String temp= new StringBuffer(strArray[i]).reverse().toString();
      	  if(temp.equals(strArray[i]))
      	  {
      		  System.out.println(strArray[i]+ " ");
      	  }
        }
		
	}





}


