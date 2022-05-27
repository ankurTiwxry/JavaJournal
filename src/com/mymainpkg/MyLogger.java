package com.mymainpkg;

// TODO :: i want to make a package for this class

public class MyLogger {
	
	public void log(String message)	{
		System.out.println(message + "\n");
	}
	
	public void logInline(String message)	{
		System.out.println(message);
	}
	
	public void logSpace()	{
		System.out.println("\n\n");
	}
}
