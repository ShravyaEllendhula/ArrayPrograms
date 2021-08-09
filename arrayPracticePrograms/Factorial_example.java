package arrayPracticePrograms;

import java.util.Scanner;

public class Factorial_example 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size =sc.nextInt();
		int [] a1=new int[size];
		System.out.println("enter the array elements....");
		for(int i=0;i<=a1.length-1;i++)
		{
			a1[i]=sc.nextInt();
		}
		int factorial=1;
		for(int i=a1.length;i>=1;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Array elements are:");
		for(int x:a1)
		{
			System.out.println(x+" ");
		}
		System.out.println();
		System.out.println("output : "+(factorial-1));
	}
}
