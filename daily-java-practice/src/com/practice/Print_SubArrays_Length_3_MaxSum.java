package com.practice;

public class Print_SubArrays_Length_3_MaxSum {
	
	public static void main(String args[])
	{
		int arr[]= {5,9,1,8,7};
		int j=0,temp=0,max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length-3+1;i++)
		{
			j=i+3-1;
			temp=0;
			for(int k=i;k<=j;k++)
			{
				temp+=arr[k];
			}
			max=Math.max(max, temp);
		}
		System.out.println(max);
	}

}
