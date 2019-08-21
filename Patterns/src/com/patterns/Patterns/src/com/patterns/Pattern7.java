package com.patterns;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j+i<=(n-1);j++)
			{
				System.out.print(i+1);
			}
			System.out.println();
		}


	}

}
