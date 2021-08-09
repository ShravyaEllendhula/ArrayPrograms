package arrayPracticePrograms;

import java.util.Scanner;

public class Largest_Smallest
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
		System.out.println("finding the length of an array elements...");
		int small=a1[0];
		int big=a1[0];
		for(int i=1;i<=a1.length-1;i++)
		{
			int tempsmall=a1[i];
		}
	}
}
