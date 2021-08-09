package arrayPracticePrograms;

import java.util.Scanner;

public class CopyElementsFromOne_Another 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st array size");
		int size=sc.nextInt();
		int[] a1=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<=a1.length-1;i++)
		{
			a1[i]=sc.nextInt();
		}
		int a2[]=new int[a1.length];
		for(int i=0;i<=a1.length-1;i++)
		{
			a2[i]=a1[i];
		}
		System.out.println("displaying array1 elements");
		for(int x:a1)
		{
			System.out.println(x);
		}
		System.out.println("displaying array2 elements");
		for(int y:a2)
		{
			System.out.println(y);
		}
		}

	}

