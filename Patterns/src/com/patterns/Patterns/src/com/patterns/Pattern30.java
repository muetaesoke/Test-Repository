package com.patterns;

public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		char ch='A';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j>=i)
				{
				if(i%2==0)
				System.out.print(ch);
				else
					System.out.print('*');
				}
				else
					System.out.print(" ");
			}
			if(i%2==0)
			ch++;
			System.out.println();
		}


	}

}
