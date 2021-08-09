package arrayPracticePrograms;

import java.util.Scanner;

public class IntegerArrayInReverseOrder_1 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			
		}
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}
