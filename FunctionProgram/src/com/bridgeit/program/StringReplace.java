/******************************************************************************
 *  Purpose: Read Given String Replace Substring With User Name
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/

package com.bridgeit.program;

import com.bridgeit.utility.Utility;

public class StringReplace {
		public static void main(String[] args) {

			Utility utility=new Utility();
			System.out.println("Enter user Name");
			String input=utility.toString();
			Utility.stringReplace(input);
			
		}
		
}
