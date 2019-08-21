package com.patterns;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j+i<=(n-1);j++)
			{
				if(i%2==0)
				System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
		}


	}

}
