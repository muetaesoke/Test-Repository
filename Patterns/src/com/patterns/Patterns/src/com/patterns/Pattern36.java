package com.patterns;

public class Pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		char ch='A';
		int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j>=(n-1))
				{
				if(i%2==0)
				System.out.print(ch++);
				else
					System.out.print(k++);
				}
				else
					System.out.print(" ");
			}
			ch='A';
			k=1;
			System.out.println();
		}

	}

}
