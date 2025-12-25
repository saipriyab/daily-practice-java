package com.practice;

public class Print_All_Substrings {

	public static void main(String[] args) {
	String str="saipriyadarshini";
	
	for(int i=0;i<str.length();i++)
	{
		for(int j=i+1;j<=str.length();j++)
		{
			System.out.println(str.substring(i,j));
		}
	}
	
	System.out.println("***");
	
	for(int i=0;i<str.length();i++)
	{
		for(int j=i;j<str.length();j++)
		{
			System.out.println(str.substring(i,j+1));
		}
	}

	}

}
