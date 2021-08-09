package arrayPracticePrograms;

import java.util.Scanner;

public class ArrayInBelowOrder 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of row:");
		int r=sc.nextInt();
		System.out.println("enter the no of column");
		int c=sc.nextInt();
		int[][] a1=new int[r][c];
		for(int i=0;i<=r-1;i++)
		{
			System.out.println("enter the element for "+i+"row");
			System.out.println("Enter "+c+" element");
			for(int j=0;j<=c-1;j++)
			{
				a1[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<=r-1;i++)
		{
		if(i%2==0)
		{
			for(int j=0;j<=c-1;j++) 
			{
				System.out.print(a1[i][j]+" ");
			}
		}
		else
		{
			for(int k=c-1;k>=0;k--)
			{
				System.out.print(a1[i][k]+" ");
			}
		}
		}
	}
}
