package com.javaPractice;

public class Age 
{
	
	int iAge = 15;
	
	public Age()
	{
		System.out.println("Inside of Age Constructer");
	}
	
	
	
	

	class Standerd extends Age
	{
		int iStd = 5;
		
		public Standerd()
		{
			System.out.println("Inside of Statnderd Constructer");
		}
		
		
		
		
		
	}
	public static void main(String args[])
	{
		Age aobj = new Age();
		
		Age.Standerd sobj = aobj.new Standerd();
		
		
		
		System.out.println("My Age is :"+sobj.iAge);
		System.out.println("I Am in :"+sobj.iStd+"th Standerd");
		
			
		
		
	}
	
	

}
