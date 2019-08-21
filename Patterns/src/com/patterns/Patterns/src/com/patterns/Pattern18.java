package com.patterns;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		char ch='A';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j>=i)
				System.out.print(ch);
				else
					System.out.print(" ");
			}
			ch++;
			System.out.println();
		}


	}

}
