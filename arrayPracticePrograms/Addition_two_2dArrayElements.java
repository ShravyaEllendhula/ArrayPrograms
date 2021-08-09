package arrayPracticePrograms;

import java.util.Scanner;

public class Addition_two_2dArrayElements 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 1st 2d array");
	System.out.println("enter no of row 1st array:");
	int r1=sc.nextInt();
	System.out.println("enter the no of column 1st array");
	int c1=sc.nextInt();
	int[][] a1=new int[r1][c1];
	for(int i=0;i<=r1-1;i++)
	{
		System.out.println("enter the element for "+i+"row");
		System.out.println("Enter "+c1+" element");
		for(int j=0;j<=c1-1;j++)
		{
			a1[i][j]=sc.nextInt();
		}
	}
	System.out.println("enter no of row 2nd dime array:");
	int r2=sc.nextInt();
	System.out.println("enter no of column in 2nd dime array");
	int c2=sc.nextInt();
	int[][] a2=new int[r2][c2];
	for(int i=0;i<=r2-1;i++)
	{
		System.out.println("enter the element for "+i+"row");
		System.out.println("Enter "+c2+" element");
		for(int j=0;j<=c2-1;j++)
		{
			a1[i][j]=sc.nextInt();
		}
	}
	int [][]a3=new int[r1][c1];
	for(int i=0;i<=r1-1;i++)
	{
		for(int j=0;j<=c1-1;j++)
		{
			 a3[i][j]=a1[i][j]+a2[i][j];
		}
	}
	for(int i=0;i<=r1-1;i++)
	{
		for(int j=0;j<=c1-1;j++)
		{
			System.out.println(a1[i][j]);
		}
	}
	for(int i=0;i<=r2-1;i++)
	{
		for(int j=0;j<=c2-1;j++)
		{
			System.out.println(a2[i][j]);
		}
	}
	for(int i=0;i<=r1-1;i++)
	{
		for(int j=0;j<=c1-1;j++)
		{
			System.out.println(a3[i][j]);
		}
	}
}
}