package arrayPracticePrograms;

import java.util.Scanner;

public class SumOfAll 
{
	public static void main(String[] args)
	{
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		int size=s.nextInt();
		int a[]	=new int[size];
		System.out.println("enter array elemnts");
		for(int i=0;i<=size-1;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<=size-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum is: "+sum);
	}
	
}
