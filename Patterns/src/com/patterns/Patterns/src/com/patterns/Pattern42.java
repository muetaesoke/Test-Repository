package com.patterns;

public class Pattern42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j>=i)
					System.out.print(k++%10);
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}
