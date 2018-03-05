package com.bridgeit.program;
/*

 *  Purpose: Read Two Inputs Start And Calculate The Elapse Time
 *  @author  Usha Balbhim Kale
 *  @version 1.0
 *  @since   05-03-2018

*/
import java.sql.Timestamp;

public class StopWatch2 {
	long startTime;
	long stopTime;
	
	public void start() 
	{
	    startTime = System.currentTimeMillis();
	   
	    System.out.println("Start time is:"+startTime);
	}
    public void stop() 
	{
	    stopTime = System.currentTimeMillis();
	   
	    System.out.println("Stop time is:"+stopTime);
    }
    
	public void elapseTime()
	{
		long elapseTimes=startTime-stopTime;
		System.out.println("elapseTime:"+elapseTimes);
	}
	public static void main(String[] args) {
		
		
		StopWatch sw=new StopWatch();
		sw.start();
	  
	    sw.stop();
	    sw.elapseTime();
	}

}
