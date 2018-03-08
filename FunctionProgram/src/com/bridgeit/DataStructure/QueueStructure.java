package com.bridgeit.DataStructure;

public class QueueStructure 
{
	 public int size=20,front,rear,top=-1;
	
	 public int array[]=new int[size];
	 
	//constructor
	public QueueStructure()
	{
        front = -1;
        rear = -1;
       
	}

	public void enqueue(int data) 
	{
       /// Node node = new Node(data, null);
        if (rear<0)
        {
        	rear++;
        	System.out.println("...");
        	
        	array[rear]=data;
        	front=0;
        }else
        	
        {
        	System.out.println("...");
        	rear++;
           array[rear]=data;
           System.out.println("Push operation done !");
        }
        size++;
     
        
		
		
	}

	public void dequeue(int data) 
	{
		if(front<rear)
		   size--;
			data= array[front];
		   front = front + 1;
			 
		System.out.println("Pop operation done !");  
		 
		
	}

	public void display() 
	{
		int sum=0;
		 if (rear<size) {  
			   //System.out.println("Elements in Queue : ");  
			   for (int i = front+1; i <= rear; i++) 
			   { 
				   sum=array[i]+sum; 
				   //System.out.println(array[i]);
			     
			   
			   }   
			  }   System.out.println(sum);
		 
		
	}

    public boolean isEmpty()
    {
    	if(front < 0 || front > rear) 
    	      return true;
    	   else
    	      return false;
    }   
    
    public int getSize()
    {
    	int i=0,count=0;
        while(array[i]!=0)
        {
        	count++;
        	i++;
        }
        return count;
    }  
    
    public boolean isFull()
    {
    	if(rear==size)
    		return true;
    	else
    		return false;
    }




}