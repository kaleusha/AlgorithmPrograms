/******************************************************************************
 *  Purpose: Read Start And End Time And Print Elapsed Time 
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
package com.bridgeit.program;

import com.bridgeit.utility.Utility;

public class StopWatch {
	

	
		public static void main(String[] args) {
			
			Utility utility=new Utility();
			System.out.println("Press 1 to start the time: ");
			int a = utility.inputInteger();
			Utility.start();
			System.out.println("Press 2 to stop the time: ");
			int b = utility.inputInteger();
			Utility.stop();
			long l=Utility.getElapsedTime();
			System.out.println("Total Time Elapsed(in millisec) is:"+l);
			System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
		
			
		}
}
